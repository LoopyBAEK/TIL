package godOfJava.array;

public class ArrayInitialize {
//        String[] month = {"Jaunuary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    static String[] month = {"Jaunuary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};    // 클래스 변수

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
//        array.otherInit();
//        System.out.println(array.getMonth(3));
    }

    public void otherInit(){
        int[] lottoNumbers = {5, 12, 23, 25, 38, 41, 2};
//        int[] lottoNumbers2;
//        lottoNumbers2 = {5, 12, 23, 25, 38, 41, 2};   // compile error
        int[] lottoNumbers3 = {5,
            12, 23,
            25, 38, 41, 2}; // 이렇게 하는 건 상관없음
    }

    public String getMonth(int monthInt){
        String[] month = {"Jaunuary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return month[monthInt + 1];
    }
}
