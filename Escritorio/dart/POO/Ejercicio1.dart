class Moto{
  String marca;
  String color;

  //El constructor tien el mismo nombre de la clase 

  Moto(this.marca, this.color) {
    this.marca = marca;
    this.color = color;
  }

  //Metodo de la clase moto
  void caracteristicas() {
    print("La marca de mi moto es $marca ");
    print("El color de mi moto es $color");
  }
}

void main(){
  final mt09 =
      new Moto("Yamaha", "Negra"); // Instancia con argumentos posicionales
  //print(mt09.marca);
  //print(mt09.color);
  mt09.caracteristicas();

  final z1000 = new Moto("Kawasaki","Verde");
  z1000.caracteristicas();

  final hypermotard = new Moto("Ducati", "Roja");
  hypermotard.caracteristicas();
}