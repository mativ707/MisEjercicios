
package Entidades;

public class ParDeNumeros {
    double num1;
    double num2;

    public ParDeNumeros() {
        this.num1 = Math.random();
        this.num2 = Math.random();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = Math.random();
    }

    public void setNum2(double num2) {
        this.num2 = Math.random();
    }
    
    
}
