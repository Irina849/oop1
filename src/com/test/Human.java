package com.test;

import java.util.Random;

public abstract class Human {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }


    public float getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "This " + sex + "'s name " + firstName + " and surname " + lastName + ", is " + height + " tall and weigh " + weight + " kilos";
    }

    public boolean talking(boolean x, boolean y) {
        if (x == false && y == false) {
            return true;
        } else if (x == true && y == false) {
            return true;
        } else if (x == false && y == true) {
            return true;
        } else if (x == true && y == true) {
            Random r1 = new Random();
            if (r1.nextInt(100) < 50) {
                return true;
            } else
                return false;
        }
        return false;
    }

    public boolean enduring(boolean x, boolean y) {
        if (x == false && y == false) {
            Random r2 = new Random();
            if (r2.nextInt(100) < 5) {
                return true;
            }
        } else if (x == false && y == true) {
            Random r3 = new Random();
            if (r3.nextInt(100) < 70) {
                return true;
            }
        } else if (x == true && y == false) {
            Random r4 = new Random();
            if (r4.nextInt(100) < 70) {
                return true;
            }
        } else if (x == true && y == true) {
            Random r5 = new Random();
            if (r5.nextInt(100) < 5.6) {
                return true;
            }
        }
        {
            return false;
        }
    }

    public boolean spendTime(float m, float f) {
        if ((m <= f) && ((m * 1.1) > f)) {//больше на 10%
            Random rTog1 = new Random();
            if (rTog1.nextInt(100) < 85) {
                return true;
            } else if ((m >= f) && ((m * 1.1) < f)) {//меньше на 10%
                Random rTog2 = new Random();
                if (rTog2.nextInt(100) < 95) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    // public Human haveRelationships(boolean x, boolean y);

}
