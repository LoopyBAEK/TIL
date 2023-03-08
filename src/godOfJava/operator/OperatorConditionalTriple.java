package godOfJava.operator;

public class OperatorConditionalTriple {
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlindDateFlag(30);
        operator.doBlindDateFlag(80);
    }
    public boolean doBlindDateFlag(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        return doBlindDateFlag;
    }
}
