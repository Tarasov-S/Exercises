package thinkinginjava.chapter06.exercise05;

public class Test1 {

    public String publicString = new String("public");
    String packageString = new String("package-access");
    protected String protectedString = new String("protected");
    private String privateString = new String("privateString");

    public void publicMethod() {
        System.out.println(publicString);
    }

    void defaultMethod() {
        System.out.println(packageString);
    }

    protected void protectedMethod() {
        System.out.println(protectedString);
    }

    private void privateMethod() {
        System.out.println(privateString);
    }
}
