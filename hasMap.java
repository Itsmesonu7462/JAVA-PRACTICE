import java.util.*;
public class hasMap {
  public static void main(String[] args) {
    HashMap<Integer, String> std= new HashMap<>();
    
    std.put(501,"sachin");
    std.put(502,"chin");
    std.put(503,"hin");
    std.put(505,"sachi");
    System.out.println(std);
    if (std.containsKey(501)) {
        System.out.println("key found");
    }
    else{
        System.out.println("key not found");
    }
    System.out.println(std.get(501));
    for(Map.Entry<Integer,String> i: std.entrySet()){
        System.out.println(i.getKey()+" "+i.getValue());
    }
    Set<Integer>keys=std.keySet();
    for(int i:keys){
        System.out.println(i+ " "+ std.get(i));

    }
  }
}
