package org.example;


import org.junit.Test;

public class FizzBuzz {
    public Main fB = new Main();


    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        System.out.println(fizzBuzz);

    }

}
