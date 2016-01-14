import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 14.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("First");


        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            arr.add(i);
        }

        for(Integer a : arr){
            System.out.println("Value: " + a);
        }

        System.out.println("Third");
    }
}
