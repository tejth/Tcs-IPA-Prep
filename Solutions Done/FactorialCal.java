import java.util.*;
public class FactorialCal {
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int factList[]= new int[n];
        for(int i=0;i<n;i++){
            factList[i]=sc.nextInt();
        }
        int result[] = new int[n];

        for(int i=0;i<n;i++){
            result[i]=calFact(factList[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(result[i]+ " ");
        }


        


    }

    public static int calFact(int num){
        int fact =1;
        if(num<=1){
            return 1;
        }
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
}
