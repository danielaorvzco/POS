
package mx.udg.cucea.danielapoo.ejercicios02;

public class EjemploCalculadora {

    public static void main(String[] args) {
        Suma s1 = new Suma(3,4);
        System.out.println("Resultado de la operacion: " + s1.operacion());
        
        Resta r1 = new Resta(4, 3);
        System.out.println("Resultado de la operacion: " + r1.operacion());
        
        Multiplicacion m1 = new Multiplicacion(3, 4);
        System.out.println("Resultado de la operacion: " + m1.operacion());
        
        Division d1 = new Division(4, 2);
        System.out.println("Resultado de la operacion: " + d1.operacion());
    }
    
}
