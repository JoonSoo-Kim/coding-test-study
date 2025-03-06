import java.math.BigInteger;
import java.util.Scanner;

public class Boj1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n, m;
        int t = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < t; i++){
           n = sc.nextBigInteger();
           m = sc.nextBigInteger();
           sc.nextLine();

           System.out.println(factorial(m).divide((factorial(m.subtract(n)).multiply(factorial(n)))));
        }

        sc.close();
    }

    private static BigInteger factorial(BigInteger num){
        if(num.equals(new BigInteger("0"))){
            return new BigInteger("1");
        } 
        else {
            return (num.multiply(factorial(num.subtract(new BigInteger("1")))));
        }

    }
}
