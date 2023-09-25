package GroupProject2;
/*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
 */

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Shahnoz");
        names.add("Shahlo");
        names.add("Amina");
        names.add("Anora");
        names.add("Zamira");

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).startsWith("A")){
                System.out.println(names.get(i).toLowerCase());
            }
        }



    }
}
