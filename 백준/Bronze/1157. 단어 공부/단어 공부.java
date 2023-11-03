import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine().toUpperCase(); // 대문자로 만들기

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        int maxCount = 0;
        char maxChar = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = currentChar;
            } else if (currentCount == maxCount) {
                maxChar = '?'; // 최댓값이 여러 개인 경우
            }
        }

        System.out.println(maxChar);
    }
}
