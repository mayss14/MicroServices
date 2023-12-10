package com.demo.Voiture.Controller;

import com.demo.Voiture.Model.Voiture;
import com.demo.Voiture.Repository.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {

    @Autowired
    VoitureRepo vr;
    @GetMapping("/voitures")
    public List findAll()
    {
        return vr.findAll();
    }

    @GetMapping("/voitures/{id}")
    public Voiture findById(@PathVariable int id) throws Exception
    {
        return vr.findById(id).orElseThrow(() -> new Exception("Voiture Inexistante"));
    }


}


