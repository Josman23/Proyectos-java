package loops;

import java.util.ArrayList;

public class Loops {

    //Iteracion con ciclo For Normal

    public void iterarConFor(){
        for(int i=0; i < 10 ;++i){
            System.out.println("Dentro delciclo " + i);
        }
    }

    // Iteracion con ciclo For Each

    public void interarConForeach(){

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for(Integer numero : numeros){
            System.out.println("Dentro de FOREACH " + numero);
        }
    }

    // Iteracion con ciclo While

    public void iterarConWhileyDoWile() {
        int x = 0;
        while (x < 5) {
            System.out.println("Dentro de While " + x++);
        }

     // Iteracion con ciclo Do While

        do{
            System.out.println("Dentro de DO WHILE + " + x++);
        }while(x==0);
    }
}
