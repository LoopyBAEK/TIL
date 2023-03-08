package godOfJava.condition;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        long amount = 0L;
        // 1일 간격
//        for(int i = 1; i <= 365; i++){
//            amount += 1000000;
//            manager.getInterestRate(i);
//            manager.calculateAmount(i, amount);
//        }

        // 10일 간격
        for(int i = 10; i <= 365; i+=10){
            amount += 1000000;
            manager.getInterestRate(i);
            manager.calculateAmount(i, amount);
        }
    }

    public double getInterestRate(int day){
        double rate = 0;
        if(day <= 90){
            rate = 0.005;
        }else if(day > 90 && day <= 180){
            rate = 0.01;
        }else if(day > 180 && day <= 364){
            rate = 0.02;
        }else{
            rate = 0.056;
        }
        return rate;
    }

    public double calculateAmount(int day, long amount){
        double rate = getInterestRate(day);
//        System.out.println(amount);
//        System.out.println(rate);
        double interest = (double)amount * rate;
        System.out.println("날짜 : " + day);
        System.out.println("이자 : " + interest);
        System.out.println("예치금 + 이자 : " + (double)(amount + interest));
        return amount + interest;
    }
}
