package godOfJava.d.lang;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systemPropertiesCheck();
        sample.numberMinMaxElapsedCheck();
    }

    public void systemPropertiesCheck(){
        System.out.println("java.version=" + System.getProperty("java.version"));
        // JAVA_HOME이라는 값은 JDK가 설치되어 있는 경로를 말한다.
        System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
    }

    // 각 타입별로 최대 최소값을 확인해서 출력하는 작업이 얼마나 소요되는지를 확인하고 있다.
    public void numberMinMaxElapsedCheck(){
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Milli second=" + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second=" + (System.nanoTime() - startNanoTime));
    }
}
