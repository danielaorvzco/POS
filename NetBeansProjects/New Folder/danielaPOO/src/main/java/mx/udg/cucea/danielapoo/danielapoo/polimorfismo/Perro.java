 /**
 * Programación Orientada a Objetos
 * Actividad 00: Polimorfismo
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 07/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.polimorfismo;

public class Perro extends Animal {
    private String sonido;

    public Perro(String sonido, int edad, double peso, String genero) {
        super(edad, peso, genero);
        this.sonido = sonido;
        System.out.print("Soy un perro, ");
    }

    @Override
    public String hacerSonido() {
        //return super.hacerSonido();
        return sonido;
    }
}
