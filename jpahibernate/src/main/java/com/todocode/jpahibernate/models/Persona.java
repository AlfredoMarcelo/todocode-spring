package com.todocode.jpahibernate.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String apellido;
  private int edad;
  @OneToMany
  private List<Mascota> mascota;

}
