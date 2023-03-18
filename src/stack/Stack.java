package stack;

public class Stack {
    int mx = 100000;
    int[] data = new int[mx];
    int pos = 0;
    public static void main(String[] args) {

    }

    public void push(int x){
        data[pos] = x;
        pos++;
    }

    public void pop(){
        pos--;
    }

    public int top(){
        return data[pos - 1];
    }

    public void test(){

    }
}
