import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        List<String> uniqueWords = new ArrayList<>(words);

        // 조건에 따라 정렬
        Collections.sort(uniqueWords, (a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(a.length(), b.length());
            } else {
                return a.compareTo(b);
            }
        });

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
