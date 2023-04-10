package godOfJava.d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();
    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();

        for (int i = 1; i <= 5; i++) {
            sample.printHeight(i);
        }

        int count = 1;
        while (count <= 5){
            sample.printAverage(count);
            count++;
        }
    }

    public void setData(){
        ArrayList<Integer> class1 = new ArrayList<>();
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);

        ArrayList<Integer> class2 = new ArrayList<>();
        class2.add(160);
        class2.add(165);
        class2.add(167);
        class2.add(186);

        ArrayList<Integer> class3 = new ArrayList<>();
        class3.add(158);
        class3.add(177);
        class3.add(187);
        class3.add(176);

        ArrayList<Integer> class4 = new ArrayList<>();
        class4.add(173);
        class4.add(182);
        class4.add(181);

        ArrayList<Integer> class5 = new ArrayList<>();
        class5.add(170);
        class5.add(180);
        class5.add(165);
        class5.add(177);
        class5.add(172);

        gradeHeights.add(class1);
        gradeHeights.add(class2);
        gradeHeights.add(class3);
        gradeHeights.add(class4);
        gradeHeights.add(class5);

    }

    private void printHeight(int classNo) {
        System.out.println("Class No.:" + (classNo));
        for(int height : gradeHeights.get(classNo-1)) {
            System.out.println(height);
        }
    }

    public void printAverage(int classNo){
        double sum = 0;
        System.out.println("Class No.:" + classNo);
        for(int height : gradeHeights.get(classNo - 1)){
            sum += height;
        }
        System.out.println("Height average:" + (sum / gradeHeights.get(classNo - 1).size()));
    }
}
