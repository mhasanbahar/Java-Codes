package com.mycompany.programmer;
class Employee{  
    int salary=40000;  
}  
public class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {
        Programmer pr = new Programmer();
        System.out.println("Programmer salary is:   "+ pr.salary);  
        System.out.println("Bonus of Programmer is: "+ pr.bonus);  

    }
}
