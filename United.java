public class United {
    public static void main(String []args){
     int []arr= {3,4,5,6,0,9,0};
     int n= arr.length;
     int []temp=new int [n];
     moveZeros(arr,temp);
     for(int i=0;i<temp.length;i++){
        System.out.print(temp[i]+" ");
     }
     System.out.println(" ");

    }
    public static void moveZeros(int []arr, int[]temp){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
    }
}
