import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        int col = sc.nextInt(); //열
        int row = sc.nextInt(); //행

        int [][] arr1 = new int[row][col];
        int [][] arr2 = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int sum = arr1[i][j] += arr2[i][j];

                System.out.print(sum);

                if(j< col-1)
                    System.out.print(" ");
            }
            System.out.println();
        }


    }
}
