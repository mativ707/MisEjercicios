
package Entidades;

public class Meses {
    String meses[]=new String[12];
    String mesSecreto = meses[9];

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
}
