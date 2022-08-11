package pl.trollsystems.inOK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.trollsystems.inOK.repository.Mkg1DataRepository;

@RestController
@RequestMapping("/mkg1data")
public class Mkg1DataController {
    private Mkg1DataRepository mkg1DataRepository;

    @Autowired
    public Mkg1DataController(Mkg1DataRepository mkg1DataRepository) {
        this.mkg1DataRepository = mkg1DataRepository;
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
//           mkg1DataRepository.findAll();

        return ResponseEntity.ok().body(mkg1DataRepository.findAll());
    }
}
