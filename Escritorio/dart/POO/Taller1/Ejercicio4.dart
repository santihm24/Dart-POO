import 'dart:io';

class Persona {
  String nombre;
  String apellido;

  Persona(this.nombre, this.apellido);
}

class Fecha {
  int dia;
  int mes;
  int year;

  Fecha(this.dia, this.mes, this.year);
}

class Libro {
  String titulo;
  Persona autor;
  String ISBN;
  int paginas;
  int edicion;
  String editorial;
  String lugar;
  Fecha fechaEdicion;


  Libro(this.titulo, this.autor, this.ISBN, this.paginas, this.edicion, this.editorial, this.lugar, this.fechaEdicion);


  void leerInformacion() {
    print('Título: $titulo');
    print('Autor: ${autor.nombre} ${autor.apellido}');
    print('ISBN: $ISBN');
    print('Número de páginas: $paginas');
    print('Edición: $edicion');
    print('Editorial: $editorial');
    print('Lugar: $lugar');
    print('Fecha de edición: ${fechaEdicion.dia}/${fechaEdicion.mes}/${fechaEdicion.year}');
  }


  void mostrarInformacion() {
    print('Información del libro:');
    leerInformacion();
  }
}

void main() {
  Persona autor = Persona("John", "Katzenbach");
  Fecha fechaEdicion = Fecha(29, 01, 2002);

  Libro psicoanalista = Libro("El psicoanalista", autor, "12345535644", 432, 1, "Ballantine", "Nueva York", fechaEdicion);

  psicoanalista.mostrarInformacion();
}
