package godOfJava.condition;

public class ControlWhile {
    public static void main(String[] args) {
        ControlWhile control = new ControlWhile();
        control.whileLoop1();
        control.whileLoop2();
        control.whileBreak();
        control.whileContinue();
//        control.whileContinueInfinit();  -- 이 녀석은 악마의 무한루프다 주석 풀지 않도록...
    }

    public void whileLoop1(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
            loop++;
            control.switchCalender(loop);
        }
    }

    // while문 안에서 6이 넘으면 더이상 반복할 필요가 없을 경우 (while문 안에서 if문 사용 예제를 보여주기 위한 작성)
    public void whileLoop2(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
            loop++;
            control.switchCalender(loop);

            if(loop == 6) loop = 100;
        }
    }

    public void whileBreak(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
            loop++;
            control.switchCalender(loop);

            if(loop == 6) break;
        }
    }

    public void whileContinue(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
            loop++;
            if(loop == 6) continue;
            control.switchCalender(loop);
        }
    }

    public void whileContinueInfinit(){
        ControlOfFlow control = new ControlOfFlow();

        int loop = 0;
        while(loop < 12){
            if(loop == 6) continue;
            loop++;
            control.switchCalender(loop);
        }
    }
}
