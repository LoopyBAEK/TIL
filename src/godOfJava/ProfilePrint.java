package godOfJava;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        profile.setAge((byte)24);
        profile.setName("백장미");
        profile.setMarried(false);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }

    public void setAge(byte myAge){
        age = myAge;
    }

    public byte getAge(){
        return age;
    }

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean flag){
        isMarried = flag;
    }

    public boolean isMarried(){
        return isMarried;
    }
}
