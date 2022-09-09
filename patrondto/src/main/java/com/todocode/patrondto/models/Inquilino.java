package com.todocode.patrondto.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Inquilino {
  private Long idInquilino;
  private String dni;
  private String nombre;
  private String apellido;
  private String profesion;
}
