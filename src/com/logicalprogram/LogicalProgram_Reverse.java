package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Reverse {
    public static void Reverse(){
        System.out.print("Enter number: ");
        int n,r,rev=0,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(;n!=0;){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse will be: "+rev);
    }
    public static void main(String[] args) {
        Reverse();
    }
}
