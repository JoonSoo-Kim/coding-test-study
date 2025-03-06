import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Boj1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for(int i = 0; i < n; i++){
            listA.add(sc.nextInt());
        }
        sc.nextLine();
        for(int i = 0; i < n; i++){
            listB.add(sc.nextInt());
        }

        while(listA.size() > 0){
            result += Collections.min(listA) * Collections.max(listB);
            listA.remove(listA.indexOf(Collections.min(listA)));
            listB.remove(listB.indexOf(Collections.max(listB)));
        }

        System.out.println(result);

        sc.close();
    }
}

/*

A의 가장 작은 값을 B의 가장 큰 값과 곱해서 더함
방금 곱한 두 값을 리스트에서 제거함
A의 두번쨰 작은 값을 B의 두번쨰 큰 값과 곱해서 더함
리스트의 모든 아이템에 대해 반복

 */