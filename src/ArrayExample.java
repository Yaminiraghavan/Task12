import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayList li = new ArrayList<>();
        li.add("yamini");
        li.add("shalini");
        li.add("mini");

        System.out.println("ArrayList before removal: "+ li);

        li.clear();

        System.out.println("ArrayList after removal: "+ li);
    }
}
