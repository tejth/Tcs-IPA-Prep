import java.util.*;
public class DocumentWithOddPages {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Document[] doc = new Document[n];
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            doc[i]= new Document(a,b,c,d);
        }

        Document[] result = docsWithOddPages(doc);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i].getId() + " "+ result[i].getTitle()+" "+result[i].getName()+" "+ result[i].getPages()+" ");
            sc.nextLine();
        }
        

    }
    public static Document[] docsWithOddPages(Document[] arr){
        ArrayList<Document> d = new ArrayList<>();

        for(Document doc : arr){
            if(doc.getPages()%2!=0){
                d.add(doc);
            }
        }
        Document[] result = new Document[d.size()];
        for(int i=0;i<result.length;i++){
            result[i]=d.get(i);
        }
        return result;

    }
}

class Document{
    private int id;
    private String title;
    private String folderName;
    private int pages;

    public Document(int id , String title , String fName, int pages){
        this.id = id;
        this.title =title;
        this.folderName = fName;
        this.pages= pages;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getName(){
        return this.folderName;
    }
    public int getPages(){
        return this.pages;
    }


}
