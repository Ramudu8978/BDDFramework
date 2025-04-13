package javaPrograms;

class Animals {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }


//public class OverridingTest {
    public static void main(String[] args) {
        Animals myCat = new Cat();
        myCat.makeSound(); // Output: Cat meows
    }
}
