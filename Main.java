// public class Main {
//     public static void main(String[] args) {
//       int i;  
//    for( i=0;i<=10;i++){
//     System.out.println(i);
//    }
//     }
//  }
public class Main{
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=6;i++){
            for (j=1;j<=i;j++){
                System.out.print('-');  //iterative apporach 
                System.out.print("*");
            }
            System.out.println('|');
        }
    }
}
