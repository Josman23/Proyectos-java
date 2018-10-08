
package colecciones;

import java.util.*;
import java.util.Map.Entry;

public class ListSetMapTest {

    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Isra");
        lista.add("Dann");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");
        lista.add("Josman");
        lista.add("Gera");

        Set<String> set = new HashSet<>();
        set.add("Isra");
        set.add("Dann");
        set.add("Serch");
        set.add("Josman");
        set.add("Gera");
        set.add("Josman");
        set.add("Gera");

        Map<String, String> map = new HashMap<>();
        map.put("Isra","Israel Segundo");
        map.put("Dann","Dann Hernandez");
        map.put("Serch","Sergio Rivera");
        map.put("Josman","Jose Manuel Moreno");
        map.put("Gera","Gerardo Rincon");
        map.put("Josman","Jose Manuel Moreno Reyes");
        map.put("Gera","Gerardo Rincon ");

        System.out.println("Iterando Lista....");
        for(String nickname : lista){
            System.out.println(nickname);
        }
        System.out.println(":::::::::::::::::::::::::::::");

        System.out.println("Iterando Set....");
        for(String nickname : set){
            System.out.println(nickname);
        }
        System.out.println(":::::::::::::::::::::::::::::");

        System.out.println("Iterando Map....");
        for(Entry <String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println(":::::::::::::::::::::::::::::");

        System.out.println("Imprime HashCode");
        System.out.println(new ListSetMapTest().hashCode());

    }
}
