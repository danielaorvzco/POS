
package mx.udg.cucea.danielapoo.ejercicios02;

public class Ejercicios02 {

    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota" , "Corolla");
        System.out.println("\n^^ DATOS DEL CARRO ^^^\nMarca: " + c1.getMarca() + "\nModelo: " + c1.getModelo());
        c1.encenderCoche();
        c1.estadoAuto();
        
        Coche c2 = new Coche("Suzuki" , "Baleno");
        System.out.println("\n^^ DATOS DEL CARRO ^^^\nMarca: " + c2.getMarca() + "\nModelo: " + c2.getModelo());
        c2.apagarCoche();
        c2.estadoAuto();
    }
}
