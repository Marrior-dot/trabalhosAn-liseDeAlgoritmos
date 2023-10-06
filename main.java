import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[]args){
        ArrayList<Integer> intVector = new ArrayList<Integer>();
        ArrayList<Integer> intVector2 = new ArrayList<Integer>();
        for (int i = 0; i < 10000000; i++) {
            intVector.add(i);
            intVector2.add(i);
        }
        Collections.shuffle(intVector2);

        System.out.println(("Lista ordenada"));

        System.out.println(("Maxmin1"));
        Maxmin3 max31 = new Maxmin3(intVector);
        System.out.println(("\nMaxmin2"));
        Maxmin2 max21 = new Maxmin2(intVector);
        System.out.println(("\nMaxmin3"));
        Maxmin1 max11 = new Maxmin1(intVector);

        max11.printElements();
        max21.printElements();
        max31.printElements();

        Maxmin3 max32 = new Maxmin3(intVector2);
        Maxmin2 max22 = new Maxmin2(intVector2);
        Maxmin1 max12 = new Maxmin1(intVector2);

        System.out.println(("Lista desordenada"));
        System.out.println(("Maxmin1"));
        max12.printElements();
        System.out.println(("\nMaxmin2"));
        max22.printElements();
        System.out.println(("\nMaxmin3"));
        max32.printElements();
    }
}
