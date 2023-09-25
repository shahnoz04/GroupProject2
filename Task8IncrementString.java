package GroupProject2;
/*Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
 */

public class Task8IncrementString {
    public static void main(String[] args) {
        String str1 = "123";
        System.out.println(Increment(str1));
        String str2 = "53456";
        System.out.println(Increment(str2));
        String str3 = "29";
        System.out.println(Increment(str3));
    }

    private static String Increment(String str) {

        int number = Integer.parseInt(str);
        number++;

        return Integer.toString(number);
    }

}

