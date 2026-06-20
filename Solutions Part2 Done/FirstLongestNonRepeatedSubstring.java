// Find the first non repeated character substring
//Arijit = Arij
import java.util.*;
public class FirstLongestNonRepeatedSubstring{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String ans ="";
        int count=0;

        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                if(i==j){
                    ans = ans+str.charAt(i);
                }
                else{
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count>0){
                break;
            }
        }
        System.out.println(ans);

    }
}

