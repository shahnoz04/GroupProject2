package GroupProject2;
/*3. Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */


public class Task3Palindrome {
    public static void main(String[] args) {
        String palindrome="Madam";
        String reverse="";
        for (int i =palindrome.length()-1; i >=0; i--) {
            reverse=reverse+palindrome.charAt(i);
        }
        if(reverse.equalsIgnoreCase(palindrome)){
            System.out.println("palindrome");;
        } else {
            System.out.println("not a palindrome");
        }


    }
}


