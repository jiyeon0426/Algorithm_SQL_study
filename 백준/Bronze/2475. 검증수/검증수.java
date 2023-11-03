import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr= new String[5];
        String str=sc.nextLine();
        arr= str.split(" ");

        int sum=0;

        for(int i=0; i<arr.length; i++){
            int n = Integer.parseInt(arr[i]);
            sum += n*n;
        }

        System.out.print(sum%10);
    }
}
