import java.util.*;
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "banana", "orange", "orange", "grape"};
        String[] newArray = removeConsecutiveDuplicates(array);
        System.out.println(java.util.Arrays.toString(newArray));
    }

    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        if (array.length > 0) {
            list.add(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (!array[i].equals(array[i - 1])) {
                    list.add(array[i]);
                }
            }
        }
        return list.toArray(new String[0]);
    }
}
