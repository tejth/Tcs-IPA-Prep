import java.util.*;
public class TwoDpointAdvance {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Pointt p1 = new Pointt();
        p1.x1 = sc.nextDouble();
        p1.x2=sc.nextDouble();
        sc.nextLine();
        p1.y1=sc.nextDouble();
        p1.y2=sc.nextDouble();
        sc.nextLine();

        double ans = OriginDistance(p1);
        System.out.println(ans);


        

    }

    public static double OriginDistance(Pointt p1){
        double d = Math.sqrt(((p1.x2 - p1.x1)* (p1.x2 - p1.x1)) + ((p1.y2 - p1.y2)*(p1.y2 - p1.y2)));
        
        if(d>=0){
            return d;
        }
        return 0;

    }
    
}

class Pointt{
    double x1;
    double x2;
    double y1;
    double y2;
}
