// import java.util.Arrays;

// public class higestNum {
// public static void main(String[] args) {
//     int []a={7,12,45,43,12,34,55,65,45};
//     Arrays.sort(a);
//     System.out.println("higest number is "+a[a.length-1]);
//     for (int i=0; i<a.length;i++){
//         System.out.println(a[i]);
//     }
// }
// }
//other method
class higestNum{
    public static void main(String[] args) {
            int []a={1,4,3,15,4,6,7,8,10};
          int  max=a[0];
            for(int i=1;i<a.length;i++){
                if(max<a[i]){
                    max=a[i];
                }
            }
            System.out.println(max);
    }
}
//q. name initial print S
//q. pattern printing of array elememnts
//q. [1,20,60,80] 