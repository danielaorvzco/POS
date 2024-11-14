
package mx.udg.cucea.danielapoo.ejercicios02;

public class EmpleadoEjemplo {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Daniela", 40, 48);
        System.out.println("\nNombre: " + e1.getNombre() + "\nSalario por hora: " + e1.getSalarioHora() + "\nHoras trabajadas: " + e1.getHoraTrabajada());
        System.out.println("Salario semanal: " + e1.salarioSemanal());
    }   
}
