
package com.mycompany.testinterface2;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class A7 implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}
public class TestInterface2 {

    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
