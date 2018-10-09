
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioDvd {

    public static void main(String[] args){

        List<Dvd> peliculas = llenarLista();

        for(Dvd peli : peliculas){
            System.out.println(peli);
        }

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");

        Collections.sort(peliculas);

        for(Dvd peli : peliculas){
            System.out.println(peli);
        }

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");

        OrdenamientoPorGenero ordenamientoPorGenero= new OrdenamientoPorGenero();
        Collections.sort(peliculas, ordenamientoPorGenero);

        for(Dvd peli : peliculas){
            System.out.println(peli);
        }

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");

        OrdenamientoPorProtagonista ordenamientoPorProtagonista= new OrdenamientoPorProtagonista();
        Collections.sort(peliculas, ordenamientoPorProtagonista);

        for(Dvd peli : peliculas){
            System.out.println(peli);
        }

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
        OrdenamientoPorDirector ordenamientoPorDirector = new OrdenamientoPorDirector();
        Collections.sort(peliculas,ordenamientoPorDirector);

        for(Dvd peli : peliculas){
            System.out.println(peli);
        }
    }

    public static List<Dvd> llenarLista(){

        Dvd Pelicula1 = new Dvd( "Son como niños","Comedia","Lenny Feder", "Dennis Dugan");
        Dvd Pelicula2 = new Dvd( "Como si fuera la primera vez","Comedia","Henry Roth","Peter Segal");
        Dvd Pelicula3 = new Dvd( "Click: Perdiendo el control","Drama","Michael Newman","Frank Coraci");
        Dvd Pelicula4 = new Dvd( "Luna de miel en familia","Comedia","Jim Friedman","Frank Coraci");
        Dvd Pelicula5 = new Dvd( "Una esposa de mentira","Comedia","Dr. Daniel Maccabee","Dennis Dugan");
        Dvd Pelicula6 = new Dvd( "Golpe bajo: el juego final","Drama","Paul Crewe","Peter Segal");
        Dvd Pelicula7 = new Dvd( "El aguador","Comedia"," Bobby Boucher","Frank Coraci");
        Dvd Pelicula8 = new Dvd( "Son como niños 2","Comedia","Lenny Feder","Dennis Dugan");
        Dvd Pelicula9 = new Dvd( "Cuentos que no son cuentos","Cine fantástico","Skeeter Bronson","Adam Shankman");
        Dvd Pelicula10 = new Dvd( "Pixeles","Cine fantástico","Sam Brenner","Chris Columbus");

        List<Dvd> lista = new ArrayList<Dvd>();
        lista.add(Pelicula1);
        lista.add(Pelicula2);
        lista.add(Pelicula3);
        lista.add(Pelicula4);
        lista.add(Pelicula5);
        lista.add(Pelicula6);
        lista.add(Pelicula7);
        lista.add(Pelicula8);
        lista.add(Pelicula9);
        lista.add(Pelicula10);

        return lista;
    }

}