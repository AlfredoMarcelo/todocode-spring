package com.todocode.patrondto.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropiedadDTO {
  private Long idPropiedad;
  private String tipo;
  private String direccion;
  private Double valorAlquiler;
  private String nombreInquilino;
  private String apellidoInquilino;

}
