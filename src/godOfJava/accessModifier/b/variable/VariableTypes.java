package godOfJava.accessModifier.b.variable;

public class VariableTypes {
    int instanceVariable;
    static int classVariable;

    public void method(int parameter){
        int localVariable;
    }

    public void anotherMethod(){
        if(true){
            int localVariable;
            if(true){
//                int localVariable;    // 중괄호 안에 동일한 이름을 갖는 지역 변수를 선언하면 안 된다
            }
        }

        if(true){
            int localVariable;
        }

    }
}
