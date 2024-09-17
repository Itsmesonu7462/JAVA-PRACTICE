public class maxSumTriplet {
    public static void main(String [] args){
       int []arr={3,5,4,6,5,7,8,9}; 
       if(arr.length<3){
        System.out.println("index geded");
        return;
       }
       System.out.println(maxTriplet(arr));
    }
    public static int maxTriplet(int []arr){
        int n=arr.length;
        int max= Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        System.out.println(secondMax);
        for(int i=0;i<n;i++){
            if(arr[i]>max){
            thirdMax= secondMax;
            secondMax=max;
            max=arr[i];}
            else if(arr[i]> secondMax ){
                thirdMax=secondMax;
                secondMax=arr[i];
            }
            else if(arr[i]>thirdMax){
                thirdMax=arr[i];
            }
        }
        return max+secondMax+thirdMax;
    }
}
