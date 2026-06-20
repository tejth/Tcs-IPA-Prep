import java.util.*;
public class SecondLargestPrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(checkPrime(num)){
                arr.add(num);
            }
        }

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr.get(1));
        
       
           
    }

    public static boolean checkPrime(int num){
            if(num<2){
                return false;
            }
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
    }
        
}
