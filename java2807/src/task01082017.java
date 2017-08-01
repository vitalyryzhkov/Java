import java.util.Arrays;

/**
 * Created by User on 01.08.2017.
 */
public class task01082017 {
    public static void main(String[] args) {

        //min elem


        double[] arr = {1.5, 1.1, 10.5, 0.1, 7};
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
