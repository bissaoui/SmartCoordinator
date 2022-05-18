package smart.book.cordinator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import smart.book.cordinator.model.SmartBook;
import smart.book.cordinator.model.userScannedsb;
import smart.book.cordinator.repository.UserRepository;
import smart.book.cordinator.repository.userScannerdsbRepository;

import java.util.List;

@RestController
@RequestMapping("/userScannedsb")
public class userScannedsbController {

    @Autowired
    private userScannerdsbRepository scannerdsbRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{username}/{ids}")
    public void addSBtoU(@PathVariable("username") String username , @PathVariable("ids") Long ids){
        userScannedsb p = new userScannedsb();
        p.setUId(userRepository.findUserByUsername(username).getId());
        p.setSIdSmart(ids);
        scannerdsbRepository.save(p);
        System.out.println(username+"+"+ids);
    }

}
