
package mx.udg.cucea.danielapoo.ejercicios02;

public class EjemploLibro {
    
    public static void main(String[] args) {
        Libro l1 = new Libro("El Mago de OZ" , "L. Frank Baum", 200);
        System.out.println("\nTitulo: " + l1.getTitulo() + "\nAutor: " + l1.getAutor() + "\nNumero de paginas: " + l1.getNumPaginas());
        
        Libro l2 = new Libro("Viaje al Centro de la Tierra", "Julio Verne" , 250);
        System.out.println("\nTitulo: " + l2.getTitulo() + "\nAutor: " + l2.getAutor() + "\nNumero de paginas: " + l2.getNumPaginas());
        
        Libro l3 = new Libro("El Retrato de Dorian Gray", "Oscar Wilde" , 238);
        System.out.println("\nTitulo: " + l3.getTitulo() + "\nAutor: " + l3.getAutor() + "\nNumero de paginas: " + l3.getNumPaginas());
    } 
}
