import java.util.*;
public class MinimumCharacter {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      char min = str.charAt(0);

      for (int i=1;i<str.length();i++){
        if(str.charAt(i)<min){
            min = str.charAt(i);
        }
      }
      
      System.out.println(min);

        
    }
}
