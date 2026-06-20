import java.util.*;

public class StudentGradeSystem {
 public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    Student[] st = new Student[n];

    for(int i=0;i<n;i++){
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        sc.nextLine();
        String d = sc.nextLine();

        st[i]= new Student(a,b,c,d);
    }

    String subject = sc.nextLine();
    Student[] result =  getTopStudentsBySubject(st, subject);

    for(int i=0;i<result.length;i++){
        if(result[i]!=null){
            System.out.println(result[i].getName());
        }
    }

 }   

 public static Student[] getTopStudentsBySubject(Student[] arr, String subject){

    ArrayList<Student> list = new ArrayList<>();

    for(Student s : arr){
        if(s.getSubject().equalsIgnoreCase(subject)){
            list.add(s);
        }
    }

    Collections.sort(list, (s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks()));

    Student[] result = new Student[list.size()];

    for(int i = 0; i < list.size(); i++){
        result[i] = list.get(i);
    }

    return result;
}
}

class Student{
    private int studentId;
    private String studentName;
    private double marks;
    private String subject;

    public Student(int sId , String sName , double marks , String subject){
        this.studentId = sId;
        this.studentName = sName;
        this.marks = marks;
        this.subject = subject;
    }

    //setters
    public void setId(int id){
        this.studentId = id;
    }
    public void setName(String name){
        this.studentName = name;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    //getters
    public int getId(){
        return this.studentId;
    }
    public String getName(){
        return this.studentName;
    }
    public double getMarks(){
        return this.marks;
    }
    public String getSubject(){
        return this.subject;
    }

    public char getGrade(){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=75 && marks<90){
            return 'B';
        }
        else if(marks>=50 && marks<75){
            return 'C';
        }
        return 'D';
    }
}
