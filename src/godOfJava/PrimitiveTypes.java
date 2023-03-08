package godOfJava;

public class PrimitiveTypes {
    int intDefault1;
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
//        types.chekcByte();
//        types.checkOtherTypes();
//        types.checkChar();
          types.defaultValues();
    }

    public void chekcByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin=" + byteMin);
        System.out.println("byteMax=" + byteMax);

        byteMin = (byte) (byteMin - 1);
        byteMax = (byte) (byteMax + 1);
        System.out.println("byteMin-1=" + byteMin);
        System.out.println("byteMax+1=" + byteMax);
    }

    public void checkOtherTypes(){
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L; // long타입은 숫자 가장 뒤에 L을 붙여주지 않으면 int로 인식해 컴파일 오류 발생
        System.out.println("shortMax=" + shortMax);
        System.out.println("intMax=" + intMax);
        System.out.println("longMax=" + longMax);

        shortMax = (short)(shortMax + 1);
        intMax = intMax + 1;
        longMax = longMax + 1;
        System.out.println("shortMax+1=" + shortMax); // 최소값
        System.out.println("intMax+1=" + intMax); // 최소값
        System.out.println("longMax+1=" + longMax); // 최소값
    }

    public void checkChar(){
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin=[" + charMin + "]");
        System.out.println("charMax=[" + charMax + "]");

        int intValue = 'a';
        System.out.println("intValue=[" + intValue + "]");

        char castValue = 44032;

        // 잘못 정의한 char 찾기
        char a = 'a';
//        char b = 'ab';
        // 홑따옴표 안에 \ u로 시작하지 않는 이상 두 개의 문자가 올 수 없다.
        char c = '가';
//        char d = '\ u97'
        // \ u 뒤에는 반드시 4개의 16진수 값이 와야만 한다.
        char e = '\u1188';
//        char f = -1;
        // char는 자바의 정수형 중 유일한 부호가 없는 값이다. 따라서, 음수는 표현하지 못한다.
        char g = 999;
    }

    public void checkBooleean(){
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }

    public void defaultValues(){
        int intDefault2; // 여기까지는 intDefault를 사용하는 부분이 없기에 수행이 됨
        System.out.println(intDefault1);
//        System.out.println(intDefault2);
        // 지역변수를 만들어놓고 사용하지 않을 때에는 초기화를 하지 않아도 되지만, 사용할 때에는 반드시 초기화를 해야 한다.
    }
}