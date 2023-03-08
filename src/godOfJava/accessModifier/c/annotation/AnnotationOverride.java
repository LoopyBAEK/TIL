package godOfJava.accessModifier.c.annotation;

import godOfJava.accessModifier.c.inheritance.Parent;

public class AnnotationOverride extends Parent {
    @Override
    public void printName(){
        System.out.println("AnnotationOverride");
    }

}
