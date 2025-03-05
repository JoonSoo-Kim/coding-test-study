import java.util.Scanner;

public class Boj1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hexNum = sc.nextLine();
        int DecNum = 0;

        for(int i = 0; i < hexNum.length(); i++){
            if(Character.isDigit(hexNum.charAt(i))){
                // 숫자 * 16^자릿수
                DecNum += Character.getNumericValue(hexNum.charAt(i)) * (Math.pow(16, hexNum.length() - i - 1));
            } 
            else {
                // A = 10, B = 11 ... 으로 변환
                DecNum += ((int) hexNum.charAt(i) - 55) * Math.pow(16, hexNum.length() - i - 1);
            }
            
        }
        
        System.out.println(DecNum);

        sc.close();
    }
}
