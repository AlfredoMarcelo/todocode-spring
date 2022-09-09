package com.todocode.patrondto.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Propiedad {
  private Long idPropiedad;
  private String tipoPropiedad;
  private String direccion;
  private Double metrosCuadrados;
  private Double valorAlquiler;
}
