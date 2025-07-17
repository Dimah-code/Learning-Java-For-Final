import  java.util.*;
public class Example_5_3 {
    public static void main(String[] args) {
        String str = "Hamidreza loves Zeinab loves pizza loves susage loves oil loves fire", subStr = "loves";
        int count;
        count = spaceCounter(str);
        System.out.println(count);
        count = substrCounter(str, subStr);
        System.out.println(count);
    }
    public static int spaceCounter(String str){
        int count = 0;
         int index = str.indexOf(" ");
         while(index >= 0){
           count++;
           index = str.indexOf(' ', index + 1);
           System.out.println("found in " + index);
        }
        return count;
    }
    public static int substrCounter(String str, String subStr){
        int count = 0;
        int index = str.indexOf(subStr);
        while(index >= 0){
            count++;
            index = str.indexOf(subStr, index + 1);
            System.out.println("found in " + index);
        }
        return count;
    }
}
