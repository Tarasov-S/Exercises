package thinkinginjava.chapter07.exercise01;

class Test {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (data == null) return "NO DATA";
        else return "data = " + data;
    }
}
