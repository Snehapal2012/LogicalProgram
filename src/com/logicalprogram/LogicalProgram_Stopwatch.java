package com.logicalprogram;

import java.util.Scanner;

public class LogicalProgram_Stopwatch {
    public static void Stopwatch(){
        char start_char,end_char;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter character to START the stopwatch: ");
        start_char=r.next().charAt(0);
        long start=System.currentTimeMillis();
        System.out.print("Enter character to Enter the stopwatch: ");
        end_char=r.next().charAt(0);
        long end=System.currentTimeMillis();
        float time=(float)(end-start)/1000;
        System.out.println("Time elapses: "+time+" Seconds");
    }
    public static void main(String[] args) {
        Stopwatch();
    }
}
