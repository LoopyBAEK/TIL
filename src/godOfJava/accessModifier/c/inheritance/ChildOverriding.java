package godOfJava.accessModifier.c.inheritance;

public class ChildOverriding extends ParentOverriding{
    public ChildOverriding(){
        System.out.println("ChildOverring Constructor");
    }

    public void printName(){
        System.out.println("ChildOverriding printName()");
    }
}
