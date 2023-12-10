package com.demo.Client.Controller;

import com.demo.Client.Model.Client;
import com.demo.Client.Repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientRepo cr;

    @GetMapping("/clients")
    public List findAll()
    {
        return cr.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client findById(@PathVariable int id) throws Exception
    {
        return cr.findById(id).orElseThrow(() -> new Exception("Client Inexistant"));
    }
}
