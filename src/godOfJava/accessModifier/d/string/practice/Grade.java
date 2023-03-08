package godOfJava.accessModifier.d.string.practice;

public class Grade {
    public static void main(String[] args) {
        String[] grade = {"A", "B", "C", "D", "E"};
        for(int i = 0; i < grade.length; i++){
            System.out.println(grade[i]);
        }
    }

    public void setData(int a){
        System.out.println("I'm so cute");
    }

    public void setData(int a, int b){
        System.out.println("Overloading!");
    }
}
