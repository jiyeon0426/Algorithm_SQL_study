import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if(a==b && b==c){
            result = 10000;
            result += a*1000;
            System.out.println(result);
        }
        else if (a==b||a==c){
            result = 1000;
            result += a*100;
            System.out.println(result);

        }
        else if(b==c){
            result = 1000;
            result += b*100;
            System.out.println(result);

        }
        else{
            result = Math.max(a,b);
            result = Math.max(result,c);
            result = result*100;
            System.out.println(result);
        }
    }
}