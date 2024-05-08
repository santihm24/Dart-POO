import 'dart:io';

class Cancion {
  String titulo;
  String autor;

  Cancion(this.titulo, this.autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  String dameTitulo() {
    return titulo;
  }

  String dameAutor() {
    return autor;
  }

  void ponTitulo(String nuevoTitulo) {
    titulo = nuevoTitulo;
  }

  void ponAutor(String nuevoAutor) {
    autor = nuevoAutor;
  }
}

void main() {
  Cancion miCancion = new Cancion("El cantante", "Hector Lavoe");
  print('Título de la canción: ${miCancion.dameTitulo()}');
  print('Autor de la canción: ${miCancion.dameAutor()}');

  miCancion.ponTitulo("Loco");
  miCancion.ponAutor("Hector Lavoe");

  print('Nuevo título de la canción: ${miCancion.dameTitulo()}');
  print('Nuevo autor de la canción: ${miCancion.dameAutor()}');
}
