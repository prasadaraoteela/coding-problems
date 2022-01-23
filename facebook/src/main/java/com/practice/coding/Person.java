package com.practice.coding;

/**
 * Created by Prasada Rao on 23/01/22 5:36 PM
 **/
public class Person {
    private int birthYear;
    private int deathYear;

    public Person(int birthYear, int deathYear) {
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }
}
