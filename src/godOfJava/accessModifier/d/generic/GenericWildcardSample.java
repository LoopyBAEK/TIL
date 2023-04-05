package godOfJava.accessModifier.d.generic;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample sample = new GenericWildcardSample();
    }

    // 메소드를 제네릭하게 선언하기
    public <T> void genericMethod(WildcardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard, "Data");
    }

    // Bounded Wildcard
    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c, T addValue){

    }

    // 한 개 이상의 제네릭 타입 선언
    public <S, T extends Car> void multiGenericMethod(WildcardGeneric<T> c, T addValue, S another){

    }
}
