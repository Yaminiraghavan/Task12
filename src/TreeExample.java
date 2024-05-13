import java.util.TreeMap;

public class TreeExample {
    public static void main(String[] args) {
        TreeMap<String , Integer>mp=new TreeMap<>();
        mp.put( "Yamini" , 11);
        mp.put( "Somiya", 12);
        mp.put( "Deva" , 13);
        System.out.println("Names of employees in alphabetical order: "+ mp.keySet());
    }
}
