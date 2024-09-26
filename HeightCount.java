public class HeightCount {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 6, 7, 4};  
        int initialHeight = 3; 
        int count = 0;  
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > initialHeight) {
                count++;  
                initialHeight = arr[i]; 
            }
        }
        
        System.out.println("The viewable buildings count is: " + count);
    }
}
