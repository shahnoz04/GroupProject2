package GroupProject2;
/*Write a program to swap 2 String without a temporary variable
 */
public class Task1SwappingString {
    public static void main(String[] args) {
        String name1 = "Anna";
        String name2 = "Jack";
        System.out.println("name 1 - " + name1);
        System.out.println("name 2 - " + name2);

        name1 = name1 + name2;

        name2 = name1.substring(0, name1.length() / 2);
        name1 = name1.substring(name1.length() / 2, name1.length());
        System.out.println("name 1 - " + name1);
        System.out.println("name 2 - " + name2);
    }



}
