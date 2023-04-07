package godOfJava.d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();
        for(int i = 0; i < 10; i++){
            System.out.println(sample.getSixNumber());
        }
    }

    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> set = new HashSet<>();
        Random random = new Random();
        while(true){
            int tempNumber = random.nextInt(45);
            set.add(tempNumber);
            if(set.size() == 6){
                break;
            }
        }
        return set;
    }
}
