public class palindromeCheck {
   public static void main(String[] args) {
    String str = "madam hus";
    String comapre = "";
    for(int i =str.length()-1; i>=0;i--){
        comapre+=str.charAt(i);
    }
    if(str.equals(comapre)){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
   }
}
