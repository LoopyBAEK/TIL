package godOfJava.d.string.practice;

public class UseStringMethods {
    public static void main(String[] args) {
        String str = "The String class represents character strings.";
        UseStringMethods sample = new UseStringMethods();
        sample.printWords(str);
        sample.findString(str, "string");
        sample.findAnyCaseString(str, "string");
        sample.countChar(str, 's');
        sample.printContainWords(str, "ss");
    }

    public void printWords(String str){
        String[] wordsArray = str.split(" ");
        for(String word : wordsArray){
            System.out.println(word);
        }
    }

    public void findString(String str, String findStr){
        System.out.println("string is appeared at " + str.indexOf(findStr));
    }

    public void findAnyCaseString(String str, String findStr){
        System.out.println("string is appeared at " + str.toLowerCase().indexOf(findStr));
    }

    public void countChar(String str, char c){
        char[] wordsArray = str.toCharArray();
        int count = 0;
        for(char word : wordsArray){
            if(word == c){
                count++;
            }
        }
        System.out.println("char 's' count is " + count);
    }

    public void printContainWords(String str, String findStr){
        String[] wordsArray = str.split(" ");
        for(String word : wordsArray){
            if(word.contains(findStr)){
                System.out.println(word + " contains " + findStr);
            }
        }
    }
}
