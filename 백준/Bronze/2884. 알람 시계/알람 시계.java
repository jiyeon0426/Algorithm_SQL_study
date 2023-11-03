import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = b-45;

        if(result >=0){
            System.out.println(a + " " + result);
        }
        else if (result <0 && a!=0 ){
            System.out.println((a-1)+ " " +(60+result));
        }
        else if (result <0 && a==0){
            System.out.println((23)+ " " + (60+result));
        }
        else{
            System.out.println("error");
        }
    }
}