package com.mycompany.apartment_calculation;
public class Circle {
    Operation op = new Operation();
    double pi = 3.14;
    double areaMethod(int r){
        double h_alan = pi*op.square(r);
        return h_alan;
    }
}
