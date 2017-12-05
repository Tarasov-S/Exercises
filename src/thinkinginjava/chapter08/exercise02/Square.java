package thinkinginjava.chapter08.exercise02;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }
}
