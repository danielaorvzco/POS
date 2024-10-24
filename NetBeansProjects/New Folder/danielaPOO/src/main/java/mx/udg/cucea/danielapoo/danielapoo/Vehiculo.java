 /**
 * Programación Orientada a Objetos
 * Actividad 00: 
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 08/10/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo;

public class Vehiculo {
    String tipo;
    
    Vehiculo(String tipo){
        this.tipo = tipo;
    }
    
    void mostrarTipo(){
        System.out.println("\nTipo de vehiculo: " + tipo);
    }
}

class Coche extends Vehiculo{
    int puertas;
    
    Coche(int puertas, String tipo){
        super(tipo);
        this.puertas = puertas;
    }
    
    void mostrarDetalles(){
        mostrarTipo();
        System.out.println("Numero de puertas: " + puertas);
    }
}

class Motocicleta extends Vehiculo{
    boolean sidecar;

    public Motocicleta(boolean sidecar, String tipo) {
        super(tipo);
        this.sidecar = sidecar;
    }
    
    void mostrarDetalles(){
        mostrarTipo();
        System.out.println("¿Cuentas con sidecar? " + (sidecar ? "Si" : "No"));
    }
}

class Avion extends Vehiculo{
    int CapacidadPasajeros;

    public Avion(int CapacidadPasajeros, String tipo) {
        super(tipo);
        this.CapacidadPasajeros = CapacidadPasajeros;
    }
    
   void mostrarDetalles(){
       mostrarTipo();
       System.out.println("Capacidad de pasajeros: " + CapacidadPasajeros);
   }
}
