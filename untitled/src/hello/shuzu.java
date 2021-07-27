package hello;
import java.util.Arrays;
public class shuzu {
    public static void main(String[] args) {
        double[]arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        double[]arre=Arrays.copyOf(arr,5);
        for (double m:arre
             ) {
            System.out.println(m); }
        System.out.println(Arrays.binarySearch(arre,2));

    }
}
