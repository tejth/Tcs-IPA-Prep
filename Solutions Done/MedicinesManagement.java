package Solutions;
import java.util.*;
public class MedicinesManagement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Medicine[] m = new Medicine[n];

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            double d = sc.nextDouble();
            sc.nextLine();

            m[i]=new Medicine(a,b,c,d);
        }

        String s = sc.nextLine();
        int ans = countMedicinesByMedicineName(m, s);
        System.out.println(ans);

    }

    public static int countMedicinesByMedicineName(Medicine[] m, String medicineName){
        int count=0;
       
        for(Medicine me : m){
            if(me.getName().equalsIgnoreCase(medicineName)){
                count++;
            }
        }
        return count;

    }
}

class Medicine{
    private int medicineId;
    private String medicineName;
    private int expiryYear;
    private double price;

    public Medicine(int meId , String medName , int expYear , double price){
        this.medicineId = meId;
        this.medicineName=medName;
        this.expiryYear = expYear;
        this.price = price;
    }


    public void setmedId(int medId){
        this.medicineId = medId;
    }
    public void setMedName(String medName){
        this.medicineName = medName;
    }
    public void setExpYear(int expyYear){
        this.expiryYear = expyYear;
    }
    public void setPrice(double price){
        this.price = price;
    }


    public int getId(){
        return this.medicineId;
    }
    public String getName(){
        return this.medicineName;
    }
    public int getYear(){
        return this.expiryYear;
    }
    public double getPrice(){
        return this.price;
    }


}