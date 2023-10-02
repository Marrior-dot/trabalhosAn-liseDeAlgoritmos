import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[]args){
        ArrayList<Integer> intVector = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Maxmin1 max1 = new Maxmin1(intVector);
        Maxmin2 max2 = new Maxmin2(intVector);
        Maxmin3 max3 = new Maxmin3(intVector);

        max1.printElements();
        max2.printElements();
        max3.printElements();
    }
}
