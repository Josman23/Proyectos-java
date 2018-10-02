package primeraclase;

public abstract class Vehiculo {

    private int numeroLlantas;

    public abstract void lavarVehiculo(); //Definir un metodo Abstracto elcual no puede tener un cuerpo

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }
}
