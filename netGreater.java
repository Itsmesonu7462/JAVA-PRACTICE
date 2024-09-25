import java.util.Stack;
import java.util.Arrays; 

public class netGreater {
     public static int[] findGreaterele(int [] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack =  new Stack<>();
        for(int i=n-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result [i]=-1;
            } else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
     }
 public static void main(String[] args) {
    int []arr= { 4,5,6,2,25,7,6,8};
    int []greaterElement = findGreaterele(arr);
     System.out.println(Arrays.toString(greaterElement));
 }
}
