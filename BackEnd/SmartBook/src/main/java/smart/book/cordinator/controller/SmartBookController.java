package smart.book.cordinator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smart.book.cordinator.model.SmartBook;
import smart.book.cordinator.repository.SmartBookRepository;

import java.util.List;

@RestController
@RequestMapping("SmartBook")
public class SmartBookController {
    @Autowired
    private SmartBookRepository smartBookRepository;

    @GetMapping("/{id}")
    public SmartBook Get(@PathVariable("id") Long id){
        return smartBookRepository.findById(id).orElse(null);
    }
    @GetMapping
    public List<SmartBook> GetAll(){
        return smartBookRepository.findAll();
    }
    @GetMapping("u/{id}")

    public List<SmartBook> GetSmartofUser(@PathVariable("id") Long id){
        return smartBookRepository.findSmartBookByUser_Id(id);
    }

    @PostMapping
    public SmartBook Ajouter(@RequestBody SmartBook smartBook){
        return smartBookRepository.save(smartBook);
     }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        smartBookRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void Update(@PathVariable("id") Long id , @RequestBody SmartBook position){


    }

}
