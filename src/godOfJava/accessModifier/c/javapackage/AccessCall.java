package godOfJava.accessModifier.c.javapackage;

import godOfJava.accessModifier.c.javapackage.sub.AccessModifier;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();  // 누구나 접근 가능
//        accessModifier.protectedMethod();   // 같은 패키지 내에 있거나 상속받은 경우에만 접근 가능
//        accessModifier.pacakagePrivateMethod(); // 같은 패키지 내에 있을 때만 접근 가능
//        accessModifier.privateMethod(); // 해당 클래스 내에서만 접근 가능
    }
}
