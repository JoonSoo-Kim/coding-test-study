import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        String[] articles = sc.nextLine().split(" ");
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < articles.length; i++){
            result.add(Integer.parseInt(articles[i]) - (p * l));
        }

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }

        sc.close();
    }
}