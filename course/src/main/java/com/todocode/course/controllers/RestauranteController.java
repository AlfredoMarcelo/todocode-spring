package com.todocode.course.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RestauranteController {


  @GetMapping("/restaurante/{id}")
  public ResponseEntity<String> seleccionMenu(@PathVariable int id){
    ArrayList<String> platos = new ArrayList<>();
    platos.add("Lasagna");
    platos.add("porotos");
    platos.add("Lentejas");
    platos.add("Garbanzos");
    platos.add("Mote con carne");
    return ResponseEntity.status(HttpStatus.OK).body("Tu comida seleccionada es: " + platos.get(id));
  }
}
