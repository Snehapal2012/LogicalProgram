package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Fibonacci {
    public static void Fibonacci(){
        int n1=0,n2=1,i,n3,n;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Limit: ");
        n=r.nextInt();
        System.out.print("Fibonacci Series: "+n1+" "+n2);
        for (i=2;i<=n;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
    public static void main(String[] args) {
        Fibonacci();
    }
}
