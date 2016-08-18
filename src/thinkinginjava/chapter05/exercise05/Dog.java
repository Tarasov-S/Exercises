package thinkinginjava.chapter05.exercise05;

class Dog {

    private String response = "I am a dog, I do not know what the ";

    void bark() {
        System.out.println("Hello! I am a dog.");
    }

    void bark(boolean x) {
        System.out.println(response + "boolean");
    }

    void bark(char x) {
        System.out.println(response + "char");
    }

    void bark(byte x) {
        System.out.println(response + "byte");
    }

    void bark(short x) {
        System.out.println(response + "short.");
    }

    void bark(int x) {
        System.out.println(response + "int.");
    }

    void bark(long x) {
        System.out.println(response + "long.");
    }

    void bark(float x) {
        System.out.println(response + "float.");
    }

    void bark(double x) {
        System.out.println(response + "double.");
    }
}
