package thinkinginjava.chapter03.exercise07;

import java.util.Random;

class Coin {

    void flip() {
        Random r = new Random();

        if (r.nextBoolean()) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
