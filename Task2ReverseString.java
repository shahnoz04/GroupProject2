package GroupProject2;
/*Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH"
 */

public class Task2ReverseString {
    public static void main(String[] args) {
        String str="Hello";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
    }
}
