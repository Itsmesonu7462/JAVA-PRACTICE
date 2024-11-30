import java.util.*;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList; // Required if using LinkedList for Queue implementation


public class ToggleChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store the 3x3 representation of digits 0-9
        String[] digits = new String[10];
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 10; j++) {
                digits[j] = (digits[j] == null ? "" : digits[j]) + line.substring(j * 3, j * 3 + 3);
            }
        }
        
        // Input the number in 7-segment display
        String[] numberSegments = new String[50];
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length() / 3; j++) {
                numberSegments[j] = (numberSegments[j] == null ? "" : numberSegments[j]) + line.substring(j * 3, j * 3 + 3);
            }
        }
        
        int n = numberSegments.length;
        long sum = 0;
        boolean valid = true;
        
        // Store mappings for toggling
        Map<String, List<Integer>> toggleMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            toggleMap.put(digits[i], new ArrayList<>());
            for (int j = 0; j < 10; j++) {
                if (i == j) continue;
                int diffCount = 0;
                for (int k = 0; k < 9; k++) {
                    if (digits[i].charAt(k) != digits[j].charAt(k)) diffCount++;
                }
                if (diffCount == 1) {
                    toggleMap.get(digits[i]).add(j);
                }
            }
        }
        
        // Calculate possible numbers
        List<List<Integer>> digitOptions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!toggleMap.containsKey(numberSegments[i])) {
                valid = false;
                break;
            }
            List<Integer> options = new ArrayList<>(toggleMap.get(numberSegments[i]));
            options.add(getDigitIndex(digits, numberSegments[i]));
            digitOptions.add(options);
        }
        
        if (!valid) {
            System.out.println("Invalid");
            return;
        }
        
        // Compute sum of all possible combinations
        sum = calculateSum(digitOptions, n);
        System.out.println(sum);
    }

    // Function to calculate sum of all numbers using recursion
    private static long calculateSum(List<List<Integer>> options, int n) {
        long sum = 0;
        List<Integer> indices = new ArrayList<>(Collections.nCopies(n, 0));
        boolean done = false;

        while (!done) {
            long num = 0;
            for (int i = 0; i < n; i++) {
                num = num * 10 + options.get(i).get(indices.get(i));
            }
            sum += num;

            for (int i = n - 1; i >= 0; i--) {
                if (indices.get(i) + 1 < options.get(i).size()) {
                    indices.set(i, indices.get(i) + 1);
                    break;
                } else {
                    indices.set(i, 0);
                    if (i == 0) done = true;
                }
            }
        }
        return sum;
    }

    // Helper function to get index of a digit from the digit array
    private static int getDigitIndex(String[] digits, String segment) {
        for (int i = 0; i < 10; i++) {
            if (digits[i].equals(segment)) return i;
        }
        return -1;
    }
}
