
import colecciones.Dvd;
public class DvdMain {

    public static void main(String[] arg){
        Dvd dvd = new Dvd( "El Rey","Banda","Piporro");
        System.out.println("Titulo: "+ dvd.getTitulo());
        System.out.println("Genero: "+dvd.getGenero());
        System.out.println("Protagonista: "+dvd.getProtagonista());
    }

}
