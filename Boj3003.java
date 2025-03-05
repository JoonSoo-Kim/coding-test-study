import java.util.Scanner;

public class Boj3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int[] correctPiece = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        String[] currentPiece = input.split(" ");

        for(int i = 0; i < correctPiece.length; i++){
            result[i] = correctPiece[i] - Integer.valueOf(currentPiece[i]);
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
