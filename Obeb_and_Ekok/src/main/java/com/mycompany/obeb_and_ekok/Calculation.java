package com.mycompany.obeb_and_ekok;
public class Calculation {
    public int Okekk(int a, int b){
        int okek = 1;
        for (int i = a; i <= a*b; i++) {
            if(i % a == 0 && i % b == 0){
                okek = i;
                break;
            }
        }
        return okek;
    }
    
    public int Obebb(int x, int y){
        int obeb = 1;
        for (int i = 1; i < y; i++) {
            if(x % i ==0 && y % i == 0){
                obeb = i;
            }
        }
        return obeb;
    }
}
