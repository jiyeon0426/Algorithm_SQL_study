import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = a* (b/100);

        b= b%100;

        int result2 = a* (b/10);

        b=b%10;
        int result3 = a* (b);

        int sum = result1*100+result2*10+result3;

        System.out.println(result3);
        System.out.println(result2);
        System.out.println(result1);
        System.out.println(sum);



    }
}