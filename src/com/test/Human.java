package com.test;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Human {
    private Boolean sex;
    private String firstName;
    private String lastName;
    private float height;
    private float weight;

    public Human(Boolean sex, String firstName, String lastName, float height, float weight) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Boolean getSex() {
        return sex;
    }

    public float getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "This " + sex + "'s name " + firstName + " and surname " + lastName + ", is " + height + " tall and weigh " + weight + " kilos";
    }

    public boolean talk(boolean x, boolean y) {
        if (!x && !y) return true;
        else if (x && !y) return true;
        else if (!x && y) return true;
        else if (x && y) {
            Random random1 = new Random();
            if (random1.nextInt(100) < 50) return true;
            else return false;
        }
        return false;
    }

    public boolean enduring(boolean x, boolean y) {
        Random r2 = new Random();
        if (!x && !y) {
            if (r2.nextInt(100) < 5) return true;
        } else if (!x && y) {
            if (r2.nextInt(100) < 70) return true;
        } else if (x && !y) {
            if (r2.nextInt(100) < 70) return true;
        } else if (x && y) {
            if (r2.nextInt(100) < 5.6) return true;
        }
        {
            return false;
        }
    }

    public boolean spendTime(float m, float f) {
        Random rand = new Random();
        if ((m <= f) && ((m * 1.1) > f)) {//больше на 10%
            if (rand.nextInt(100) < 85) {
                return true;
            } else if ((m >= f) && ((m * 1.1) < f)) {//меньше на 10%
                if (rand.nextInt(100) < 95) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }


    public Human haveRelationships(Human human1, Human human2) {
        if (!human1.getSex()) {
            return birth(human1);
        } else if (!human2.getSex()) {
            return birth(human2);
        }
        return null;
    }

    public Human birth(Human human) {
        Female females = (Female) human;
        Human child1;
        child1 = females.giveBirth();
        out.println(child1);
        return child1;
    }

    public static Human gener(Scanner scanner, Boolean sex) {
        String name;
        out.print("Insert name: ");
        name = scanner.next();
        if (name.isEmpty()) {
            out.println("You did not insert name!");
        }
        //ввод фамилии
        String surname;
        out.print("Insert surname: ");
        surname = scanner.next();
        if (surname.isEmpty()) {
            out.println("You did not insert surname!");
        }
        //ввод роста
        String sHeight;
        float height = 0;
        boolean val = true;

        do {
            out.print("Insert height: ");
            sHeight = scanner.next();
            height = Float.parseFloat(sHeight);
            if (sHeight.isEmpty()) {
                out.println("You did not insert height!");
            } else if (height <= 0) {
                out.println("Human height cannot be like that");
            } else val = false;
        }
        while (val);

        String sWeight;
        float weight = 0;
        boolean val2 = true;
        do {
            out.print("Insert weight: ");
            sWeight = scanner.next();
            weight = Float.parseFloat(sWeight);
            if (sWeight.isEmpty()) {
                out.println("You did not insert weight!");
            } else if (weight <= 0) {
                out.println("Human weight cannot be like that");
            } else val2 = false;
        }
        while (val2);

        if (sex) {
            return new Male(name, surname, height, weight);
        } else {
            return new Female(name, surname, height, weight);
        }
    }

}
