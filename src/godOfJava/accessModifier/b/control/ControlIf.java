package godOfJava.accessModifier.b.control;

public class ControlIf {
    public static void main(String[] args) {
        ControlIf control = new ControlIf();
        control.ifStatement();
    }

    public void ifStatement(){
        if(true);   // 컴파일/실행이 정상적으로 되지만 이렇게 하면 아무런 의미도 없음
        if(true) System.out.println("It's true");
        if(true)
            System.out.println("It's also true.");
        if(false) System.out.println("It's false");
    }
}
