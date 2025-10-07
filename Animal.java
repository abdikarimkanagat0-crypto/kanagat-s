package Animalsound;

public class Animal {
    public void animalSound(){
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Dog says:Bark Bark");
    }
}
class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Cat says :Meow Meow");
    }
}
class Test{
    public static void main(String[]args){
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.animalSound();
        dog.animalSound();
        animal.animalSound();
    }
}