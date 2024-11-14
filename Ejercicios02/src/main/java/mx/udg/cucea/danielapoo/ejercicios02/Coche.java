
package mx.udg.cucea.danielapoo.ejercicios02;

public class Coche {
    private String marca;
    private String modelo;
    private boolean estado;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void encenderCoche(){
        estado = true; 
    }
    
    public void apagarCoche(){
        estado = false;
    }
    
    public void estadoAuto(){
        if (estado == true){
            System.out.println("El auto se encuentra Encendido!");
        }else{
            System.out.println("El auto se encuentra Apagado");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
}
