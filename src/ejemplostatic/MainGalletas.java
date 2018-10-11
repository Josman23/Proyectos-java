package ejemplostatic;

import java.util.ArrayList;
import java.util.List;

public class MainGalletas {

    public static void main(String[] args){
        List<Galleta> galletas = misgalletas();

        for(Galleta gall : galletas){
            System.out.println(gall.toString());
        }

        System.out.println(galletas.get(0).getCantidad());

    }

    public static List<Galleta> misgalletas(){

        Galleta galleta1= new Galleta("Chocolate","Cuadrada","Café","Cremoso");
        Galleta galleta2= new Galleta("Vainilla","Cuadrada","Amarilla","Cremoso");
        Galleta galleta3= new Galleta("Fresa","Cuadrada","Rojo","Cremoso");
        Galleta galleta4= new Galleta("Chocolate","Redonda","Café","Cremoso");
        Galleta galleta5= new Galleta("Vainilla","Redonda","Amarilla","Cremoso");
        Galleta galleta6= new Galleta("Fresa","Redonda","","Roja");
        Galleta galleta7= new Galleta("Chocolate","Rectangular","Café","Cremoso");
        Galleta galleta8= new Galleta("Vainilla","Rectangular","Amarilla","Cremoso");
        Galleta galleta9= new Galleta("Fresa","Rectangular","Roja","Cremoso");
        Galleta galleta10= new Galleta("Chocolate","Animalito","Café","Cremoso");
        Galleta galleta11= new Galleta("Vainilla","Animalito","Amarilla","Cremoso");
        Galleta galleta12= new Galleta("Coco","Animalito","Blanca","Cremoso");
        Galleta galleta13= new Galleta("Chocolate","Ondulada","Café","Cremoso");
        Galleta galleta14= new Galleta("Vainilla","Ondulada","Amarilla","Cremoso");
        Galleta galleta15= new Galleta("Chocolate","Ondulada","Café","Cremoso");

        List<Galleta> galleta = new ArrayList<>();
        galleta.add(galleta1);
        galleta.add(galleta2);
        galleta.add(galleta3);
        galleta.add(galleta4);
        galleta.add(galleta5);
        galleta.add(galleta6);
        galleta.add(galleta7);
        galleta.add(galleta8);
        galleta.add(galleta9);
        galleta.add(galleta10);
        galleta.add(galleta11);
        galleta.add(galleta12);
        galleta.add(galleta13);
        galleta.add(galleta14);
        galleta.add(galleta15);

        return galleta;

    }
}
