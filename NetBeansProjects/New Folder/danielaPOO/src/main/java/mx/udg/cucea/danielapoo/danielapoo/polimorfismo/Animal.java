 /**
 * Programación Orientada a Objetos
 * Actividad 00: Polimorfismo
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 07/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.polimorfismo;

public class Animal {
    private int edad;
    private double peso; 
    private String genero;
    
    Animal(int edad, double peso, String genero){
        this.edad = edad;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String hacerSonido(){
        return "Esta haciendo un tipo de sonido!";
    }
    
    public void comer(){
        System.out.println("Esta comiendo!");
    }
    
    public void desplazarse(){
        System.out.println("Esta desplazandose!");
    }
}
