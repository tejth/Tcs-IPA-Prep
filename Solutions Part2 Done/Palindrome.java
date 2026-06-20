import java.util.*;
public class Palindrome {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            boolean ans = CheckPalindrone(str);
            if(ans){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            
    }
    public static boolean CheckPalindrone(String str){
        
            int left=0;
            int right = str.length()-1;

            while(left<=right){
                if(str.charAt(left)!=str.charAt(right)){
                    return false;
                    
                }
                left++;
                right--;
            }
            return true;

    }
}
