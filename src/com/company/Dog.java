package com.company;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public Dog() {
        super();
        setName("Sharik");
        setBreed("Dvornyashka");
        setCommands("Fu");

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;

    }

    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;

    }

    public void makeVoice() {
        System.out.println("Gav");
    }

    public void makeVoice(String voice, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int number, String voice) {
        for (int i = 1; i <= number; i++) {
            System.out.println(voice);
        }
    }

    public final void getInfo(int num) {

        switch (num) {

            case 1:

                String info = "Shelter's name: " + shelter.getName() + " \nShelter's address: " + shelter.getAddress() + " \n" +

                        "Dog's name: " + getName() + "\n" + "Dog's breed: " + getBreed() + "\n" + "Commands: " + getCommands() + "\n" +

                        "Age: " + getAge() + "\n" + "Color: " + getColor() + "\n";

                System.out.println(info);

                break;

            case 2:

                info = "Dog's name: " + getName() + "\n" + "Dog's breed: " + getBreed() + "\n" +

                        "Age: " + getAge() + "\n" + "Color: " + getColor() + "\n";

                System.out.println(info);

                break;

            case 3:

                info = "Dog's name: " + getName() + "\n" + "Dog's breed: " + getBreed() + "\n" + "Commands: " + getCommands() + "\n" +

                        "Age: " + getAge() + "\n" + "Color: " + getColor() + "\n";

                System.out.println(info);

                break;

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }
}
