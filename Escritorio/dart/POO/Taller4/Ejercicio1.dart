import 'dart:io';

class personas {
  int cedula;
  String nombres;
  int edad;
  String sexo;
  int falMaximas;

  personas(this.cedula, this.nombres, this.edad, this.sexo, this.falMaximas) {
    this.cedula = cedula;
    this.nombres = nombres;
    this.edad = edad;
    this.sexo = sexo;
    this.falMaximas = falMaximas;
  }
}

class instructores {
  String materiaAsignada;

  instructores(this.materiaAsignada) {
    this.materiaAsignada = materiaAsignada;
  }
}

class aprendices {
  int calificacion;

  aprendices(this.calificacion) {
    this.calificacion = calificacion;
  }
}

class aula {
  int idNumerico;
  int numAprendices;
  String asigDesignada;
  int numEquipos;
  int horaCierre;

  aula(this.idNumerico, this.numAprendices, this.asigDesignada, this.numEquipos,
      this.horaCierre) {
    this.idNumerico = idNumerico;
    this.numAprendices = numAprendices;
    this.asigDesignada = asigDesignada;
    this.numEquipos = numEquipos;
    this.horaCierre = horaCierre;
  }
}
