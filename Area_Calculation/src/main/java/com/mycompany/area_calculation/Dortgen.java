package com.mycompany.area_calculation;
public class Dortgen {
    public double DortgenArea(int S_Edge, int L_Edge){
        Triangle uc = new Triangle();
        double D_Area=uc.TriangleArea(S_Edge, L_Edge)*2;
        return D_Area;
    }
}
