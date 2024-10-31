//assume that you have an array 1,3,2,1,4,1 find out the most frq element using a hashmap
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 4, 1};
        Map<Integer, Integer> frequencyMap = new HashMap<>(); 
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        int maxFrequency = 0;
        int mostFrequentElement = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }
        System.out.println("The most frequent element is " + mostFrequentElement + " with a frequency of " + maxFrequency);
    }
}