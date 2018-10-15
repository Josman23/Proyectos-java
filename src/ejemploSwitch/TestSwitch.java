package ejemploSwitch;

public class TestSwitch {

    public static void main(String[] args){

        System.out.println("/////////////////////////////// Switch numero ////////////////////////////////");

        int a = 4;

        switch (a){

            case 1:
                System.out.println("a es igual a 1");
                break;
            case 2:
                System.out.println("a es igual a 2");
                break;
            case 3:
                System.out.println("a es igual a 3 ");
                break;
            case 4:
                System.out.println("a es igual a 4");
                break;
            case 5:
                System.out.println("a es igual a 5 ");
                break;
            case 6:
                System.out.println("a es igual a 6");
                break;
             default:
                 System.out.println("No se save el valor de a");
        }

        System.out.println("/////////////////////////////// Switch color ////////////////////////////////");

        Color rojo = Color.ROJO;

        switch (rojo){
            case CAFE:
                System.out.println("El color es cafe");
                break;
            case ROJO:
                System.out.println("El color es rojo");
                break;
            case VERDE:
                System.out.println("El color es verde");
                break;
            case BLANCO:
                System.out.println("El color es blanco");
                break;
            case AMARILLO:
                System.out.println("El color es amarillo");
             default:
                System.out.println("No es un color");
        }
    }
}
