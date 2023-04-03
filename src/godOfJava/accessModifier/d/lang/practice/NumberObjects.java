package godOfJava.accessModifier.d.lang.practice;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects sample = new NumberObjects();
        System.out.println(sample.parseLong("r1024"));
        System.out.println(sample.parseLong("1024"));

        sample.printOtherBase(1024);
    }

    public long parseLong(String data){
        try{
            Long.parseLong(data);
        } catch (NumberFormatException e) {
            System.out.println(data + " is not a number");
            return - 1;
        }
        return Long.parseLong(data);
    }

    public void printOtherBase(long value){
        System.out.println("Original:" + value);
        System.out.println("Binary  :" + Long.toBinaryString(value));
        System.out.println("Hex     :" + Long.toHexString(value));
        System.out.println("Octal   :" + Long.toOctalString(value));
    }
}
