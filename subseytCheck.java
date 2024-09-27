import java.util.*;
public class subseytCheck {

    public static boolean checkSubarray(int []arr, int []arr2){
        Set<Integer> hashSet = new HashSet<>();
        for(int n:arr){
            hashSet.add(n);
        }
        for(int n :arr2){
            if(!hashSet.contains(n)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        int []arr2 = {11,2,3,4};
        if(!checkSubarray(arr,arr2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
