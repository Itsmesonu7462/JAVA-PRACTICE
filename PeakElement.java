//write a function tofind out peak element means an element which is greater than both navouring elements using binary search.

  public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 0};
        int peakIndex = findPeakElement(arr);
        if (peakIndex != -1) {
            System.out.println("Peak element is " + arr[peakIndex]);
        } else {
            System.out.println("Peak element not found");
        }
    }
}

