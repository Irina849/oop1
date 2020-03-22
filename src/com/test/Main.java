package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static boolean x = true;
    private static boolean y = false;

    static boolean valueOf(Scanner readerGender) throws IOException {
        while (true) {
            out.println("Insert gender M/F: ");

            String genderStr = readerGender.next();
            if (genderStr.isEmpty()) {
                out.println("You did not insert gender!");
                continue;
            }
            if ("m".equalsIgnoreCase(genderStr)) {
                return true;
            }
            if ("f".equalsIgnoreCase(genderStr)) {
                return false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Human[] humans = new Human[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Boolean a = valueOf(scanner);
            //ввод имени
            String name;
            out.println("Insert name: ");
            name = scanner.next();
            if (name.isEmpty()) {
                out.println("You did not insert name!");
            }
            //ввод фамилии
            String surname;
            out.println("Insert surname: ");
            surname = scanner.next();
            if (surname.isEmpty()) {
                out.println("You did not insert surname!");
            }
            //ввод роста
            String sHeight;
            out.println("Insert height: ");
            sHeight = scanner.next();
            float height = Float.parseFloat(sHeight);

            if (sHeight.isEmpty()) {
                out.println("You did not insert height!");
            }

            String sWeight;
            out.println("Insert weight: ");
            sWeight = scanner.next();
            float weight = Float.parseFloat(sWeight);
            if (sWeight.isEmpty()) {
                out.println("You did not insert weight!");
            }

            if (a) {
                humans[i] = new Male(name, surname, height, weight);
                //Male man1 = new Male(name, surname, height, weight);
                //out.println(man1.toString());
                out.println(humans[i].toString());
            } else {
                //Female fem1 = new Female(name, surname, height, weight);
                //out.println(fem1.toString());
                humans[i] = new Female(name, surname, height, weight);
                out.println(humans[i].toString());
            }
        }

    }
}


