package GroupProject2;
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class Task4CountingWords {
    public static void main(String[] args) {
        String name="Muborakshoi Jon";
        int count=0;
        String[]str=name.split(" ");
        for (int i = 0; i < str.length; i++) {
            count=count+1;

        }
        System.out.println(count);

    }
}
