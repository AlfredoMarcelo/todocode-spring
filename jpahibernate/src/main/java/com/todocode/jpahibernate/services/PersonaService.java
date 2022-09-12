package com.todocode.jpahibernate.services;


import com.todocode.jpahibernate.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonaService {
   Object crearPersona(Persona persona);
   List<Persona> listarPersonas();
   Optional<Persona> buscarPorId(Long id);
   void delete(Persona persona);
}
