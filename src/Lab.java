public class Lab {

    public static void main(String[] args) {

        String[] myArray = new String[] {"a", "b", "c", "d", "e"};
        printelements(myArray);

    }

    public static <T> void printelements(T[] tab){
        for(T s: tab){
            System.out.println(s + " ");
        }
        System.out.println();
    }
}

class Genetric <T1, T2, T3>{

    private T1 objectT1;
    private T2 objectT2;
    private T3 objectT3;

    public Genetric(T1 objectT1, T2 objectT2, T3 objectT3) {
        this.objectT1 = objectT1;
        this.objectT2 = objectT2;
        this.objectT3 = objectT3;
    }
}
