package com.company;

public interface Pet {
    void feed();

    void walk();

    void play();
}

class Cat extends Animal implements Pet {

    Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat " + getAnimalName());
    }

    @Override
    public void play() {
        System.out.println("Playing with cat " + getAnimalName());
    }

    @Override
    public void walk() {
        System.out.println("Walking cat " + getAnimalName());

    }

    @Override
    public void greets() {
        System.out.println("Cat " + getAnimalName() + " says: Meow");
    }
}

class Dog extends Animal implements Pet {

    Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void greets() {
        System.out.println("Dog " + getAnimalName() + " says: Woof");
    }

    public void greets(String anotherDog) {
        String newAnotherDog = anotherDog;
        System.out.println("Woooof");
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + getAnimalName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + getAnimalName());
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + getAnimalName());
    }
}

class BigDog extends Dog {

    BigDog(String animalName) {
        super(animalName);
    }

    public void greets() {
        System.out.println("Wooow");
    }

    public void greetsDog() {
        super.greets("Woooow");

    }

    public void greets(String anotherBigDog) {
        String newAnotherBigDog = anotherBigDog;
        System.out.println("Woooooooooooow");
    }

}



