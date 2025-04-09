package org.example;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materia {

  private String nombre;
  private boolean aprobada;
  private List<String> correlativas;

}
