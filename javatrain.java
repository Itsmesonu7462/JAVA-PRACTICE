// public class javatrain {
//     public static void main(String[] args) {
//      int[] a= new int[5];
//       a[0]=10;
//       a[1]=20;
//       a[2]=30;
//       a[3]=140;

     
//         System.out.println(a[4]);
//       }
//     }
// class javatrain{
//     public static void main(String[] args) {
//         int a[]=new int[]{2,3,5,9};
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i]);
//         }
//     }
// }
class javatrain{
    public static void main(String[] args) {
        int []a= {5,10,15,25,28,40,50,60,70,50,70,56,55};
        int k=0;
        for(int i=0; i<a.length/2;i++){
            for(int j=0; j<2;j++){
                System.out.print(" ");
                System.out.print(a[k++]);
            }
            System.out.println(" ");
        }
     
    }} //fix this code to print out put as all elements comes and give out put as
    // 5 10
    // 15 24 
    // 30 45
    // 34
    