package colecciones;

public class Dvd implements Comparable<Dvd> {

    private String titulo;
    private String genero;
    private String protagonista;
    private String director;

    public Dvd(){
    }

    public Dvd(String titulo){
     this.titulo=titulo;
    }

    public Dvd(String titulo, String genero){
        this (titulo);
        this.genero=genero;
    }

    public Dvd(String titulo, String genero, String protagonista){
        this (titulo, genero);
        this.protagonista=protagonista;
    }

    public Dvd(String titulo, String genero, String protagonista,String director){
        this (titulo, genero, protagonista);
        this.director=director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return this.titulo+"  --  "+this.genero+"  --  "+this.protagonista+"  --  "+this.director;
    }

    @Override
    public int compareTo(Dvd o) {
        return this.titulo.compareTo(o.titulo);
    }

}