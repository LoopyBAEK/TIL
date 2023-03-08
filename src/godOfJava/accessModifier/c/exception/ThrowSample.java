package godOfJava.accessModifier.c.exception;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        sample.throwException(13);
        try {
            sample.throwsException(13);
        }catch (Exception e){

        }
    }

//    public static void main(String[] args) throws Exception{
//        ThrowSample sample = new ThrowSample();
//        sample.throwException(13);
//        sample.throwsException(13);
//    }

    public void throwException(int number){
        try {
            if(number > 12){
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void throwsException(int number) throws Exception{
        if(number < 12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }

    public void multiThrows() throws NullPointerException, Exception{

    }
}
