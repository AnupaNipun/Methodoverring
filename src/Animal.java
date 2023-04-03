public class Animal {

        public void makeSound() {
            System.out.println("THE ANIMAL MAKES A SOUND");
        }
    }

    class Cat extends Animal {
        public void makeSound() {
            System.out.println("MEOW");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();
            Cat myCat = new Cat();
            myAnimal.makeSound();
            myCat.makeSound();
        }
    }


