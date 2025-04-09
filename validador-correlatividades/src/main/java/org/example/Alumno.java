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
  private List<Materia> materiasAprobadas;

  public List<String> getNombreMateriasAprobadas() {
    return this.materiasAprobadas.stream()
        .map(Materia::getNombre)
        .collect(Collectors.toList());
  }

}
