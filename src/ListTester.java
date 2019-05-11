import java.util.*;

public class ListTester {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(5);

        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.remove(0));
        myList.clear();
        System.out.println(myList.size());

        //musimy rzutować elemety i wiedzieć jakiego są typu przy robieniu na nich operacji jeśli nie określimy typu Listy tak jak wcześniej
        List myList1 = new ArrayList<>();
        myList1.add(1);
        myList1.add(new Object());
        myList1.add("siedem");

        System.out.println(myList1.get(0));
        System.out.println(myList1.get(1));
        System.out.println(myList1.get(2));

        System.out.println((int)myList1.get(0) + (String)myList1.get(2));


        List<Integer> myList2 = new ArrayList<>();
        myList2 = Arrays.asList(1,62345,8543,68,2467);

        System.out.println(myList2.size());

        for (int i=0; i<myList2.size(); i++){
            System.out.println(myList2.get(i));

        }

        for (Integer i: myList2){
            System.out.println(i);
        }

        System.out.println("----------------------------");

        Iterator<Integer> iterator = myList2.listIterator();

        while (iterator.hasNext()){

            Integer e = iterator.next();

            if(e%2 ==0){
                System.out.println("P: " + e);
            }
//
        }
        System.out.println(myList2);


        for(int i=0; i< myList2.size(); i++){
            if(myList2.get(i)%2==0){
                System.out.println(myList2.get(i));
            }
        }

        List<String> myList3 = new LinkedList<>();
        myList3.add("pierwszy");
        myList3.add("drugi");
        myList3.add("trzeci");
        myList3.add("czwarty");

        System.out.println(myList3);

        myList3.add(0, "zerowy");
        ((LinkedList<String>) myList3).remove( "drugi");

        System.out.println(myList3);


        List<String> myList4 = new LinkedList<>();
        myList4= new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "a"));

        System.out.println("Występuje: " + Collections.frequency(myList4,"a") + " raz/y");
    }
}
