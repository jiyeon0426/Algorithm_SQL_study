import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();

        for(int i=0; i<3; i++){
            x_list.add(sc.nextInt());
            y_list.add(sc.nextInt());
        }

        int x=0;
        int y=0;

        for(int i =0; i<3; i++){
            if(x_list.indexOf(x_list.get(i)) == x_list.lastIndexOf(x_list.get(i))){ // 현재 요소의 첫 번째 위치와 마지막 위치가 같은지를 확인
                x = x_list.get(i); // 첫 번째 위치와 마지막 위치가 같을 시 중복되지 않은 유일한 값
            }
        }

        for(int i =0; i<3; i++){
            if(y_list.indexOf(y_list.get(i)) == y_list.lastIndexOf(y_list.get(i))){
                y = y_list.get(i);
            }
        }

        System.out.println(x+" "+y);
    }
}
