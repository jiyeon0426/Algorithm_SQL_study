import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int result=0;

        int sum = sc.nextInt();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(a*b);
            result += list.get(i);
        }

        if(result == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}