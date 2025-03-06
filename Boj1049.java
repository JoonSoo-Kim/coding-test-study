import java.util.Scanner;

public class Boj1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leastSixPrice = 1001;
        int leastOnePrice = 1001;
        int input = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < m; i++){
            input = sc.nextInt();
            if(leastSixPrice > input){
                leastSixPrice = input;
            }

            input = sc.nextInt();
            if(leastOnePrice > input){
                leastOnePrice = input;
            }

            sc.nextLine();
        }

        // 6개 미만의 낱개를 사는 것보다 6개들이 사는게 좋은 경우 
        if(leastSixPrice < (n % 6) * leastOnePrice){
            System.out.println(((n / 6) + 1) * leastSixPrice);
        } 
        // 6개들이 가격이 낱개 6개보다 비싼 경우
        else if(leastSixPrice > leastOnePrice * 6){
            System.out.println(n * leastOnePrice);
        }
        else {
            System.out.println((n / 6) * leastSixPrice + (n % 6) * leastOnePrice);
        }

        
        sc.close();
    }
}

/*

https://www.acmicpc.net/problem/1049

각 브랜드의 앞 숫자는 6개들이 리스트에, 뒷 숫자는 1개 리스트에 넣기
각 리스트에서 최소값 뽑아냄
(n / 6) * 6개들이최소 + (n % 6) * 1개최소

에외사항
- 6개 미만의 낱개를 사는 것보다 6개들이 사는게 좋은 경우 ((n / 6) + 1) * 6개들이최소
- 6개들이 가격이 낱개 6개보다 비싼 경우 n * 1개최소

 */
