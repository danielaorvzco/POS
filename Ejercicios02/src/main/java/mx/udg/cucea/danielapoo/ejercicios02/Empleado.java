
package mx.udg.cucea.danielapoo.ejercicios02;

public class Empleado {
    private String nombre;
    private double salarioHora;
    private int horaTrabajada;

    public Empleado(String nombre, double salarioHora, int horaTrabajada) {
        this.nombre = nombre;
        this.salarioHora = salarioHora;
        this.horaTrabajada = horaTrabajada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHoraTrabajada() {
        return horaTrabajada;
    }

    public void setHoraTrabajada(int horaTrabajada) {
        this.horaTrabajada = horaTrabajada;
    }
    
    public double salarioSemanal(){
        return salarioHora * horaTrabajada;
    }
}
