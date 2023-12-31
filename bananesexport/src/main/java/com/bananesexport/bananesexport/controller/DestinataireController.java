package com.bananesexport.bananesexport.controller;

import com.bananesexport.bananesexport.model.Destinataire;
import com.bananesexport.bananesexport.repository.DestinataireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/destinataires")
public class DestinataireController {



    @Autowired
    private DestinataireRepository destinataireRepository;



    @PostMapping
    public Destinataire createDestinataire(@RequestBody Destinataire destinataire) {
        return destinataireRepository.save(destinataire);
    }

    @GetMapping
    public Iterable<Destinataire> getDestinataire() {
        return destinataireRepository.findAll();
    }

    @PutMapping("/{id}")
    public Destinataire updateDestinataire(@PathVariable String id, @RequestBody Destinataire destinataire) {
        return destinataireRepository.save(destinataire);
    }

    @DeleteMapping("/{id}")
    public void deleteDestinataire(@PathVariable Long id) {
        destinataireRepository.deleteById(id);
    }
}
