package Polimorfismo;

    class Perro extends Animal {

        @Override
        void hacerRuido() {
            System.out.println("GUAU!");
        }

        void levantarPata(){
            System.out.println("Perro levantando la pata");
        }
    }
