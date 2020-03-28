package com.test;

import java.io.IOException;
import java.util.Scanner;

import static com.test.Human.gener;
import static java.lang.System.out;

public class Main {
    private static boolean x;
    private static boolean y;

    static boolean valueOf(Scanner readerGender) throws IOException {
        while (true) {
            out.print("Insert gender M/F: ");
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
            if (i == 0) x = a;
            else y = a;
            humans[i] = gener(scanner, a);
            out.println(humans[i].toString());

        }

        out.println("**************************************************************************************");

        out.println(humans[0].toString());
        out.println(humans[1].toString());
        Human child = test(humans[0], humans[1]);

/*        Human child1;
        if (!humans[0].getSex() && humans[1].getSex()) {
            Female females = (Female) humans[0];
            child1 = females.giveBirth();
            out.println(child1);
        } else if (!humans[1].getSex() && humans[0].getSex()) {
            Female females = (Female) humans[1];
            child1 = females.giveBirth();
            out.println(child1);
        }*/

    }

    public static Human test(Human human1, Human human2) {
        boolean xx = human1.talk(x, y);
        boolean yy = human1.enduring(x, y);
        boolean zz = human1.spendTime(human1.getHeight(), human2.getHeight());
        if (xx) {
            out.println("they'll talk");
        } else out.println("they will not talk");

        if (yy) {
            out.println("they'll sustain each other's society");
        } else out.println("they will not sustain each other's society");

        if (zz) {
            out.println("they'll spend time together");
        } else out.println("they will not spend time together");

        if (xx && yy && zz) {
            Human child;
            out.print("They have a relationship and a baby was born. ");
            child = human1.haveRelationships(human2);
            return child;
        } else out.println("nothing happened ... broke up");
        return null;
    }
}


