package Class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str= "I like Java. I write a lot of code daily. I am from Batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()

    }
}
