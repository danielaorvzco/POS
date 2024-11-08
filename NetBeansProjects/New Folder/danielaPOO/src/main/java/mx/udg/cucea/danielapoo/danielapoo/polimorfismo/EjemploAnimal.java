 /**
 * Programación Orientada a Objetos
 * Actividad 00: Polimorfismo
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 07/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.polimorfismo;

public class EjemploAnimal {
    
    public void crearAnimal(Animal animal){
        System.out.println("tengo " + animal.getEdad() + " años, peso " + animal.getPeso() + " kg., soy " + animal.getGenero() + " y hago " + animal.hacerSonido());
    }
    
    public static void main(String[] args){
        //Objeto tipo PERRO
        Perro dog1 = new Perro("guau guau guau...", 3, 12.5, "Hembra");
        System.out.println(dog1.hacerSonido());
        
        //Objeto tipo GATO
        Gato cat1 = new Gato("miau miau miau...", 4, 10, "Macho");
        System.out.println(cat1.hacerSonido());
        System.out.println(cat1.hacerSonido("miauuuuuuu"));
        System.out.println(cat1.getEdad());
        cat1.setEdad(8);
        System.out.println(cat1.getEdad());
        
        //Objeto tipo CREARANIMAL
        EjemploAnimal e = new EjemploAnimal();
        e.crearAnimal(new Gato("miau miau miau...", 2, 7, "Hembra"));
        e.crearAnimal(new Perro("ruff ruff ruff...", 10, 13.5, "Macho"));
    }
}
