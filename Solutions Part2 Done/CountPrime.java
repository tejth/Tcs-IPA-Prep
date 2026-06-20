/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class CountPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;

        for(int i=0;i<str.length();i++){
            int p = Integer.parseInt(String.valueOf(str.charAt(i)));  //CHAR to STRING to INT

            if(checkPrime(p)){
                count++;
            }
        }
        System.out.println(count);


    }
    public static boolean checkPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
