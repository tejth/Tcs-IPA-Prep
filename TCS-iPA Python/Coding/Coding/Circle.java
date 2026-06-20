import java.util.*;
public class Circle{

    public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             int radius = sc.nextInt();
             
             if(radius >= 22 && radius <=30){
                double result = 3.14159 * radius * radius;
                System.out.printf("%.2f%n", result);
                
             }
             else{
               System.out.println("Wrong Radius Entry");
             }


     }
    

}

