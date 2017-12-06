package thinkinginjava.chapter08.exercise04;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle.erase");
    }

    @Override
    public void test() {
        System.out.println("Rectangle: OK");
    }
}
