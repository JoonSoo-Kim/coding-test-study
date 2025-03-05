import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String[]> ride = new ArrayList<>();
        int currentPeople = 0;
        int maxPeople = -1;

        for(int i = 0; i < 4; i++){
            ride.add(sc.nextLine().split(" "));
        }
        
        for(int i = 0; i < ride.size(); i++){
            currentPeople -= Integer.parseInt(ride.get(i)[0]);
            currentPeople += Integer.parseInt(ride.get(i)[1]);
            if(maxPeople < currentPeople){
                maxPeople = currentPeople;
            }
        }
        
        System.out.println(maxPeople);

        sc.close();
    }
}
