/* Find the characters in odd position of a string which are consonent
 * 
 * Input: Arijit Ghosh
 * Output: hs
 */

//isLowerCase()

import java.util.*;
public class ConsonantOddPosition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(ch) && checkConsonant(ch) && (i+1)%2!=0){
                System.out.print(ch);
            }
        }
     


    }

    public static boolean checkConsonant(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            return false;
        }
        return true;
    }
}
