
package Entidades;
public class Pelicula {
    String título;
    String director;
    Integer duración;

    public Pelicula() {
    }

    public Pelicula(String título, String director, Integer duración) {
        this.título = título;
        this.director = director;
        this.duración = duración;
    }

    public String getTítulo() {
        return título;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuración() {
        return duración;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuración(Integer duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Pel\u00edcula{" + "t\u00edtulo=" + título + ", director=" + director + ", duraci\u00f3n=" + duración + '}';
    }
    
    
}
