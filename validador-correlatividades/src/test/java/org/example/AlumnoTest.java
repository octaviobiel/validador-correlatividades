package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlumnoTest {

  @Test
  public void obtenerNombreMateriasAprobadas(){
    Materia unaMateria = new Materia();
    unaMateria.setNombre("Algoritmos");
    unaMateria.setAprobada(true);
    Materia otraMateria = new Materia();
    otraMateria.setNombre("Paradigmas");
    otraMateria.setAprobada(false);

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);
    materias.add(otraMateria);

    Alumno alumno = new Alumno();
    alumno.setMaterias(materias);

    Assertions.assertEquals(List.of("Algoritmos"), alumno.getNombreMateriasAprobadas());
  }

}