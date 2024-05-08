import 'dart:io';

class Cafetera {
  int _capacidadMaxima;
  int _cantidadActual;

  Cafetera(this._capacidadMaxima, this._cantidadActual) {
    _capacidadMaxima = 1000;
    _cantidadActual = 0;
  }

  void servirTaza(int cantidadTaza) {
    if (_cantidadActual >= cantidadTaza) {
      _cantidadActual -= cantidadTaza;
      print('Se ha servido una taza de $cantidadTaza cc de café.');
    } else {
      print('No hay suficiente café en la cafetera para llenar la taza.');
      print(
          'Se ha servido lo que quedaba en la cafetera: $_cantidadActual cc de café.');
      _cantidadActual = 0;
    }
  }

  void vaciarCafetera() {
    _cantidadActual = 0;
    print('La cafetera ha sido vaciada.');
  }

  void agregarCafe(int cantidadCafe) {
    if (_cantidadActual + cantidadCafe <= _capacidadMaxima) {
      _cantidadActual += cantidadCafe;
      print('Se han agregado $cantidadCafe cc de café a la cafetera.');
    } else {
      print(
          'No se puede agregar esa cantidad de café, excede la capacidad máxima de la cafetera.');
    }
  }

  int getCantidadActual() {
    return _cantidadActual;
  }

  int getCapacidadMaxima() {
    return _capacidadMaxima;
  }
}

void main() {
  Cafetera miCafetera = Cafetera(1000,300);
  print(
      'Cantidad actual de café en la cafetera: ${miCafetera.getCantidadActual()} cc');
  print(
      'Capacidad máxima de la cafetera: ${miCafetera.getCapacidadMaxima()} cc');

  miCafetera.agregarCafe(500);
  miCafetera.servirTaza(200);
  miCafetera.servirTaza(600);
  miCafetera.vaciarCafetera();
}
