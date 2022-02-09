package com.company;

public abstract class Animal {
    private String animalName;

    Animal(String animalName) {
        this.animalName = animalName;
    }


    public String getAnimalName() {
        return animalName;
    }

    public abstract void greets();
}


