package thinkinginjava.chapter08.exercise02;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase");
    }
}
