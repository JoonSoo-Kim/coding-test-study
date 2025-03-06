import java.util.Scanner;

public class Boj1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = 1;

        while(x > 0){
            x -= i++;
        }
        i--;

        if(i % 2 == 0){
            System.out.println((i + x) + "/" + (1 - x));
        }
        else{
            System.out.println((1 - x) + "/" + (i + x));
        }

        sc.close();
    }
}

/*
 
https://www.acmicpc.net/problem/1193

X에서 1부터 반복해서 i씩 뺌.  0 혹은 음수되면 중단
i가 홀수면 분모가 i + 남은수, 분자가 1 - 남은수
i가 짝수면 분모가 1 - 남은수 , 분자가 i + 남은수

ex)
4면 i = 3, 남은수 = -2. 분모가 1,  분자가 3
5면 i = 3, 남은수 = -1 분모가 2, 분자가 2
6이면 i = 3, 남은수 = 0 분모가 3, 분자가 1
7이면 i=4, 남은수 = -3, 분모가 4, 분자가 1
8이면 i=4, 남은수 = -2, 분모가 3, 분자가 2
9면 i=4, 남은수 = -1, 분모가 2, 분자가 3
10이면 i=4, 남은수 = 0

 */