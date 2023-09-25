package GroupProject2;

import java.util.Arrays;

/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
public class Task5Anagrams {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String sorted1=new String(array1);
        String sorted2=new String(array2);

        if (sorted1.length()==sorted2.length()){
            if(sorted1.equals(sorted2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not an anagram");
            }
        }else{
            System.out.println("Not an anagram");
        }

    }
}
