public class removeDuplicate {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 4,4,5,4,4,3,4};
    int[]temp=new int[arr.length];
    int k=0;
    for(int i=0;i<arr.length;i++){
        boolean flag=true;
        if(temp!=null){
            for(int j=0;j<temp.length;j++){
                if(arr[i]==temp[j]){
                    flag=false;
                    break;
        }
    }
  }
  if(flag){
    temp[k++]=arr[i];
  }
  for(  i=0;i<k;i++){
    System.out.print(temp[i]+" ");
  }
    }}}