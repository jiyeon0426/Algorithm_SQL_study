import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int month = sc.nextInt();
        int day = sc.nextInt();

        String [] days = {"SUN","MON", "TUE","WED", "THU","FRI","SAT"};
        int [] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays=0;

        for(int i=0; i<month; i++){
            totalDays += daysInMonth[i];
        }


        totalDays += day;
        String answer = days[totalDays%7];

        System.out.println(answer);
    }
}
