import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

public class UserCollector {

    public static void main(String[]args){

        Map<Integer, User> map = new HashMap<>();

        map.put(1,new User("Janek", "Górski", 27));
        map.put(2,new User("Maria", "Kowalik", 34));
        map.put(3,new User("Anna", "Jopek", 39));

        for (User user: map.values()){
            System.out.println(user);
        }

        System.out.println();

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));


    }


}
