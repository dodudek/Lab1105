import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {

    public static void main(String[] args) {

        Set<String>mySet = new HashSet<>();
        mySet.add("Wojtek");
        mySet.add("Agata");
        mySet.add("Wojtek");
        mySet.add("Tomek");
        mySet.add("Wojtek");

        mySet.remove("Wojtek");

        System.out.println("Ile elementów: " + mySet.size());

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){

            String name = iterator.next();
            System.out.println(name + " " + name.hashCode());

            }

        String a = "Tomek";
        String b = "Tomek";

        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " " + b.hashCode());
    }
}
