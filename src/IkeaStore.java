public class IkeaStore {

    public static void main(String[] args) {
        Chair chair = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janige", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);


        System.out.println("chair.equals(chair2): " + chair.equals(chair2));
        System.out.println("chair.equals(chair3): " + chair.equals(chair3));
        System.out.println("chair.equals(chair4): " + chair.equals(chair4));
        System.out.println("chair.equals(null): " + chair.equals(null));

        System.out.println(chair.hashCode());
        System.out.println(chair2.hashCode());
        System.out.println(chair3.hashCode());
        System.out.println(chair4.hashCode());
    }
}
