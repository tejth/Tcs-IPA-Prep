import java.util.*;
public class LibraryBookManagement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Book[] result = new Book[n];

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();

            result[i]= new Book(a,b,c,d,e);
        }

        String author = sc.nextLine();
        Book[] answer = getAvailableBooksByAuthor(result , author);

        for(int i =0;i<answer.length;i++){
            if(answer[i]!=null){
                System.out.println(answer[i].getTitle());
            }
            else{
                System.out.println("No books available");
            }
        }

    }

    public static Book[] getAvailableBooksByAuthor(Book[] arr , String author){
        
    ArrayList<Book> result = new ArrayList<>();

    for(Book b : arr){
        if(b.getAuthor().equalsIgnoreCase(author) && b.getAv()== true){
            result.add(b);
        }
    }

    Book[] answer = new Book[result.size()];

    for(int i = 0; i < result.size(); i++){
        answer[i] = result.get(i);
    }

    return answer;
    }
}

class Book{
    private int bookId;
    private String title;
    private String author;
    private double price;
    private boolean available;


    public Book(int id , String title , String author , double price , boolean available){
        this.bookId = id ;
        this.title = title;
        this.author = author;
        this.price = price;
        this.available =available;
    }


    //setters
    public void setId(int id){
        this.bookId = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setAv(boolean avail){
        this.available = avail;
    }

    //getters
    public int getId(){
        return this.bookId;
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
    public boolean getAv(){
        return this.available;
    }

}