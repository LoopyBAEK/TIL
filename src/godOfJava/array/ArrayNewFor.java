package godOfJava.array;

public class ArrayNewFor {
    public static void main(String[] args) {
        ArrayNewFor array = new ArrayNewFor();
        array.newFor();
        array.twoDimFor();
        array.twoDimForWithCounter();
    }

    public void newFor(){
        int[] oneDim = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int data : oneDim){
            System.out.println(data);
        }

        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
    }

    public void twoDimFor(){
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        for(int[] dimArray : twoDim){
            for(int data : dimArray){
                System.out.println(data);
            }
        }
    }

    public void twoDimForWithCounter(){
        int[][] twoDim = {{1, 2, 3}, {4, 5, 6}};
        int oneCounter = 0;
        for(int[] dimArray : twoDim){
            int twoCounter = 0;
            for(int data : dimArray){
                System.out.println(data);
                twoCounter++;
            }
            oneCounter++;
        }
    }
}
