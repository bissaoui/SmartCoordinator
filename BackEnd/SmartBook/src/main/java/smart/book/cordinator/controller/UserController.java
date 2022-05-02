package smart.book.cordinator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smart.book.cordinator.model.User;
import smart.book.cordinator.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User Get(@PathVariable("id") Long id){
        return userRepository.findById(id).get();
    }

    @PostMapping
    public void Ajoute(@RequestBody User user){
         userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
         userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void Update(@PathVariable("id") Long id , @RequestBody User user){
        User u = new User();
        u=userRepository.findById(id).get();
        if (user.getNom()!=null)
            u.setNom(user.getNom());
        if (user.getPrenom()!=null)
         u.setPrenom(user.getPrenom());
        if (user.getUsername()!=null)
            u.setUsername(user.getUsername());
        if (user.getDdn()!=null)
            u.setDdn(user.getDdn());
        userRepository.save(u);



    }




}
