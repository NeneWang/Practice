import java.util.ArrayList;
import java.util.Arrays;

public class testClass {
	
//	https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
    public static void main(String[] args) {
        // TODO code application logic here
    	System.out.println(getCount("Hello"));
    }
    
    public static int getCount(String str) {
        int vowelsCount = 0;

        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u"));
        ArrayList<String> retainedVowels = new ArrayList<>(Arrays.asList(str.split("")));
        // your code here
        System.out.println(retainedVowels);
        retainedVowels.retainAll(vowels);

        System.out.println(retainedVowels);
        return retainedVowels.size();
      }
}
