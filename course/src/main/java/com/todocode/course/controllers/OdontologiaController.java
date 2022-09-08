package com.todocode.course.controllers;

import com.todocode.course.models.Paciente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

@RestController
public class OdontologiaController {



  public ArrayList<Paciente> pacientes(){
    //Se instancian 3 pacientes
    Paciente paciente1 = new Paciente("Manfred", LocalDate.of(2017,1,3));
    Paciente paciente2 = new Paciente("Manchas", LocalDate.of(2000,2,20));
    Paciente paciente3 = new Paciente("Chocolo", LocalDate.of(2009,2,22));
    // arraylist que contendra los 3 pacientes
    ArrayList<Paciente> listaPacientes = new ArrayList<>();
    listaPacientes.add(paciente1);
    listaPacientes.add(paciente2);
    listaPacientes.add(paciente3);
    //el metodo retorna el arraylist con los pacientes
    return listaPacientes;
  }


  @GetMapping("/odontologia")
  public ResponseEntity<ArrayList<Paciente>> listaPacientes(){
    ArrayList<Paciente> listaPaciente = pacientes();
    return ResponseEntity.status(HttpStatus.OK).body(listaPaciente);
  }

  @GetMapping("/odontologia/menores")
  public ResponseEntity<ArrayList<Paciente>> pacientesMenores(){
    ArrayList<Paciente> listaPaciente = pacientes();
    ArrayList<Paciente> pacientesMenoresEdad = new ArrayList<>();
    LocalDate fechaHoy = LocalDate.now();
    for(Paciente paciente:listaPaciente){
      Period edad = Period.between(fechaHoy,paciente.getNacimiento());
      System.out.println("edad.getYears() = " + edad.getYears()*-1);
      if((edad.getYears()*-1) < 18){
        pacientesMenoresEdad.add(paciente);
      }
    }
    return ResponseEntity.status(HttpStatus.OK).body(pacientesMenoresEdad);
  }
}
