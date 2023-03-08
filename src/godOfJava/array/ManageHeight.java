package godOfJava.array;

public class ManageHeight {
    int[][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight height = new ManageHeight();
        height.setData();
//        height.printHeight(1);
//        height.printHeight();
//        height.printAverage(1);
        height.printAverage();
    }


    public void setData(){
        gradeHeights = new int[][]{{170, 180, 173, 175, 177}, {160, 165, 167, 186}, {158, 177, 187, 176}, {173, 182, 181}, {170, 180, 165, 177, 172}};
    }

    public void printHeight(int classNo){
        int classLength = gradeHeights[classNo-1].length;
        System.out.println("Class No. :" + classNo);
        for(int i = 0; i < classLength; i++){
            System.out.println(gradeHeights[classNo-1][i]);
        }
    }

    public void printHeight(){
        int gradeHeightsLength = gradeHeights.length;
        for(int i = 0; i < gradeHeightsLength; i++){
            System.out.println("Class No. :" + (i + 1));
            int students = gradeHeights[i].length;
            for(int j = 0; j < students; j++){
                System.out.println(gradeHeights[i][j]);
            }
        }
    }

    public void printAverage(int classNo){
        double sum = 0;
        int classLength = gradeHeights[classNo - 1].length;
        for(int i = 0; i < classLength; i++){
            sum += gradeHeights[classNo - 1][i];
        }

        System.out.println("Class No. :" + classNo);
        System.out.println("Height average : " + (sum / classLength));
    }

    public void printAverage(){
        int gradeHeightsLength = gradeHeights.length;
        int classNo = 1;
        while(gradeHeightsLength > 0){
            printAverage(classNo);
            classNo++;
            gradeHeightsLength--;
        }
    }
}
