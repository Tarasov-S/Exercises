package thinkinginjava.chapter03.exercise05;

class Dog {

    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    void displayName() {
        System.out.println(name);
    }

    void speak() {
        System.out.println(says);
    }
}
