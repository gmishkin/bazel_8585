package info.amsa.a;

import info.amsa.b.LibB;

public class Main {
    public static void main(String[] args) {
        var b = new LibB("1", "2");
        System.out.println(b.toString());
        b.doJava11();
    }
}
