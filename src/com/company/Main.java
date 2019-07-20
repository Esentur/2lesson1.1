package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("_____________________________________");
        Dog dog1 = new Dog();
        Pet pet1 = new Pet(1);
        pet1.getInfo(dog1, 1);
        dog1.makeVoice();
        System.out.println("_____________________________________");


        Dog dog2 = new Dog("Rex", "Ovcharka", Color.BROWN, new Shelter("German dogs", "Isanov street"));
        Pet pet2 = new Pet(1);
        pet2.getInfo(dog2, 2);
        dog2.makeVoice("Guf", 2);
        System.out.println("_____________________________________");


        Dog dog3 = new Dog("Petrik", "Chihuahua", Color.GRAY, new Shelter("Premium dogs", "Moskva street"), "Kuvyrok");
        Pet pet3 = new Pet(1);
        pet3.getInfo(dog3, 3);
        dog3.makeVoice(3,"Chav");
        System.out.println("_____________________________________");

    }
}
