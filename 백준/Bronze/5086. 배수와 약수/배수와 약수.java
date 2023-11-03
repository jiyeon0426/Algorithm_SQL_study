import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean check = true;
        String result;

        while(check){

            int a = sc.nextInt(); //8
            int b = sc.nextInt(); //16

            if(a ==0 && b==0){
                break;
            }else if(a%b==0 && b<a){
                System.out.println("multiple");
            }else if(b%a ==0 && b>a){
                System.out.println("factor");
            }
            else{
                result = "neither";
                System.out.println(result);
            }

        }

    }

}