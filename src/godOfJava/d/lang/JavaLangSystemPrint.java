package godOfJava.d.lang;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        sample.printStreamCheck();
    }

    public void printStreamCheck(){
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }

    public void printInt(int value){
        System.out.println(value);
    }

    public void printNull(){
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj = " is object's value");
    }

    // obj 자체가 null이고, 이 객체의 toString()이라는 메소드를 불러버렸으니 예외가 발생할 수밖에 없다.
    public void printNullToString(){
        Object obj = null;
        // 예외발생
        System.out.println(obj.toString());
    }
}
