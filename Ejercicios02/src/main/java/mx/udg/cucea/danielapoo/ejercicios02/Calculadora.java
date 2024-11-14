
package mx.udg.cucea.danielapoo.ejercicios02;

public class Calculadora {
    private double num1, num2, resultado;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double operacion(){
        return resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}

class Suma extends Calculadora{

    public Suma(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.setResultado(super.getNum1() + super.getNum2());
        return super.getResultado();
    }
}

class Resta extends Calculadora{

    public Resta(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.setResultado(super.getNum1() - super.getNum2());
        return super.getResultado();
    }  
}

class Multiplicacion extends Calculadora{

    public Multiplicacion(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.setResultado(super.getNum1() * super.getNum2());
        return super.getResultado();
    }  
}

class Division extends Calculadora{

    public Division(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double operacion() {
        super.setResultado(super.getNum1() / super.getNum2());
        return super.getResultado();
    }  
}