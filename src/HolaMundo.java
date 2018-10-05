
import equals.Persona;
import loops.Loops;
import primeraclase.Auto;
import primeraclase.Motocicleta;
import primeraclase.Vehiculo;
import primeraclase.excepciones.PlacaInvalidaException;

public class HolaMundo {

    public static void main(String[] args) throws PlacaInvalidaException{

        System.out.println("Hola Mundo Cruel!");

////////////////////////////////////////////////////// Clase Loops /////////////////////////////////////////////////////

        Loops loop= new Loops();
        loop.iterarConFor();
        loop.interarConForeach();
        loop.iterarConWhileyDoWile();

/////////////////////////////////////////////////////////// Clase Auto /////////////////////////////////////////////////

        // Crear una Instancia de Auto
        Auto auto = new Auto();
        auto.lavarVehiculo();
        System.out.println("Placas: "+auto.getPlaca());
        System.out.println("Numero de llantas Veiculo: "+ auto.getNumeroLlantas());


        //Sentencia Try y Catch
        try {
            Auto auto2 = new Auto("AABD972");
            auto2.lavarVehiculo();
            System.out.println("Placas: "+auto2.getPlaca());
            System.out.println("Numero de llantas Veiculo: "+ auto2.getNumeroLlantas());

        }catch(PlacaInvalidaException e){
            System.out.println("OCURRIO UN ERROR AL CREAR AUTO: "+ e.getMessage());
            throw e;
        }finally {
            //Liberar recursos, Finaliza alguna ejecución ocurra o no una Excepción.
        }

//////////////////////////////////////////////////////// Clase Motocicleta ////////////////////////////////////////////

        Motocicleta moto = new Motocicleta();
        moto.lavarVehiculo();
        System.out.printf("Numero de llantas Motocicleta: "+ moto.getNumeroLlantas());

////////////////////////////////////////////////// Equals /////////////////////////////////////////////////////////////////////

        Persona p1 = new Persona();
        Persona p2= new Persona();

        p1.setNombre("Pedro");
        p1.setEdad(26);

        p2.setNombre("Pedro");
        p2.setEdad(26);

        System.out.println(p1.equals(p2));



     // Vehiculo vehiculo = new Vehiculo();
    }
}