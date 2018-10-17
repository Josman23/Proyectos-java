package operadorTernario;

public class TestTernario {

    public static void main(String[] args){
        ValidarAcceso(13,19,17,21,35,15);
    }

   public static void ValidarAcceso(int... valores){

        for(int val: valores){
            String status = (val >= 18) ? "Tu edad es: "+val+", Acceso permitido" : "Tu edad es: "+val+", Acceso denegado";
            System.out.println(status);
        }
    }
}