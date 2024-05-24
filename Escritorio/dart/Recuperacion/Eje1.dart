import 'dart:io';

void main() {
  List<int> numeros = [];

  print("Digite la cantidad de numeros: ");
  int num = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < num; i++) {
    print("Digite los numeros: ");
    int n = int.parse(stdin.readLineSync()!);

    numeros.add(n);
  }

  numeros.sort();
  print(numeros.reversed);
}
