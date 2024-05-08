import 'dart:io';

class Multimedia {
  String titulo;
  String autor;
  String formato;
  int duracion;

  Multimedia(this.titulo, this.autor, this.formato, this.duracion);

  String getTitulo() {
    return titulo;
  }

  String getAutor() {
    return autor;
  }

  String getFormato() {
    return formato;
  }

  int getDuracion() {
    return duracion;
  }

  @override
  String toString() {
    return "Título: $titulo\nAutor: $autor\nFormato: $formato\nDuración: $duracion minutos";
  }

  bool equals(Multimedia otro) {
    return this.titulo == otro.titulo && this.autor == otro.autor;
  }
}

class Pelicula extends Multimedia {
  Pelicula(String titulo, String autor, String formato, int duracion)
      : super(titulo, autor, formato, duracion);
}

class Disco extends Multimedia {
  Disco(String titulo, String autor, String formato, int duracion)
      : super(titulo, autor, formato, duracion);
}

void main() {
  Multimedia multimedia1 = Multimedia("Título 1", "Autor 1", "mp4", 120);
  Multimedia multimedia2 = Multimedia("Título 2", "Autor 2", "avi", 90);
  Multimedia multimedia3 = Multimedia("Título 1", "Autor 1", "mp4", 120);

  print(multimedia1);
  print(multimedia2);
  print("Multimedia 1 es igual a Multimedia 3: ${multimedia1.equals(multimedia3)}");

  Pelicula pelicula = Pelicula("Pelicula 1", "Director 1", "mp4", 150);
  Disco disco = Disco("Disco 1", "Artista 1", "cdAudio", 60);

  print(pelicula);
  print(disco);
}