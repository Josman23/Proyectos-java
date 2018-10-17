package enumccs;

public class TestCafe {

    public static void main(String[] args){

        Cafe cafe= new Cafe();
        cafe.setTamanioCafe(TamanioCafe.MAMALON);
        System.out.println("El tamaño del cafe es: "+TamanioCafe.MAMALON);
        System.out.println("Las onzas son: "+TamanioCafe.MAMALON.getOnzas());
        System.out.println("Tipo de tapa: "+TamanioCafe.MAMALON.getTipoTapa());
    }

}
