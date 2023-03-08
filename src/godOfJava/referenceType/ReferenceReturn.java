package godOfJava.referenceType;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }

    public int intReturn(){
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn(){
        int[] returnArray = new int[10];
        return  returnArray;
    }

    public String stringReturn(){
        String returnString = "Return value";
        return  returnString;
    }

    public int calculateAfterIntReturn(){
        int returnInt = 0;
        return returnInt;
//        returnInt++;  --> 컴파일 에러 발생 : 리턴 문장 이후에는 어떤 문장도 있으면 안 됨
    }

    public int ifConditionIntReturn(){
        int returnInt = 0;
//        if(returnInt == 0){
//            return ++returnInt;
//        }else{
//            return --returnInt;
//        }
        // 이렇게 작성하는 것이 더 깔끔함
        if(returnInt == 0){
            return ++returnInt;
        }
        return --returnInt;
    }
}
