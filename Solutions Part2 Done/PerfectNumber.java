/* Check a number is perfect or not

 * Input : 6
 * Output : Perfect Number
 * 
 * Explaination
 * --------------------------
 * The divisors of 6 = 1,2,3. 1+2+3 = 6
 * Sum of the factors is equal to the given number. So this is perfect
 * 
 * Input : 8
 * Output : Not Perfect Number
 * 
 * Explaination
 * -------------------------
 * Factors of 8 = 1,2,4, but 1+2+4 = 7 not equal to 8.
 */
import java.util.*;
public class PerfectNumber{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.nextLine();

       if(checPerfect(num)){
        System.out.println("Yes");
       }else{
        System.out.println("No");
       }


    }

    public static boolean checPerfect(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            return true;
        }else return false;
    }
}