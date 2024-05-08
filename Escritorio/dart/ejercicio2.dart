/*Escribir un programa que gestione las facturas pendientes de cobro de una empresa.
Las facturas se almacenarán en un diccionario donde la clave de cada factura será el
número de factura y el valor el coste de la factura. El programa debe preguntar al
usuario si quiere añadir una nueva factura, pagar una existente o terminar. Si desea
añadir una nueva factura se preguntará por el número de factura y su coste y se añadirá
al diccionario. Si se desea pagar una factura se preguntará por el número de factura y 
se eliminará del diccionario. Después de cada operación el programa debe mostrar por
pantalla la cantidad cobrada hasta el momento y la cantidad pendiente de cobro.
 */
import 'dart:io';

void main (){
  Map<int,int > facturas ={ 1: 10000, 2: 30000, 3: 50000};
  int suma = 0;
  print("Ingres el valor de su eleccion");
  print(" 1 Añadir una nueva factura");
  print("2 pagar una factura ");
  print("3 terminar");
  print(facturas);

  int opcion = int.parse(stdin.readLineSync().toString());
  switch(opcion){
    case 1:

    print("añadir una nieva factura  ");

    print("Ingre el numero de la factura  ");
    int numerofactura = int.parse(stdin.readLineSync().toString());
    print("Ingrese el valor de la factura");
    facturas[numerofactura] = int.parse(stdin.readLineSync().toString());

    facturas.forEach((key, value) { 
      //
      suma = suma + value;

    });
    
    break;// para con el primer caso " case 1 " y segir con el caso 2 
    case 2:

      print("pagar una factura");
      print("ibrese el numero de la factura que desea borrra");
      int numerofactura = int.parse(stdin.readLineSync().toString());
      facturas.remove(numerofactura);
      print(facturas);
      facturas.forEach((key, value) {
        suma = suma + value;

      });
      print("el valor por pagr es $suma ");
      break;

      case 3:
        print("terminar");
        break;
      default:
        print(" NO existe esa opcion ");
        break;
        



  }

}