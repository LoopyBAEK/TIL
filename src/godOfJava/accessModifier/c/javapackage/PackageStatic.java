package godOfJava.accessModifier.c.javapackage;

// import godOfJava.c.javapackage.sub.SubStatic;
import static godOfJava.accessModifier.c.javapackage.sub.SubStatic.subStaticMethod;
import static godOfJava.accessModifier.c.javapackage.sub.SubStatic.CLASS_NAME;

public class PackageStatic {
    public static void main(String[] args) {
        // import static이 없다면 이렇게 사용
//        SubStatic.subStaticMethod();
//        System.out.println(SubStatic.CLASS_NAME);

//        import static 사용 시
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }


}
