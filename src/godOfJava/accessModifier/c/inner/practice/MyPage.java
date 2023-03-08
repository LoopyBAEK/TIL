package godOfJava.accessModifier.c.inner.practice;

public class MyPage {
    static InputBox input;
    public static void main(String[] args) {
        MyPage myPage = new MyPage();
        myPage.setUI();
        myPage.pressKey();
    }

    public void setUI(){
        input = new InputBox();
        KeyEventListener listener = new KeyEventListener() {
            @Override
            public void onKeyDown() {
                System.out.println("Key Down");
            }

            @Override
            public void onKeyUp() {
                System.out.println("Key Up");
            }
        };

        input.setKeyListener(listener);
    }

    public void pressKey(){
//        InputBox input = new InputBox();
        input.listenerCalled(2);
        input.listenerCalled(4);
    }
}
