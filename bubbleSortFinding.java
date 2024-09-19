//assume you have unsorted array using the bubble sort  algorithm to find out the Kth large element with the array without fully sorting
//7,10,4,3,20,40


public class bubbleSortFinding{
    public static void main(String[] args) {
        int [] arr={ 7,10,4,3,20,40};
 
        }
    public static void bubbleSort(int arr[], int n, int K) {
        
        for (int i = 0; i < K; i++) {
          for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] < arr[j + 1]) {
              // Swap arr[j] and arr[j + 1]
              int temp = arr[j];
              arr[j] = arr[j + 1];
              arr[j + 1] = temp;
            }
          }
        }
      }
}
