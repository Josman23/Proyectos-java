package primeraclase;

public class Motocicleta extends Vehiculo {

    public Motocicleta(){
        setNumeroLlantas(2);
    }

    @Override
    public void lavarVehiculo() {
        System.out.println("Lavar motocicleta a mano");
    }
}
