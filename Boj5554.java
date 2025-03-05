import java.util.Scanner;

public class Boj5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int fourth = sc.nextInt();
        int result = first + second + third + fourth;

        System.out.println(Math.floorDiv(result, 60));
        System.out.println(result % 60);

        sc.close();
    }
}
