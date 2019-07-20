package com.company;


import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    Shelter shelter = new Shelter();

    public Pet(int x) {
    }

    public Pet() {
        setAge(1);
        this.setColor(Color.BLACK);
    }

    public Pet(Color color, Shelter shelter) {
        this.age = generateDefaultAge();
        this.shelter = shelter;
        this.setColor(color);

    }

    private int generateDefaultAge() {
        Random r = new Random();
        int rnd = r.nextInt(99) + 1;
        this.age = rnd;
        return age;


    }

    public final void getInfo(Dog dog, int num) {
        switch (num) {
            case 1:
                String info = "Shelter's name: " + shelter.getName() + " \nShelter's address: " + shelter.getAddress() + " \n" +
                        "Dog's name: " + dog.getName() + "\n" + "Dog's breed: " + dog.getBreed() + "\n" + "Commands: " + dog.getCommands() + "\n" +
                        "Age: " + dog.getAge() + "\n" + "Color: " + dog.getColor() + "\n";
                System.out.println(info);
                break;
            case 2:
                info = "Dog's name: " + dog.getName() + "\n" + "Dog's breed: " + dog.getBreed() + "\n" +
                        "Age: " + dog.getAge() + "\n" + "Color: " + dog.getColor() + "\n";
                System.out.println(info);
                break;
            case 3:
                info = "Dog's name: " + dog.getName() + "\n" + "Dog's breed: " + dog.getBreed() + "\n" + "Commands: " + dog.getCommands() + "\n" +
                        "Age: " + dog.getAge() + "\n" + "Color: " + dog.getColor() + "\n";
                System.out.println(info);
                break;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
