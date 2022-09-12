package com.todocode.jpahibernate.services;

import com.todocode.jpahibernate.models.Persona;
import com.todocode.jpahibernate.repositories.PersonaRepository;

import java.util.List;
import java.util.Optional;

public class PersonaServiceImp implements PersonaService{

  private final PersonaRepository personaRepository;

  public PersonaServiceImp(PersonaRepository personaRepository) {
    this.personaRepository = personaRepository;
  }

  @Override
  public Object crearPersona(Persona persona) {
    return personaRepository.save(persona);
  }

  @Override
  public List<Persona> listarPersonas() {
    return personaRepository.findAll();
  }

  @Override
  public Optional<Persona> buscarPorId(Long id) {
    return personaRepository.findById(id);
  }

  @Override
  public void delete(Persona persona) {
    personaRepository.delete(persona);
  }
}
