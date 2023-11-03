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

        ArrayList <Integer> arr = new ArrayList<>();

        boolean check = true;

        while(check){
            int n = sc.nextInt();
            //int k = sc.nextInt();

            if(n==-1){
                break;
            }

            for(int i=1; i<n; i++){

                if(n%i==0){ //약수면
                    arr.add(i);
                }
            }

            int sum = 0;
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(j);
            }

            if(sum ==n){

                System.out.print( n+ " = ");


                for(int j=0; j< arr.size(); j++){

                    if(j!=0) {
                        System.out.print(" + ");
                        System.out.print(arr.get(j));
                    }else{
                        System.out.print(1);
                    }
                }
            }else{
                System.out.print(n+" is NOT perfect.");
            }
            System.out.println();

            arr.clear();
        }




    }

}