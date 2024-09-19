public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    /**
     * Recursive function to perform quicksort
     * @param arr The input array
     * @param low The starting index
     * @param high The ending index
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    /**
     * Function to partition the array and return the pivot index
     * @param arr The input array
     * @param low The starting index
     * @param high The ending index
     * @return The pivot index
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /**
     * Function to print the array
     * @param arr The input array
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}