package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("_____________________________________");
        Dog dog1 = new Dog();
        dog1.getInfo(1);
        dog1.makeVoice();
        System.out.println("_____________________________________");


        Dog dog2 = new Dog("Rex", "Ovcharka", Color.BROWN, new Shelter("German dogs", "Isanov street"));
        dog2.getInfo(2);
        dog2.makeVoice("Guf", 2);
        System.out.println("_____________________________________");


        Dog dog3 = new Dog("Petrik", "Chihuahua", Color.GRAY, new Shelter("Premium dogs", "Moskva street"), "Kuvyrok");
        dog3.getInfo(3);
        dog3.makeVoice(3, "Chav");
        System.out.println("_____________________________________");

    }
}
