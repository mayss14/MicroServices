package com.demo.Voiture;


import com.demo.Voiture.Model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



public interface ClientService {

        @GetMapping("/clients/{id}")
        Client clientById(@PathVariable("id") Long clientId);



}
