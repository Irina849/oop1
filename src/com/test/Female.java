package com.test;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class Female extends Human {

    public Female(String firstName, String lastName, float height, float weight) {
        super(false, firstName, lastName, height, weight);
    }

    public Human giveBirth() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean sex = random.nextBoolean();
        Human h;
        h = newChild(scanner, sex);
        return h;
    }

    public Human newChild(Scanner scanner, boolean sex) {
        out.println("Baby gender - " + sex);
        return gener(scanner, sex);
    }
}
