import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String[]> games = new ArrayList<>();
        int maxWinning = -1;
        int currentWinning = -1;
        int playTime = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < playTime; i++){
            games.add(sc.nextLine().split(" "));
        }

        for(int i = 0; i < games.size(); i++){
            currentWinning = countWinning(games.get(i));
            if(maxWinning < currentWinning){
                maxWinning = currentWinning;
            }
        }
        
        System.out.println(maxWinning);

        sc.close();
    }

    private static int countWinning(String[] game){
        int winning = 0;
        int first = Integer.parseInt(game[0]);
        int second = Integer.parseInt(game[1]);
        int third = Integer.parseInt(game[2]);

        // 모두 다른 눈
        winning = Math.max(first, Math.max(second, third)) * 100;
        // 같은 눈 2개
        winning = first == second ? 1000 + first * 100 : winning;
        winning = first == third ? 1000 + first * 100 : winning;
        winning = second == third ? 1000 + second * 100 : winning;
        // 같은 눈 3개
        winning = first == second && second == third ? 10000 + first * 1000 : winning;

        return winning;
    }
}
