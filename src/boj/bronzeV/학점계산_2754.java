package boj.bronzeV;

import java.util.Scanner;

public class 학점계산_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();

        if(grade.toUpperCase().charAt(0) == 'A'){
            if(grade.charAt(1) == '+'){
                System.out.println(4.3);
            }else if(grade.charAt(1) == '0'){
                System.out.println(4.0);
            }else if(grade.charAt(1) == '-'){
                System.out.println(3.7);
            }
        } else if (grade.toUpperCase().charAt(0) == 'B') {
            if(grade.charAt(1) == '+'){
                System.out.println(3.3);
            }else if(grade.charAt(1) == '0'){
                System.out.println(3.0);
            }else if(grade.charAt(1) == '-'){
                System.out.println(2.7);
            }
        }else if(grade.toUpperCase().charAt(0) == 'C'){
            if(grade.charAt(1) == '+'){
                System.out.println(2.3);
            }else if(grade.charAt(1) == '0'){
                System.out.println(2.0);
            }else if(grade.charAt(1) == '-'){
                System.out.println(1.7);
            }
        }else if(grade.toUpperCase().charAt(0) == 'D'){
            if(grade.charAt(1) == '+'){
                System.out.println(1.3);
            }else if(grade.charAt(1) == '0'){
                System.out.println(1.0);
            }else if(grade.charAt(1) == '-'){
                System.out.println(0.7);
            }
        }else if(grade.toUpperCase().charAt(0) == 'F'){
            System.out.println(0.0);
        }

        // 2023-02-04
    }
}
