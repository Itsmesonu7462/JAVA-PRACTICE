public class stringSorting {
 public static void main(String[] args) {
    String name="javaindsa";
    char[] arr= name.toCharArray();
    for(int i=0;i<name.length()-1;i++){
        for(int j=0;j<name.length()-1;j++){
            if(arr[j]>arr[j+1]){
                char temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    String ans=new String(arr);
    System.out.println(ans);
 }
}
