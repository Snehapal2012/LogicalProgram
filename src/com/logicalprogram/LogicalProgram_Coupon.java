package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Coupon {
    public static void main(String[] args) {
        Scanner input_random=new Scanner(System.in);
        System.out.print("Size of coupon code: ");
        int number=input_random.nextInt();
        String AlphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"1234567890";
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<number;i++){
            int index=(int)(AlphaNumericString.length()*Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        System.out.println("Coupon Code: "+sb.toString());
    }
}
