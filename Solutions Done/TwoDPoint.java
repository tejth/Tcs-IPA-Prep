import java.util.*;

public class TwoDPoint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        sc.nextLine();

        Point p2 = new Point();
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        sc.nextLine();

        Point p3 = new Point();
        p3.x = sc.nextDouble();
        p3.y = sc.nextDouble();
        sc.nextLine();

        Point p = pointWithHighestOriginDistance(p1,p2,p3);
        System.out.println(p.x);
        System.out.println(p.y);





    }

    public static Point pointWithHighestOriginDistance(Point p1 , Point p2 , Point p3){
        double d1 = Math.sqrt(p1.x*p1.x + p1.y*p1.y);
        double d2 = Math.sqrt(p2.x*p2.x + p2.y*p2.y);
        double d3 = Math.sqrt(p3.x*p3.x + p3.y*p3.y);

        if(d1>=d2 && d1>=d3){
            return p1;
        }
        else if(d2>=d3 && d2>=d1){
            return p2;
        }
        else return p3;
    }
}

class Point{
    double x;
    double y;
}