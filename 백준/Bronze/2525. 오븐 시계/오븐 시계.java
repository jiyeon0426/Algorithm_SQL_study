import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = sc.nextInt();

        int result = b + add; // 30 + 50

        if(result < 60){
            System.out.println(a + " " + result);
        }
        else if (result == 60){
            if(a+1 > 23){
                System.out.println(((a+1)%24) + " " +0);
            }
            else{
                System.out.println((a+1)+ " " +0);
            }
        }
        else if (result > 60){
            int c = result / 60;
            int c_2 = result % 60;
            if(a+c > 23){
                System.out.println(((a+c)%24) + " " + (c_2));
            }
            else{
                System.out.println((a+c)+ " " + (c_2));
            }
        }
        else{
            System.out.println("error");
        }
    }
}