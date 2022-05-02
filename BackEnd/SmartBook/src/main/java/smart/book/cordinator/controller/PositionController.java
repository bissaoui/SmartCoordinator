package smart.book.cordinator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smart.book.cordinator.model.Position;
import smart.book.cordinator.model.User;
import smart.book.cordinator.repository.PositionRepository;

import java.util.List;
@RestController
@RequestMapping("Positions")
public class PositionController {

    @Autowired
    private PositionRepository positionRepository;



    @GetMapping("/{id}")
    public Position Get(@PathVariable("id") Long id){
        return positionRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void Ajouter(@RequestBody Position position){
        positionRepository.save(position);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        positionRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void Update(@PathVariable("id") Long id , @RequestBody Position position){
        Position u = new Position();
        u=positionRepository.findById(id).get();
            u.setLatitude(position.getLatitude());
            u.setLongitude(position.getLongitude());
            u.setPays(position.getPays());
            u.setVille(position.getVille());
            u.setImage(position.getImage());
        positionRepository.save(u);

    }

}
