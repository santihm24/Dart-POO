
package Utils;

import java.util.Arrays;


public class Mascota {
    
    String nombre;
    String tipo;
    int edad;
    Medicamento[] medicamentos = new Medicamento[0];
    
    public Mascota(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Medicamento[] getMedicamentos() {
        return medicamentos;
    }
    
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos = Arrays.copyOf(medicamentos, medicamentos.length + 1);
        medicamentos[medicamentos.length - 1] = medicamento;
    }
    
    public void borrarMedicamento(int indice) {
        medicamentos[indice] = null;
        for(int i = indice; i < medicamentos.length - 1; i++) {
            medicamentos[i] = medicamentos[i + 1];
            medicamentos[i + 1] = null;
        }
        medicamentos = Arrays.copyOf(medicamentos, medicamentos.length - 1);
    }
}
