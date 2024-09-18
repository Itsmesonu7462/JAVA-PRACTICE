//write a prgram to find the index of the smallest elemen tthat is greater than the given target inn a sorted array if there is no such element
//then it will print -1
// 1,2,4,6,8,10 target =5 
public class masterclass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 5;
        int result = findSmallestGreater(arr, target);
        System.out.println(result);
    }

    public static int findSmallestGreater(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left < arr.length && arr[left] > target) {
            return left;
        }

        return -1;
    }
}