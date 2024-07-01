package com.mycompany.staff_console;

public class Desinger {
    Staff per = new Staff();
    int Salary=30000;
    String Section = "Desinger";
    public void empInfo(){
        per.Name = "Hasan";
        per.Surname="Bahar";
        per.Email="mhasanbahar0@gmail.com";
        per.Phone = "05555555555";
        System.out.println(per.Name+"\n"+per.Surname+"\n"+ per.Phone+"\n"+ per.Email+"\n"+ Salary+"\n"+ Section);
    }
}
