
package mx.udg.cucea.danielapoo.ejercicios02;

public class EstudianteEjemplo {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Daniela Orozco" , 21, 5);
        System.out.println("\nNombre del estudiante: " + e1.getNombre() + "\nEdad: " + e1.getEdad() + "\nGrado escolar: " + e1.getGrado());
        
        Estudiante e2 = new Estudiante("Emiliano Ledesma", 19, 1);
        System.out.println("\nNombre del estudiante: " + e2.getNombre() + "\nEdad: " + e2.getEdad() + "\nGrado escolar: " + e2.getGrado());
    }   
}
