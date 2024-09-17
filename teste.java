// public class teste {
//     public static int add(int a , int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(4,5));
//     }
// }
class teste{
    public static void add(int a){
        if(a>10){
            return;
        }
        System.out.println(a);
        add(a+1);
    }
    public static void main(String[] args) {
        add(1);
    }
}