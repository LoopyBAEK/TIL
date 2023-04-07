package godOfJava.d.lang;

public class JavaLangNumber {
    public static void main(String[] args) {
        JavaLangNumber sample = new JavaLangNumber();
        sample.numberTypeCheck();
        sample.numberMinMaxCheck();
        sample.integerMinMaxCheckBinary();
    }

    public void numberTypeCheck(){
        String value1 = "3";
        String value2 = "5";
        byte byte1 = Byte.parseByte(value1);
        byte byte2 = Byte.parseByte(value2);
        System.out.println(byte1 + byte2);

        Integer refInt1 = Integer.parseInt(value1);
        Integer refInt2 = Integer.parseInt(value2);
        System.out.println(refInt1 + refInt2 + "7");
    }

    // 참조 자로형 중에서 Byte, Short, Integer, Long, Float, Double 타입들은 필요시 기본 자료형처럼 사용할 수 있다.
    // 따라서, new를 사용하여 객체를 만들지 않아도 값을 할당할 수 있다.
    public void numberTypeCheck2(){
        Integer refInt1;
        refInt1 = 100;
        System.out.println(refInt1.doubleValue());
    }

    // 기본 자료형을 참조 자료형으로 만든 클래스들은 Boolean 클래스를 제외하고 모두 MIN_VALUE와 MAX_VALUE라는 상수를 갖고 있다.
    // 해당 타입이 나타낼 수 있는 값의 범위를 확인하려면 static으로 선언되어 있는 이 상수들을 다음과 같이 사용하면 된다.
    public void numberMinMaxCheck(){
        System.out.println("Byte min=" + Byte.MIN_VALUE + " max=" + Byte.MAX_VALUE);
        System.out.println("Short min=" + Short.MIN_VALUE + " max=" + Short.MAX_VALUE);
        System.out.println("Integer min=" + Integer.MIN_VALUE + " max=" + Integer.MAX_VALUE);
        System.out.println("Long min=" + Long.MIN_VALUE + " max=" + Long.MAX_VALUE);
        System.out.println("Float min=" + Float.MIN_VALUE + " max=" + Float.MIN_VALUE);
        System.out.println("Double min=" + Double.MIN_VALUE + " max=" + Double.MAX_VALUE);
        // Character의 경우 그냥 출력할 경우 char 타입으로 출력되므로 int 타입으로 변환하여 그 값을 확인하도록 해놓았다.
        System.out.println("Character min=" + (int)Character.MIN_VALUE + " max=" + (int)Character.MAX_VALUE);
    }

    // Integer의 최소값과 최대값을 2진수와 16진수로 나타낸 결과를 보려면, Integer 클래스에서 제공하는 toBinaryString()라는 메소드를 사용하면 된다.
    public void integerMinMaxCheckBinary(){
        System.out.println("Integer BINARY min=" + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max=" + Integer.toBinaryString(Integer.MAX_VALUE));

        System.out.println("Integer HEX min=" + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max=" + Integer.toHexString(Integer.MAX_VALUE));
    }
}
