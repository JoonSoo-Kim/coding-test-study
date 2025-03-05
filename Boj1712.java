import java.util.Scanner;

public class Boj1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int notebook = sc.nextInt();

        int profit = notebook - b;

        if (profit > 0){
            System.out.println(a / profit + 1);
        }
        else {
            System.out.println(-1);
        }

        sc.close();
    }
}
