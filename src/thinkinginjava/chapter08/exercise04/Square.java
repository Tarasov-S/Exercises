package thinkinginjava.chapter08.exercise04;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase");
    }

    @Override
    public void test() {
        System.out.println("Square: OK");
    }
}
