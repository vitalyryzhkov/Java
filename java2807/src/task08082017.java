/**
 * Created by User on 08.08.2017.
 */
public class task08082017 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        int result = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        n = fib(n - 1) + fib(n - 2);
        result += n;
        return result;
    }
}
