void main(){
  final Edison = new Persona("Edison", 25); //Instancia con argumentos posicionales
  Edison.caracteristicas();
  var Juan = new Empleado("Juan", 37);
  Juan.caracteristicas();
  Juan.decirCargo();
}
class Persona {
  String nombre;
  int edad;
  //el constructor tiene el mismo nombre de la clase
  Persona(this.nombre,this.edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
  //Metodo de la clase Persona
  void caracteristicas(){
    print("El nombre es $nombre");
    print("La edad es $edad");
  }
}
class Empleado extends Persona {
  Empleado(String nombre, int edad) : super(nombre, edad);
  String cargo = "instructor";
  int sueldo = 10000000;
  void decirCargo(){
    print("Soy $cargo");
    print("Mi sueldo es $sueldo");
  }
}