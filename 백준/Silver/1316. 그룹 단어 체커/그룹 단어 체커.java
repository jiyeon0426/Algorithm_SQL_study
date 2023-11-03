import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        ArrayList<String> arr = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr.add(bf.readLine());
        }

        for (int i = 0; i < n; i++) {
            String word = arr.get(i); // 단어를 가져옴
            boolean isGroupWord = true; // 그룹 단어 여부를 판단하기 위한 플래그

            // 각 문자를 확인하면서 연속된 문자인지 검사
            for (int j = 0; j < word.length() - 1; j++) {
                char currentChar = word.charAt(j);
                char nextChar = word.charAt(j + 1);

                if (currentChar != nextChar) {
                    // 현재 문자와 다음 문자가 다르다면, 현재 문자가 뒤에 또 나오는지 검사
                    String substring = word.substring(j + 2);
                    if (substring.contains(String.valueOf(currentChar))) {
                        isGroupWord = false;
                        break; // 그룹 단어가 아니면 중단
                    }
                }
            }

            if (isGroupWord) {
                count += 1; // 그룹 단어인 경우 카운트 증가
            }
        }

        System.out.println(count);
    }
}
