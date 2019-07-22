package com.company;


import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    Shelter shelter = new Shelter();


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
