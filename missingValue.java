public class missingValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,7,9,10,13,15};
       for(int i=0;i<arr.length-1;i++){
        int current=arr[i];
        int  next=arr[i+1];
        if(next-current>1){
            for(int j=current+1;j<next;j++){
                System.out.println("missing number "+j);
            }

       }
    }
}
}
