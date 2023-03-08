package godOfJava.array;

public class ArrayPrint {
    public static void main(String[] args) {
        ArrayPrint array = new ArrayPrint();
        array.printString();
        array.printPrimitiveArray();
    }

    public void printString(){
        System.out.println("strings = " + new String[0]);
        System.out.println("array = " + new ArrayPrint[0]);

//        strings = [Ljava.lang.String;@4f3f5b24
//        array = [LgodOfJava.Array.ArrayPrint;@7b23ec81
//        [L : 가장 앞의 "["는 해당 객체가 배열이라는 의미이며, 그 다음에 있는 L은 해당 배열은 참조 자료형이라는 의미이다.
//        java.lang.String : 해당 배열이 어떤 타입의 배열인지를 보여준다.
//        @1540e19d : 해당 배열의 고유 번호다(이 번호는 써먹을 데는 없다.)
    }

    public void printPrimitiveArray(){
        System.out.println("byteArray = " + new byte[1]);
        System.out.println("shortArray = " + new short[1]);
        System.out.println("intArray = " + new int[1]);
        System.out.println("longArray = " + new long[1]);
        System.out.println("floatArray = " + new float[1]);
        System.out.println("doubleArray = " + new double[1]);
        System.out.println("charArray = " + new char[1]);
        System.out.println("booleanArray = " + new boolean[1]);
    }
}
