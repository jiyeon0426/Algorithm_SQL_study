import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int result =1;
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        ArrayList<Integer> arr3 = new ArrayList<>();


        for(int i=1; i<=10000; i++){
            result = i;
            sum=0;

            while(result >= 1){ // 갓 자릿수 쪼개서 arr에 넣기
                arr.add(result%10);
                result = result/10;
            }

            for(int j=0; j<arr.size(); j++){
                sum = sum + arr.get(j);
            }
            sum = sum+i;
            if(sum>=10000){
                break;
            }

            arr2.add(sum);
            arr.clear();


        }

        for(int i=1; i<10000; i++){
            arr3.add(i);
        }


        for(int j=0; j<arr2.size(); j++){
            arr3.remove(arr2.get(j));
        }


        Collections.sort(arr3);
        arr3.remove((Integer) 9995);
        arr3.remove((Integer) 9997);
        arr3.remove((Integer) 9999);

        for(int k=0; k<arr3.size(); k++){
            System.out.println(arr3.get(k));

        }

    }

}