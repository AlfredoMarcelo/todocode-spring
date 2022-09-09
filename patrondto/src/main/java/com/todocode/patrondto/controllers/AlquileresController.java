package com.todocode.patrondto.controllers;

import com.todocode.patrondto.models.Inquilino;
import com.todocode.patrondto.models.Propiedad;
import com.todocode.patrondto.models.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlquileresController {

  @GetMapping("/alquileres/{id}")
  @ResponseBody
  public PropiedadDTO devolverPropiedad(@PathVariable Long id){
    Inquilino inquilino = new Inquilino(1L,"5555555-5","Marcos", "Alonzo","agricultor");
    Propiedad propiedad = new Propiedad(12L,"Hotel","Cavo 1434",500.0,750.5);

    PropiedadDTO propiedadDTO = new PropiedadDTO();

    propiedadDTO.setIdPropiedad(propiedad.getIdPropiedad());
    propiedadDTO.setTipo(propiedad.getTipoPropiedad());
    propiedadDTO.setDireccion(propiedad.getDireccion());
    propiedadDTO.setValorAlquiler(propiedad.getValorAlquiler());
    propiedadDTO.setNombreInquilino(inquilino.getNombre());
    propiedadDTO.setApellidoInquilino(inquilino.getApellido());
    return propiedadDTO;
  }

}
