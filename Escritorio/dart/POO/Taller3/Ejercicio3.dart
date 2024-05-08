import 'dart:io';

class Empleado {
  String nombre;
  int horasTrabajadas;
  int horasSemanales;

  Empleado(this.nombre, this.horasTrabajadas, this.horasSemanales);

  bool debePagarHorasExtras() {
    return horasTrabajadas > horasSemanales;
  }

  int calcularMinutosExtras() {
    if (debePagarHorasExtras()) {
      int horasExtras = horasTrabajadas - horasSemanales;
      return horasExtras * 60;
    } else {
      return 0;
    }
  }
}

void main() {
  Empleado empleado = Empleado("Juan", 45, 40);

  if (empleado.debePagarHorasExtras()) {
    print("El empleado ${empleado.nombre} debe recibir horas extras.");
    print(
        "Cantidad de minutos extras a pagar: ${empleado.calcularMinutosExtras()} minutos.");
  } else {
    print("El empleado ${empleado.nombre} no debe recibir horas extras.");
  }
}
