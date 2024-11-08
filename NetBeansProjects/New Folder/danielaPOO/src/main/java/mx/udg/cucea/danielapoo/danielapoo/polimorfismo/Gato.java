/**
 * Programación Orientada a Objetos
 * Actividad 00: Polimorfismo
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 07/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.polimorfismo;

public class Gato extends Animal{
    private String sonido;

    public Gato(String sonido, int edad, double peso, String genero) {
        super(edad, peso, genero);
        this.sonido = sonido;
        System.out.print("Soy un gato, ");
    }

    @Override
    public String hacerSonido() {
        //return super.hacerSonido(); 
        return sonido;
    }
    
    public String hacerSonido(String otroSonido){
        return otroSonido;
    }
}
