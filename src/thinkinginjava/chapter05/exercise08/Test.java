package thinkinginjava.chapter05.exercise08;

class Test {

    private void theMethod() {
        System.out.print("It work! ");
    }

    void callTheMethod() {
        theMethod();
        this.theMethod();
    }

}
