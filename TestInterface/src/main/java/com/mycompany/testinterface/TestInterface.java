package com.mycompany.testinterface;

interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Cricle implements Drawable{
    public void draw(){
        System.out.println("Drawing circle");
    }
}
public class TestInterface {

    public static void main(String[] args) {
        Drawable d = new Cricle();
        d.draw();
    }
}
