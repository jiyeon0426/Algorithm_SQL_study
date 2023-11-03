import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int floor=0;
        int ho =0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            ho = c / a + 1;
            floor = c%a;

            if(c%a ==0) {
                floor = a;
                ho = c/a;
            }


            String result = floor + "" + (ho < 10 ? "0" : "") + ho;
            System.out.println(result);
        }
    }
}
