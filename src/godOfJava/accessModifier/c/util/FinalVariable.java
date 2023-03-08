package godOfJava.accessModifier.c.util;

import java.util.logging.XMLFormatter;

public class FinalVariable {
//    final int instanceVariable;   --> final이기 때문에 선언과 동시에 초기화해야 함
    final int instanceVariable = 1;

    public void method(final int parameter){
        final int localVariable;
        localVariable = 2;
//        localVariable = 3;    --> 이미 위에서 초기화 되었기 때문에 X
//        parameter = 4; --> 매개변수는 이미 초기화되어 넘어왔기 때문에 X
    }
}
