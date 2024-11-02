/**
 * Programación Orientada a Objetos
 * Actividad 00: Encapsulamiento
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 31/10/2024
 */

package mx.udg.cucea.danielapoo.danielapoo.paqueteUno;

public class Examen {
    private double calificacion;
    private int numPreguntas;
    private boolean estatus;
    
    public double getCalificacion(){
        return calificacion;
    }
    
    public void setCalificacion(double calificacion){
        if(calificacion >= 1 && calificacion <= 100){
            this.calificacion = calificacion;
        }else{
            System.out.println("La calificacion no es valida!!");
        }
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }
    
}
