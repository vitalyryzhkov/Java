/**
 * Created by User on 28.07.2017.
 */
public class test {
    public static void main(String[] args) {
        int a = 2;

        System.out.println(IsDigit(a));
    }

    public static boolean IsDigit(int a) {
        if (a % 2 != 0) {
            return false;
        }
        return true;
    }
    }
