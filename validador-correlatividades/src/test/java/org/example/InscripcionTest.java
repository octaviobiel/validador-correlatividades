package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InscripcionTest {

  @Test
  public void puedeInscribirseAMateria(){
    Materia unaMateria = new Materia();
    unaMateria.setNombre("Algoritmos");
    unaMateria.setAprobada(true);
    Materia otraMateria = new Materia();
    otraMateria.setNombre("Paradigmas");
    otraMateria.setAprobada(true);
    Materia materiaAInscribirse = new Materia();
    materiaAInscribirse.setNombre("Disenio");
    materiaAInscribirse.setCorrelativas(List.of("Algoritmos", "Paradigmas"));

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);
    materias.add(otraMateria);

    Alumno alumno = new Alumno();
    alumno.setMaterias(materias);

    Inscripcion inscripcion = new Inscripcion();

    Assertions.assertTrue(inscripcion.materiaAprobada(alumno.getNombreMateriasAprobadas(), materiaAInscribirse));
  }


  @Test
  public void noPuedeInscribirseAMateria(){
    Materia unaMateria = new Materia();
    unaMateria.setNombre("Algoritmos");
    unaMateria.setAprobada(true);
    Materia otraMateria = new Materia();
    otraMateria.setNombre("Paradigmas");
    otraMateria.setAprobada(false);
    Materia materiaAInscribirse = new Materia();
    materiaAInscribirse.setNombre("Disenio");
    materiaAInscribirse.setCorrelativas(List.of("Algoritmos", "Paradigmas"));

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);
    materias.add(otraMateria);

    Alumno alumno = new Alumno();
    alumno.setMaterias(materias);

    Inscripcion inscripcion = new Inscripcion();

    Assertions.assertFalse(inscripcion.materiaAprobada(alumno.getNombreMateriasAprobadas(), materiaAInscribirse));
  }

  @Test
  public void puedeInscribirseAVariasMaterias(){
    Materia unaMateria = new Materia();
    unaMateria.setNombre("Algoritmos");
    unaMateria.setAprobada(true);
    Materia otraMateria = new Materia();
    otraMateria.setNombre("AnalisisUno");
    otraMateria.setAprobada(true);

    Materia unaMateriaAInscribirse = new Materia();
    unaMateriaAInscribirse.setNombre("Sintaxis");
    unaMateriaAInscribirse.setCorrelativas(List.of("Algoritmos"));
    Materia otraMateriaAInscribirse = new Materia();
    otraMateriaAInscribirse.setNombre("AnalisisDos");
    otraMateriaAInscribirse.setCorrelativas(List.of("AnalisisUno"));

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);
    materias.add(otraMateria);

    Alumno alumno = new Alumno();
    alumno.setMaterias(materias);

    Inscripcion inscripcion = new Inscripcion();

    Assertions.assertTrue(inscripcion.aprobada(alumno, List.of(unaMateriaAInscribirse, otraMateriaAInscribirse)));
  }

  @Test
  public void noPuedeInscribirseAVariasMaterias(){
    Materia unaMateria = new Materia();
    unaMateria.setNombre("Algoritmos");
    unaMateria.setAprobada(true);

    Materia unaMateriaAInscribirse = new Materia();
    unaMateriaAInscribirse.setNombre("Sintaxis");
    unaMateriaAInscribirse.setCorrelativas(List.of("Algoritmos"));
    Materia otraMateriaAInscribirse = new Materia();
    otraMateriaAInscribirse.setNombre("AnalisisDos");
    otraMateriaAInscribirse.setCorrelativas(List.of("AnalisisUno"));

    List<Materia> materias = new ArrayList<>();
    materias.add(unaMateria);

    Alumno alumno = new Alumno();
    alumno.setMaterias(materias);

    Inscripcion inscripcion = new Inscripcion();

    Assertions.assertFalse(inscripcion.aprobada(alumno, List.of(unaMateriaAInscribirse, otraMateriaAInscribirse)));
  }
}