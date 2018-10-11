package Polimorfismo;

public class TestCasting {
    public static void main(String[] args){
      Animal[] animales = {new Animal(), new Perro(), new Animal()};
      for(Animal animal: animales){
          animal.hacerRuido();
          if(animal instanceof Perro){
              Perro p= (Perro) animal;
              p.levantarPata();
          }
      }
    }
}
