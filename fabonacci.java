public class fabonacci {
   public static void main(String[] args) {
    int a =0;
    int b=1;
    for(int i=0; i<8; i++){
        int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
   }
}
