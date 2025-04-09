package org.example;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alumno {

  private String nombre;
  private String apellido;
  private String legajo;
  private List<Materia> materias;

  public List<String> getNombreMateriasAprobadas() {
    return this.materias.stream()
        .filter(Materia::isAprobada)
        .map(Materia::getNombre)
        .collect(Collectors.toList());
  }

}
