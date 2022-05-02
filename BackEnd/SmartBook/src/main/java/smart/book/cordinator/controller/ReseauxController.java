package smart.book.cordinator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smart.book.cordinator.model.Position;
import smart.book.cordinator.model.ReseauxSociaux;
import smart.book.cordinator.repository.PositionRepository;
import smart.book.cordinator.repository.ReseauxSociauxRepository;

@RestController
@RequestMapping("Reseaux")
public class ReseauxController {

    @Autowired
    private ReseauxSociauxRepository reseauxSociauxRepository;



    @GetMapping("/{id}")
    public ReseauxSociaux Get(@PathVariable("id") Long id){
        return reseauxSociauxRepository.findById(id).orElse(null);
    }

    @PostMapping
    public void Ajouter(@RequestBody ReseauxSociaux reseauxSociaux){
        reseauxSociauxRepository.save(reseauxSociaux);
    }

    @DeleteMapping("/{id}")
    public void Delete(@PathVariable("id") Long id){
        reseauxSociauxRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public void Update(@PathVariable("id") Long id , @RequestBody ReseauxSociaux reseauxSociaux){
        ReseauxSociaux u = new ReseauxSociaux();
        u=reseauxSociauxRepository.findById(id).get();
        u.setFacebook(reseauxSociaux.getFacebook());
        u.setInstagram(reseauxSociaux.getInstagram());
        u.setWhatsapp(reseauxSociaux.getWhatsapp());
        u.setLinkedin(reseauxSociaux.getLinkedin());
        u.setTwitter(reseauxSociaux.getTwitter());
        u.setSnapchat(reseauxSociaux.getSnapchat());
        reseauxSociauxRepository.save(u);

    }



}
