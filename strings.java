//array finding and sorting
public class strings{
  public static void main(String[] args) {
     String name ="sonu kumar";
     String name1 = new String("MMU has a big campus");
     System.out.println(name);
     System.out.println(name1);
     System.out.println(name.length());
     System.out.println(name1.length());
     System.out.println(name.charAt(3));//printing element of index
     System.err.println(name1.substring(2,12));
     System.out.println(name1.concat(",i read in this")); //to add a new strig iin the same
     System.out.println(name1.toUpperCase());
     System.out.println(name1.trim());//removes statring and ending extra spaces.
     System.out.println(name1.contains("mmdu"));//check for string contains the given string or not.
     System.out.println("mmu".equals("MMU"));//check for string is same or not
     System.out.println(name1.indexOf("bi"));
    }
}