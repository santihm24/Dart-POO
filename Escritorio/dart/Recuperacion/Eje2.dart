import 'dart:io';

void main() {
  Map<int, String> Usuarios = {23456: 'Santiago', 67890: 'Juan'};

  bool continuar = true;

  while (continuar) {
    print("---------------");
    print("1. Ver Usuarios");
    print("2. Añadir Usuario");
    print("3. Eliminar Usuario");
    print("4. Modificar");
    print("5. Buscar Usuario");
    print("6. Salir");

    print("--------------");

    print("Elija una opcion");
    int op = int.parse(stdin.readLineSync()!);
    switch (op) {
      case 1:
        Usuarios.forEach((key, value) {
          print('Cedula: $key -> Nombre: $value');
        });
        break;

      case 2:
        print("Digite la cedula del usuario nuevo: ");
        int cedulaNueva = int.parse(stdin.readLineSync()!);

        print("Digite el nuevo nombre del usuario: ");
        String nombreNuevo = (stdin.readLineSync()!);

        Usuarios[cedulaNueva] = nombreNuevo;

        break;

      case 2:
        print("Digite la cedula del usuario que desea eliminar: ");
        int cedEliminar = int.parse(stdin.readLineSync()!);

        if (Usuarios.containsKey(cedEliminar)) {
          Usuarios.remove(cedEliminar);

          print("Usuario Eliminado con exito");
        } else {
          print("La cedula ingresada no se encontro");
        }

        break;

      case 4:
        print("Digite la cedula del usuario a modificar:");
        int cedModificar = int.parse(stdin.readLineSync()!);

        if (Usuarios.containsKey(cedModificar)) {
          print("Ingrese el nuevo nombre: ");
          String nuevoNombre = (stdin.readLineSync()!);
          Usuarios[cedModificar] = nuevoNombre;

          print("Usuario modificado con exito");
        } else {
          print("La cedula ingresada no se encontro");
        }
        break;

      case 5:
        print("Digite la cedula del usuario a buscar: ");
        int cedBuscar = int.parse(stdin.readLineSync()!);
        if (Usuarios.containsKey(cedBuscar)) {
          print(
              "Usted eligio a -> ${Usuarios[cedBuscar]} con cedula $cedBuscar");
        }

        break;

      case 6:
        print("Saliendo...");
        continuar = false;
        break;
      default:
        print("Opcion no valida, intentelo nuevamente");
    }

    print("------------------------");
  }
}
