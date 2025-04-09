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
    Materia otraMateria = new Materia();
    otraMateria.setNombre("Paradigmas");

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);
    materias.add(otraMateria);

    Alumno alumno = new Alumno();
    alumno.setMateriasAprobadas(materias);

    Assertions.assertEquals(List.of("Algoritmos", "Paradigmas"), alumno.getNombreMateriasAprobadas());
  }

}