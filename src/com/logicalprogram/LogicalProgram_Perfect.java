package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Perfect {
    public static void Perfect(){
        int n,sum=0,i;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter number: ");
        n=r.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
            System.out.println("Input number is a perfect number!");
        else System.out.println("Input number is not a perfect number!");
    }
    public static void main(String[] args) {
        Perfect();
    }
}
