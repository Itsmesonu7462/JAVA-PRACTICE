public class checkwhiteSpaces {
   public static void main(String[] args) {
    String name= "sonu kumar   ";
    for(int i =0;i<name.length();i++){
        if(name.charAt(i)==' '){
            System.out.println("white space found at index "+i);
        }
        else{
            System.out.println("nothing found");
        }
    }
   }
}
