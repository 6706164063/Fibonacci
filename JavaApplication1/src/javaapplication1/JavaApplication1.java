/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[]args) {
       System.out.println("Fransiscus Gilbert Demos Situmeang ");
Scanner show = new Scanner(System.in);
System.out.print("Masukan Jumlah Deret Fibonacci : \n" );
int n = show.nextInt();
long fib[] = new long[n];
    fib[0] = 0;
    fib[1] = 1;

       
  System.out.println("");
  
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
           }

for (int i = 0; i < n; i++) 
    
System.out.print(fib[i] +" ");

       System.out.println(n);
}
   
  

}
   
   
    
