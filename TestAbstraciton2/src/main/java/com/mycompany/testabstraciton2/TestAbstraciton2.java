
package com.mycompany.testabstraciton2;

abstract class Bike{

    public Bike() {
        System.out.println("Bike is created");   
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear Changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running Safely");
    }
}

public class TestAbstraciton2 {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
