public class FindPair {
   public static void findPair(int target){
    int []arr = {1,2,3,4,5,6};
    boolean flag= false;
    int n=arr.length;
    int i=0;
    int j=n-1;
    while(i<j){
     if(arr[i]+arr[j]== target){
        flag= true;
        System.out.println(arr[i]+" ,  "+arr[j]);
        i++;
        j--;

    } else if(arr[i]<target){
        i++;
    }
    else {
        j--;
    }
   }
   if(!flag){
    System.out.println("No pair found");
   }

   }}
