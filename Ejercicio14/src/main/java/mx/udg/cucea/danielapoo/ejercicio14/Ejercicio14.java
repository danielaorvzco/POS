/**
 * Programación Orientada a Objetos
 * Actividad 14: Encapsulamiento
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 09/11/2024
 */

package mx.udg.cucea.danielapoo.ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Pepe");
        p1.setEdad(27);
        p1.setDomicilio("Javier Mina");
        System.out.println("Nombre de la persona: " + p1.getNombre() + "\nEdad: " + p1.getEdad() + "\nDomicilio: " + p1.getDomicilio() + "\n");
        
        Persona p2 = new Persona();
        p2.setNombre("Daniela");
        p2.setEdad(121);
        p2.setDomicilio("Santander");
        System.out.println("Nombre de la persona: " + p2.getNombre() + "\nEdad: " + p2.getEdad() + "\nDomicilio: " + p2.getDomicilio());       
    }
}

class Persona{
    private String nombre;
    private int edad;
    private String domicilio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 1 && edad <= 120){
            this.edad = edad;
        }else{
            System.out.println("La edad (" + edad + ") introducida no es valida!");
        }
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
