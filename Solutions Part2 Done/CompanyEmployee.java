import java.util.*;
public class CompanyEmployee {
    public void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String cmpName = sc.nextLine();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee emp[] = new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Employee "+(i+1)+":");

            System.out.print("Enter id: ");
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter name: ");
            String b = sc.nextLine();

            System.out.print("Enter designation: ");
            String c = sc.nextLine();

            System.out.println("Enter salary: ");
            double d = sc.nextDouble();
            sc.nextLine();

            emp[i]= new Employee(a,b,c,d);

        }

        Company c = new Company(cmpName, emp,n);

        System.out.println("Average salary: "+ c.getAverageSalary(emp));
        System.out.println("Max salary: "+ c.getmaxSalary(emp));

        System.out.print("Employee with designation: ");
        String desig = sc.nextLine();

        Employee[] finalAns = c.getEmployeeByDesignation(emp,desig);

        for(Employee e: finalAns){
            if(e!=null){
                System.out.println("ID: "+ e.getId()+"," + " "+"Name: "+e.getName()+","+" "+"Designation: "+e.getDesignation()+","+" "+"Salary: "+e.getSalary());
            }
            else{
                System.out.println("Null!");
            }
        }
        



    }
}

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int i ,String n , String d, double s){
        this.id = i;
        this.name = n;
        this.designation=d;
        this.salary=s;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDesignation(){
        return this.designation;
    }
    public double getSalary(){
        return this.salary;
    }

}

class Company{
    private String companyName;
    private Employee[] emp;
    private int numEmployees;

    public Company(String n , Employee[] e , int nE){
        this.companyName = n;
        this.emp =e;
        this.numEmployees = nE;
        
    }

    //getters
    public String getCompanyName(){
        return this.companyName;
    }
    public Employee[] getEmployees(){
        return this.emp;
    }
    public int getNumEmp(){
        return this.numEmployees;
    }

    public double getAverageSalary(Employee[] arr){
        double ans =0;
        int count =0;
        if(arr==null || arr.length==0){
            return 0.0;
        }
        
        for(Employee e: arr){
            ans+=e.getSalary();
            count++;
        }

        double average = ans/count;
        return average;

    }

    public double getmaxSalary(Employee[] arr){
        double max = Double.MIN_VALUE;
        if(arr==null || arr.length==0){
            return 0.0;
        }
        for(Employee e: arr){
            if(e.getSalary()>max){
                max = e.getSalary();
            }
        }
        return max;


    }

    public Employee[] getEmployeeByDesignation(Employee[] arr, String d){
        if(arr==null || arr.length==0){
            return null;
        }
        int count =0;
        for(Employee e:arr){
            if(e.getDesignation().equalsIgnoreCase(d)){
                count++;
            }
        }

        Employee[] result = new Employee[count];
        int index=0;
        for(Employee e: arr){
            if(e.getDesignation().equalsIgnoreCase(d)){
                result[index++]=e;
            }
        }
        return result;
    }
}
