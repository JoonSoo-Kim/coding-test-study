import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        List<Integer> divisors;
        int divisorSum;

        while (true){
            divisors = new ArrayList<>();
            divisorSum = 0;
            num = sc.nextInt();
            sc.nextLine();

            if(num == -1){
                break;
            }

            // 약수 구하기
            for(int i = 1; i < num; i++){
                if(num % i == 0){
                    divisors.add(i);
                    divisorSum += i;
                }
            }

            if(divisorSum != num){
                System.out.println(num + " is NOT perfect.");
            } 
            else {
                System.out.print(num + " = " + divisors.get(0));
                for(int i = 1; i < divisors.size(); i++){
                    System.out.print(" + " + divisors.get(i));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
