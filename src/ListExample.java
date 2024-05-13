import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Apple");
        li.add("Orange");
        li.add("Jackfruit");

        String[] s= li.toArray(new String[0]);
        System.out.println("Elements of the array:");
        for(String element:s){
            System.out.println(element);
        }
    }
}
