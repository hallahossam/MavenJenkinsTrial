package org.example;

public class Main {

    public String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number== 1) return "One";
        if (number == 2) return "Two";

        return "Non from options";
    }
}