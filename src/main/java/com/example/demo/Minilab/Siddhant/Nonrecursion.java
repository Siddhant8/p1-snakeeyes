package com.example.demo.Minilab.Siddhant;

import java.io.IOException;

public class Nonrecursion {

    int num1 = 0;
    int num2 = 0;

    public Nonrecursion(){
        this.num1 = num1;
        this.num2 = num2;

    }

    public int normal(int a, int b){
        num1 = a;
        num2 = b;
        int gcf = 1;
        if(a<b){
            for(int i = 1; i <= a; i++){
                if(a%i == 0 && b%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }

        }
        else if(b <= a){
            for(int i = 1; i <=b; i++){
                if(a%i == 0 && b%i == 0){
                    gcf = i;
                }
                else{
                    continue;
                }
            }
        }

        return gcf;

    }

    public static int driver() throws IOException {
        Nonrecursion cases = new Nonrecursion();
        int y = cases.normal(3, 3);
        return y;
    }
    public static void main(String[] args){
        Nonrecursion normal1 = new Nonrecursion();
        normal1.normal(3, 3);
    }


}
