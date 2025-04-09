package org.example;

import java.util.HashSet;
import java.util.List;

public class Inscripcion {

  public boolean aprobada(Alumno alumno, List<Materia> materias){
    List<String> materiasAlumno = alumno.getNombreMateriasAprobadas();

    return materias.stream().allMatch(materia -> materiaAprobada(materiasAlumno, materia));
  }

  public boolean materiaAprobada(List<String> materiasAlumno, Materia materiaInscripcion){
    List<String> correlativas = materiaInscripcion.getCorrelativas();

    if(correlativas == null || correlativas.isEmpty()){
      return true;
    }

    return new HashSet<>(materiasAlumno).containsAll(correlativas);
  }

}
