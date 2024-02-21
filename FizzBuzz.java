import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> resultList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder result = new StringBuilder();
            if (i % 3 == 0) {
                result.append("Fizz");
            }
            if (i % 5 == 0) {
                result.append("Buzz");
            }
            if (i % 7 == 0) {
                result.append("Jazz");
            }
            if (result.length() == 0) {
                result.append(i);
            }
            resultList.add(result.toString());
        }
        return resultList;
    }

    public static void main(String[] args) {
        int n = 105;
        List<String> result = fizzBuzz(n);
        for (String s : result) {
            System.out.println(s);
        }
    }
}