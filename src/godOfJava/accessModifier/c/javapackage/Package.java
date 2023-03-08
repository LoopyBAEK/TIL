package godOfJava.accessModifier.c.javapackage;

import godOfJava.accessModifier.c.javapackage.sub.Sub;

public class Package {
    public static void main(String[] args) {
        System.out.println("Package class.");
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}
