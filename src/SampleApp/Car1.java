package SampleApp;

public class Car1 {

        private String color;
        private int size;
        private double weight;
        public static void start () {
            System.out.println("Press the start key");
        }
        public static void accelerate () {
            System.out.println("Press accelerator");
        }
        public void setColor (String color){
            this.color= color;
        }
        public void setSize (int size){
            this.size= size;
        }
        public void setWeight (double weight){
            this.weight= weight;
        }
        public void displayCar(){
            System.out.println("The Clour of Car is"+color);
            System.out.println("The Size of Car is"+size);
            System.out.println("the Wight of Car is"+weight);

        }

    }