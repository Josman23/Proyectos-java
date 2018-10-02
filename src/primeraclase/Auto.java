package primeraclase;

import primeraclase.excepciones.PlacaInvalidaException;

public class Auto extends Vehiculo{

    private String placa;


    // Constructor sin parametros (default)
    public Auto(){
        placa = "Desconocido";
        setNumeroLlantas(4);
    }

    // Constructor que recibe num de placa
    public Auto(String placa) throws PlacaInvalidaException{

        placa=placa.trim();

        if(placa.length() >=7 && placa.length() <=8){
            this.placa = placa;
            setNumeroLlantas(4);
        }else{
           throw new PlacaInvalidaException("PLACA INVALIDA");
          // throw new RuntimeException("");
        }
    }

    //implementar metodo lavarVehiculo de la clase abstracta Vehiculo
    public void lavarVehiculo() {
        System.out.println("Entrando al car wash");
    }

    //Getter
    public String getPlaca() {
        return placa;
    }

    //Setter
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
