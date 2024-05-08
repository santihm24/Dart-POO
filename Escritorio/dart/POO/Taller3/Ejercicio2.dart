import 'dart:io';

class Empleado {
  String nombre;
  int edad;
  String departamento;

  Empleado(this.nombre, this.edad, this.departamento);

  void trabajar() {
    print("$nombre está trabajando en el departamento de $departamento");
  }

  void mostrarInfo() {
    print("Nombre: $nombre");
    print("Edad: $edad");
    print("Departamento: $departamento");
  }
}

class Programador extends Empleado {
  String lenguaje;

  Programador(String nombre, int edad, String departamento, this.lenguaje)
      : super(nombre, edad, departamento);

  void programar() {
    print("$nombre está programando en $lenguaje");
  }

  @override
  void mostrarInfo() {
    super.mostrarInfo();
    print("Lenguaje de programación: $lenguaje");
  }
}

void main() {
  Empleado empleado = Empleado("Juan", 30, "Desarrollo");
  empleado.trabajar();
  empleado.mostrarInfo();

  Programador programador = Programador("María", 25, "Desarrollo", "Dart");
  programador.trabajar();
  programador.programar();
  programador.mostrarInfo();
}