public class Main {
    public static class Animal {
        public void move() {
            System.out.println("The animal moves");
        }
    }
    
    public static class Cheetah extends Animal {
        @Override
        public void move() {
            System.out.println("The Cheetah runs at high speeds!");
        }
    }
    
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.move();
        
        Cheetah fastCheetah = new Cheetah();
        fastCheetah.move();
    }
}
