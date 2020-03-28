package com.test;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Female extends Human {

    public Female(String firstName, String lastName, float height, float weight) {
        super(false, firstName, lastName, height, weight);
    }

    public Human giveBirth(Human dad) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean sex = random.nextBoolean();
        return newChild(scanner, sex, dad);
    }

    public Human newChild(Scanner scanner, boolean sex, Human dad) {
        out.println("Baby gender - " + sex);
        String name;
        out.print("Insert name: ");
        name = scanner.next();
        if (name.isEmpty()) {
            out.println("You did not insert name!");
        }
        String surname = dad.getLastName();

        float height = 0;
        if (sex == this.getSex()) {
            height = this.getHeight() + 0.1F * (dad.getHeight() - this.getHeight());
        } else if (sex == dad.getSex()) {
            height = dad.getHeight() + 0.1F * (this.getHeight() - dad.getHeight());
        }
        float weight = 0;
        if (sex == this.getSex()) {
            weight = this.getWeight() + 0.1F * (dad.getWeight() - this.getWeight());
        } else if (sex == dad.getSex()) {
            weight = dad.getWeight() + 0.1F * (this.getWeight() - dad.getWeight());
        }

        if (sex) {
            return new Male(name, surname, height, weight);
        } else {
            return new Female(name, surname, height, weight);
        }

    }
}
