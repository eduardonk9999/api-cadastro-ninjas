package com.ninja.controller;

import com.ninja.model.ninjas;
import com.ninja.service.ninjasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller é para

@RestController
@RequestMapping("/api/ninjas") // PARA MAPEAR NOSSA API E DIRECIONAR OS NOSSOS CONTROLLER
public class ninjasController {

    @Autowired
    private ninjasService service;

    // Mapeamento ai oó
    // /api/ninjas/addninja
    @PostMapping("/addninja")
    public ResponseEntity<ninjas> addNinjas(@RequestBody ninjas ninja) {
        ninjas newNinja = service.addNinjas(ninja);
        return new ResponseEntity<>(newNinja, HttpStatus.CREATED);

    }
}
