package godOfJava.array;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension array = new ArrayTwoDimension();
        array.twoDimensionArray();
    }

    public void twoDimensionArray(){
        int[][] twoDim;
        twoDim = new int[2][3];
//        twoDim = new int[2][];
//        twoDim = new int[][]; --> X
//        twoDim = new int[][2]; --> X

//        twoDim = new int[2][];
//        twoDim[0] = new int[3];
//        twoDim[1] = new int[2];
//        2차원 배열의 공간의 크기를 서로 다르게 지정할 수 있다.

//        int[][] twoDim{{1, 2, 3}, {4, 5, 6}};
//        =
//        int[][] twoDim = new int[2][3];
//        twoDim[0][0] = 1;
//        twoDim[0][1] = 2;
//        twoDim[0][2] = 3;
//        twoDim[1][0] = 4;
//        twoDim[1][1] = 5;
//        twoDim[1][2] = 6;
    }
}
