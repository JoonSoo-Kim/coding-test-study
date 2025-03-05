import java.util.Scanner;
import java.math.BigInteger;

public class Boj1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n, m;
        n = sc.nextBigInteger(); // n, m의 범위가 10^1000
        m = sc.nextBigInteger();
        sc.nextLine();
        
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

        sc.close();
    }
}