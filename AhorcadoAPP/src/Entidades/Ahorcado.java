
package Entidades;

public class Ahorcado {
    char palabra [];
    int letrasEncontradas;
    int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int letrasEncontradas, int jugadasMax) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMax=" + jugadasMax + '}';
    }
    
    
}
