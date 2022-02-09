package com.company;

public interface WildAnimal {
    void hunting();
}

class Lion extends Animal implements WildAnimal {

    Lion(String animalName) {
        super(animalName);
    }

    @Override
    public void greets() {
        System.out.println("Lion " + getAnimalName() + " says: Roar");
    }

    @Override
    public void hunting() {
        System.out.println("Lion " + getAnimalName() + " goes hunting");
    }
}

class Wolf extends Animal implements WildAnimal {

    Wolf(String animalName) {
        super(animalName);
    }

    @Override
    public void greets() {
        System.out.println("Wolf " + getAnimalName() + " says: Hawoo");
    }

    @Override
    public void hunting() {
        System.out.println("Wolf " + getAnimalName() + " goes hunting");
    }
}

