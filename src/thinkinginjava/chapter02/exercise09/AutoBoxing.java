package thinkinginjava.chapter02.exercise09;

class AutoBoxing {

    void printPrimitiveInt(int i) {
        System.out.println(i);
    }

    void printObjectInt(Integer i) {
        System.out.println(i);
    }

    int getPrimitiveInt() {
        int i = 22;
        return i;
    }

    Integer getObjectInt() {
        Integer i = new Integer(33);
        return i;
    }

}
