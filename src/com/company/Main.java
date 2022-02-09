package com.company;

public class Main {

    public static void main(String[] args) {

        Cat newCat = new Cat("Kitty");
        Dog newDog = new Dog("Sharik");
        BigDog newBigDog = new BigDog("Poll");
        Lion newLion = new Lion("King");
        Wolf newWolf = new Wolf("Wolfy");

        newCat.greets();
        newCat.feed();
        newCat.walk();
        newCat.play();

        newDog.greets();
        newDog.greets("Willy");
        newDog.feed();
        newDog.walk();
        newDog.play();

        newBigDog.greets();
        newBigDog.greetsDog();
        newBigDog.greets("Lucky");

        newLion.greets();
        newLion.hunting();

        newWolf.greets();
        newWolf.hunting();









    }
}
