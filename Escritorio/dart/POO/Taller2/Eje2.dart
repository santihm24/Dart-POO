import 'dart:io';

class Producto {
  DateTime fechaCaducidad;
  String numeroLote;

  Producto(this.fechaCaducidad, this.numeroLote);

  @override
  String toString() {
    return "Fecha de caducidad: $fechaCaducidad\nNúmero de lote: $numeroLote";
  }
}

class ProductoFresco extends Producto {
  DateTime fechaEnvasado;
  String paisOrigen;

  ProductoFresco(DateTime fechaCaducidad, String numeroLote, this.fechaEnvasado,
      this.paisOrigen)
      : super(fechaCaducidad, numeroLote);

  @override
  String toString() {
    return super.toString() +
        "\nFecha de envasado: $fechaEnvasado\nPaís de origen: $paisOrigen";
  }
}

class ProductoRefrigerado extends Producto {
  String codigoOrganismo;
  DateTime fechaEnvasado;
  double temperaturaRecomendada;
  String paisOrigen;

  ProductoRefrigerado(
      DateTime fechaCaducidad,
      String numeroLote,
      this.codigoOrganismo,
      this.fechaEnvasado,
      this.temperaturaRecomendada,
      this.paisOrigen)
      : super(fechaCaducidad, numeroLote);

  @override
  String toString() {
    return super.toString() +
        "\nCódigo del organismo de supervisión alimentaria: $codigoOrganismo\nFecha de envasado: $fechaEnvasado\nTemperatura de mantenimiento recomendada: $temperaturaRecomendada\nPaís de origen: $paisOrigen";
  }
}

class ProductoCongelado extends Producto {
  DateTime fechaEnvasado;
  String paisOrigen;
  double temperaturaRecomendada;

  ProductoCongelado(DateTime fechaCaducidad, String numeroLote,
      this.fechaEnvasado, this.paisOrigen, this.temperaturaRecomendada)
      : super(fechaCaducidad, numeroLote);

  @override
  String toString() {
    return super.toString() +
        "\nFecha de envasado: $fechaEnvasado\nPaís de origen: $paisOrigen\nTemperatura de mantenimiento recomendada: $temperaturaRecomendada";
  }
}

class CongeladoPorAire extends ProductoCongelado {
  double porcentajeNitrogeno;
  double porcentajeOxigeno;
  double porcentajeDioxidoCarbono;
  double porcentajeVaporAgua;

  CongeladoPorAire(
      DateTime fechaCaducidad,
      String numeroLote,
      DateTime fechaEnvasado,
      String paisOrigen,
      double temperaturaRecomendada,
      this.porcentajeNitrogeno,
      this.porcentajeOxigeno,
      this.porcentajeDioxidoCarbono,
      this.porcentajeVaporAgua)
      : super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen,
            temperaturaRecomendada);

  @override
  String toString() {
    return super.toString() +
        "\nPorcentaje de nitrógeno: $porcentajeNitrogeno\nPorcentaje de oxígeno: $porcentajeOxigeno\nPorcentaje de dióxido de carbono: $porcentajeDioxidoCarbono\nPorcentaje de vapor de agua: $porcentajeVaporAgua";
  }
}

class CongeladoPorAgua extends ProductoCongelado {
  double salinidadAgua;

  CongeladoPorAgua(
      DateTime fechaCaducidad,
      String numeroLote,
      DateTime fechaEnvasado,
      String paisOrigen,
      double temperaturaRecomendada,
      this.salinidadAgua)
      : super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen,
            temperaturaRecomendada);

  @override
  String toString() {
    return super.toString() + "\nSalinidad del agua: $salinidadAgua g/L";
  }
}

class CongeladoPorNitrogeno extends ProductoCongelado {
  String metodoCongelacion;
  int tiempoExposicionNitrogeno;

  CongeladoPorNitrogeno(
      DateTime fechaCaducidad,
      String numeroLote,
      DateTime fechaEnvasado,
      String paisOrigen,
      double temperaturaRecomendada,
      this.metodoCongelacion,
      this.tiempoExposicionNitrogeno)
      : super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen,
            temperaturaRecomendada);

  @override
  String toString() {
    return super.toString() +
        "\nMétodo de congelación empleado: $metodoCongelacion\nTiempo de exposición al nitrógeno: $tiempoExposicionNitrogeno segundos";
  }
}

void main() {
  ProductoFresco productoFresco = ProductoFresco(
      DateTime(2024, 12, 31), "Lote001", DateTime(2024, 12, 25), "España");
  print("Producto Fresco:\n$productoFresco");

  ProductoRefrigerado productoRefrigerado = ProductoRefrigerado(
      DateTime(2024, 12, 31),
      "Lote002",
      "COD-123",
      DateTime(2024, 12, 20),
      4.0,
      "Francia");
  print("\nProducto Refrigerado:\n$productoRefrigerado");

  CongeladoPorAire congeladoPorAire = CongeladoPorAire(DateTime(2024, 12, 31),
      "Lote003", DateTime(2024, 12, 15), "Alemania", -18.0, 80, 15, 5, 0);
  print("\nCongelado por Aire:\n$congeladoPorAire");

  CongeladoPorAgua congeladoPorAgua = CongeladoPorAgua(DateTime(2024, 12, 31),
      "Lote004", DateTime(2024, 12, 10), "Italia", -20.0, 15);
  print("\nCongelado por Agua:\n$congeladoPorAgua");

  CongeladoPorNitrogeno congeladoPorNitrogeno = CongeladoPorNitrogeno(
      DateTime(2024, 12, 31),
      "Lote005",
      DateTime(2024, 12, 5),
      "Portugal",
      -25.0,
      "Inmersión",
      120);
  print("\nCongelado por Nitrógeno:\n$congeladoPorNitrogeno");
}
