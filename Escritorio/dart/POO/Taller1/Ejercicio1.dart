import 'dart:ffi';

void main(){

  final cuentaDavivienda = new Cuenta(235623, 1256372, 12000000);
  cuentaDavivienda.ingresar(290000);
  cuentaDavivienda.retirar(340000);
  cuentaDavivienda.mostrar();

  final cuentaNequi = new Cuenta(12345, 2536271, 7000000);
  cuentaNequi.ingresar(1000000);
  cuentaNequi.retirar(500000);
  cuentaNequi.mostrar();
  
}

   class Cuenta{
    int numeroCuenta;
    int documentoCliente;
    double saldo;
    
   
  Cuenta(this.numeroCuenta,this.documentoCliente,this.saldo){

    this.numeroCuenta = numeroCuenta;
    this.documentoCliente = documentoCliente;
    this.saldo = saldo;

  }

  void ingresar(double valor){
     saldo += valor;
     print("Ingresado su saldo es: $saldo");
  }

  void retirar(double valor){

    if(saldo >= valor){
      saldo  -= valor;
      print("Su retiro se hizo con exito, su saldo actual es $saldo");
    }else{
      print("El valor ingresado supera la cantidad disponible");
    }
  }
  void mostrar(){
    print("El numero de su cuenta es: $numeroCuenta");
    print("Su numero de documento es: $documentoCliente");
    print("Su saldo actual es: $saldo");
  }
   }