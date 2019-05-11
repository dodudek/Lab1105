import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PersonTester {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Person> personList = new LinkedList<>();
//        List<Person> personList = new ArrayList<>();

        for(int i=0; i<100000; i++){
            personList.add(0, new Person("Maria", "Kowalska" + i, 36));

        }
        System.out.println(personList.get(7));

        int all = 100_000/2;
        for (int i=0; i<all; i++){
            personList.remove(personList.size() - 1);
            personList.remove(0);

                }

        long stop = System.currentTimeMillis();

        System.out.println(stop-start);
        }
    }


