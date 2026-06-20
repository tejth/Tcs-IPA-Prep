// import java.util.*;
// public class SecondLowestSalary{
//     public static void main(String agrgs[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();

//         Employee[] emp = new Employee[n];

//         for(int i=0; i<n;i++){
//             int a = sc.nextInt();
//             sc.nextLine();
//             String b = sc.nextLine();
//             int c = sc.nextInt();
//             sc.nextLine();
//             char d = sc.next().charAt(0);
//             sc.nextLine();
//             double e = sc.nextDouble();
//             sc.nextLine();

//             emp[i]= new Employee(a, b, c, d, e);
//         }
//         int age = sc.nextInt();
//         sc.nextLine();

//         Employee[] secondLowest = getSecondLowestSalary(emp);

//         for(int i=0;i<secondLowest.length;i++){
//             if(secondLowest[i]!=null){
//                System.out.println(secondLowest[i].getId()+"#"+secondLowest[i].getName());
//             }
//             else{
//                 System.out.println("NULL");
//             }
//         }

//         int ans = countEmployeeBasedOnAge(emp, age);
//         if(ans!=0){
//             System.out.println(ans);
//         }
//         else{
//             System.out.println("Null");
//         }


//     }
  

//    public static Employee[]  getSecondLowestSalary(Employee[] arr){
//         double lowest = Double.MAX_VALUE;
//         double secondLowest = Double.MAX_VALUE;

//         if(arr==null || arr.length<2){
//             return null;
//         }

//         for(Employee e : arr){
//             double salary = e.getSalary();

//             if(salary<lowest){
//                 secondLowest=lowest;
//                 lowest=salary;
//             }else if(salary>lowest && salary<secondLowest){
//                 secondLowest=salary;
//             }
//         }
//         if(secondLowest==Double.MAX_VALUE){
//             return null;
//         }


//         int count=0;
//         for(Employee e:arr){
//             if(e.getSalary()==secondLowest){
//                 count++;
//             }
//         }

//         Employee[] result = new Employee[count];
//         int index =0;
//         for(Employee e:arr){
//             if(e.getSalary()==secondLowest){
//                 result[index++]=e;
//             }
//         }
//         return result;
       
//    }

//    public static int countEmployeeBasedOnAge(Employee[] arr , int age){
//         if(arr==null || arr.length==0){
//             return 0;
//         }
//         int count=0;

//         for(Employee e: arr){
//             if(e.getAge()==age){
//                 count++;
//             }
//         }
//         return count;
//    }
// }

// class Employee{
//     private int employeeId;
//     private String employeeName;
//     private int age;
//     private char gender;
//     private double salary;


//     public Employee(int id , String name , int age , char gender , double s){
//         this.employeeId = id;
//         this.employeeName=name;
//         this.age=age;
//         this.gender = gender;
//         this.salary = s;
//     }
//     //getters
//     public int getId(){
//         return this.employeeId;
//     }
//     public String getName(){
//         return this.employeeName;
//     }
//     public int getAge(){
//         return this.age;
//     }
//     public char getGender(){
//         return this.gender;
//     }
//     public double getSalary(){
//         return this.salary;
//     }


// }