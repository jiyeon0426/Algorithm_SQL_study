import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        int n_factorial=1;

        int k_factorial=1;

        int nk_factorial=1;

        for(int i=n; i>0; i--){
            n_factorial = n_factorial*i; //n의 팩토리얼
        }

        for(int j=k; j>0; j--){
            k_factorial = k_factorial*j;
        }

        for(int l= (n-k); l>0; l--){
            nk_factorial = nk_factorial*l;
        }

        int result = n_factorial/ (k_factorial * nk_factorial);

        System.out.print(result);


    }
}
