import java.util.*;
public class ArmStronNumber {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int digits = String.valueOf(num).length();

        int sum=0;
        while(num>0){
            int digit = num%10;
            sum+= Math.pow(digit,digits);
            num/=10;
        }

        if(original==sum){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }

    }
}
