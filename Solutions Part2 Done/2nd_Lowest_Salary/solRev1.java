// import java.util.*;


// public class solRev1{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();sc.nextLine();

//         Employee[] emp = new Employee[n];
//         for(int i=0;i<n;i++){ 
//                 int a = sc.nextInt(); sc.nextLine();
//                 String b = sc.nextLine(); 
//                 int c = sc.nextInt(); sc.nextLine();
//                 char d = sc.next().charAt(0); sc.nextLine();
//                 double e = sc.nextDouble(); sc.nextLine();

//                 emp[i]= new Employee(a, b, c, d, e);
//         }

//         int age = sc.nextInt(); sc.nextLine();
//         Employee[] ans1 = getEmployeeWithSecondLowestSalary(emp);
       
//         if(ans1!=null){
//             for(int i=0;i<ans1.length;i++){
//                 System.out.println(ans1[i].getEmpId() + "#" + ans1[i].getEmpName());
//             }
//         }
//         else {
//             System.out.println("Null");
//         }

//         int ans2 = countEmployeesBasedOnAge(emp, age);
//         if(ans2!=0){
//             System.out.println(ans2);
//         }
//         else{
//             System.out.println("No Employee found for given age!");
//         }

//     }


//     public static Employee[] getEmployeeWithSecondLowestSalary(Employee[] e){
//         if(e==null || e.length<2){
//             return null;
//         }

//         //Finding Lowest and second Lowest Salary
//         double lowest = Double.MAX_VALUE;
//         double secondLowest = Double.MAX_VALUE;

//         for(Employee emp :e){
//             double salary = emp.getSalary();

//             if(salary<lowest){
//                 secondLowest = lowest;
//                 lowest = salary;
//             }
//             else if(salary>lowest && salary<secondLowest){
//                 secondLowest = salary;
//             }
//         }

//         //No secondLowestSalary
//         if(secondLowest==Double.MAX_VALUE){
//             return null;
//         }

//         //Count employees having second lowest salary
//         int count =0;
//         for(Employee emp:e){
//             if(emp.getSalary() == secondLowest){
//                 count++;
//             }
//         }

//         //Returning all employyes having second largest salary
//         Employee[] result = new Employee[count];
//         int index = 0;
//         for(Employee emp:e){
//             if(emp.getSalary()==secondLowest){
//               result[index++]= emp;
//             }
//         }

//         return result;
//     }

//     public static int countEmployeesBasedOnAge(Employee[] e , int a){
//         int count =0;
//         for(Employee emp: e){
//             if(emp.getAge() ==a){
//                 count++;
//             }
//         }
//         return count;
//     }

// }

// class Employee{
//     private int employeeId;
//     private String employeeName;
//     private int age;
//     private char gender;
//     private double salary;

//     public Employee(int empId, String empName , int age ,char gender , double salary){
//         this.employeeId = empId;
//         this.employeeName = empName;
//         this.age = age;
//         this.gender = gender;
//         this.salary = salary;
//     }


//     public int getEmpId(){
//         return this.employeeId;
//     }
//     public String getEmpName(){
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


//     public void setEmpId(int id){
//         this.employeeId = id;
//     }
//     public void setEmpName(String name){
//         this.employeeName = name;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }
//     public void setGender(char gender){
//         this.gender = gender;
//     }
//     public void setSalary(double salary){
//         this.salary=salary;
//     }
// }