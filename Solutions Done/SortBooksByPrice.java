import java.util.*;
public class SortBooksByPrice {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Bookk[] book = new Bookk[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();

            book[i]= new Bookk(a,b,c,d);
            
        } 

        Bookk[] result = sortBoksByPrice(book);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i].getPrice());
        }

    }
    public static Bookk[] sortBoksByPrice(Bookk[] arr){
         ArrayList<Bookk> bok = new ArrayList<>();

          for(Bookk b : arr){
            bok.add(b);
          }

          Collections.sort(bok,(a,b)->Double.compare(b.getPrice(),a.getPrice()));

          Bookk[] result = new Bookk[bok.size()];

          for(int i=0;i<arr.length;i++){
            result[i]=bok.get(i);
          }

          return result;
    }
}

class Bookk{
    private int id;
    private String title;
    private String author;
    private double price;

    public Bookk(int id , String t , String a , double p){
        this.id = id;
        this.title = t;
        this.author =a;
        this.price =p;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
}
