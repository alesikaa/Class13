package Class13;

import java.sql.SQLOutput;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        // replaces All upper case letters from A-Z
        String str="FGHGHgvhjh53467ˆ&%)()";
        // replaces All upper case letters from A-Z
        System.out.println(str.replaceAll("[A-Z]", "#"));
        // replaces All lower case letters from a-z
        System.out.println(str.replaceAll("[a-z]", "#"));
        // replaces all numbers 0-9
        System.out.println(str.replaceAll("[0-9]", "#"));
        // replaces All upper case letters from A-Z and lower case a-z
        System.out.println(str.replaceAll("[A-Za-z]", "#"));
        // replaces All upper case letters from A-Z and lower case a-z  and numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        // do not  replace All upper case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[ˆA-Za-z0-9]", "#"));

        System.out.println(str.replaceAll(" [A-Za-z0-9]", ""));


    }
}