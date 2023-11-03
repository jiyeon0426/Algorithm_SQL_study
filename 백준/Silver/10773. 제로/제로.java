import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스의 개수
        int sum = 0; //합
        ArrayList<Integer> arr= new ArrayList<>();
        
        for(int i=0; i<t; i++){
            
            int n =sc.nextInt();
            
            if(n!=0){
               arr.add(n); 
            }else{
                if(!arr.isEmpty()){
                    arr.remove(arr.size()-1);
                }else{
                    continue;
                }
            }
        }
        
        for(int j=0; j<arr.size(); j++){
            sum+=arr.get(j);
        }

        System.out.println(sum);
    }
}
