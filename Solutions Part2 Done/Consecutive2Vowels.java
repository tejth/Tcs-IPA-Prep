/*Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.
Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".
 */

import java.util.*;

public class Consecutive2Vowels{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans[] = str.split(" ");

        int count=0;
        for(int i=0;i<ans.length;i++){
            for(int j=1;j<ans[i].length();j++){
                if(checkVowel(ans[i].charAt(j-1)) && checkVowel(ans[i].charAt(j))){
                    count++;
                }
            }
        }
        System.out.println(count);

        
    }
    public static boolean checkVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
            return true;
        }
        return false;
    }
}