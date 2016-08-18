package thinkinginjava.chapter05.exercise06;

class Dog {

    private String response = "I am a dog, I do not know what the ";

    void bark() {
        System.out.println("Hello! I am a dog.");
    }

    void bark(int i, char c) {
        System.out.println("Int first!");
    }

    void bark(char c, int i) {
        System.out.println("Char first!");
    }


}
