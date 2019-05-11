import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<String > list = new ArrayList<>();
        list.add("jeden");
        list.add("jeden");
        list.add("pięć");
        list.add("siedem");

        printList(list);

        List<Integer > list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(7);

        printList(list2);

        List<A > list3 = new LinkedList<>();
        list3.add(new A(1,"a"));
        list3.add(new A(2,"b"));
        list3.add(new A(3,"c"));

        printList(list3);

        Pair<Integer, String > p1 = new OreredPair<>(1, "jabłko");
        Pair<Integer, String> p2 = new OreredPair<>(2, "gruszka");
        Pair<Integer, String> p3 = new OreredPair<>(2, "gruszka");
        boolean same = Util.compare(p1, p2);
        System.out.println("Czy są jednakowe " + same);

//        Pair<String, Box<Integer>> p3 = new OreredPair<>("Alina", new Box());


//        List<Point> list = new ArrayList();
//        list.add(new Point(1,1));
//
//        Point s = list.get(0);

//        Box<Person> box = new Box();
//        box.setObject(new Person("Jan", "Nowak", 36));

//        Person p = box.getObject();
//        System.out.println(p.getName());
    }

    public static void printList(List<?> list){
        for(Object e: list){
            System.out.println(e + " ");
        }
        System.out.println();
    }

}

class Box<T>{
    private T object;

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}

interface Pair<K, V>{

    K getKey();
    V getValue();
}

class OreredPair<K, V> implements Pair<K, V>{

    private K key;
    private V value;

    public OreredPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class Util {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());

    }
}