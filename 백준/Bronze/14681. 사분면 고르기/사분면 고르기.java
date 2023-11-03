import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>0 && b >0){
            System.out.println(1);
        }
        else if (a<0 && b>0){
            System.out.println(2);
        }
        else if (a<0 && b <0){
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
    }
}

/*
* 양수 양수 = 1사분면
* 음수 양수 = 2사분면
* 음수 음수 = 3사분면
* 양수 음수 = 4사분면
*/