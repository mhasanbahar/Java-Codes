package com.mycompany.testthis1;

class Student{
    int rollno;
    String name;
    float fee;
    
    public Student(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno+""+name+""+fee);
    }
}
public class TestThis1 {

    public static void main(String[] args) {
        Student std1= new Student(11 ,  "Muhammet" ,  500f);
        Student std2= new Student(12 ,  "Hasan" ,  800f);
        std1.display();
        std2.display();
    }
}
