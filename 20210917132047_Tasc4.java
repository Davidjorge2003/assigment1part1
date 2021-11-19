/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //We implement a sacnner that will ask for our data .
        Scanner myScanner = new Scanner(System.in);
        
        //We input all the data we are gonna use that is esternal. 
        double a=100;
        
        //Here the program will ask for the data that is need it for example the inital balance the porcentege and the years you want to save the money.
        System.out.println("please enter the inicial balance");
        double InitialBalance= myScanner.nextDouble();
        
        System.out.println("please enter the interest rate (2 to 2%)");
        double InterestRate= myScanner.nextDouble();
        
        System.out.println("Number of years the client wants to save th money");
        double NumofYears= myScanner.nextDouble();
        
        //Here the program is going to do all the calculations that are need it. 
        double FirstCalc=(1+InterestRate/a);
        double SecCalc=Math.pow(FirstCalc,NumofYears);
        double FinalBalance=SecCalc*InitialBalance;
        
        //Here the program will print everything whit space.
       System.out.printf("The initial Balance is : %.2f%n",InitialBalance);
       System.out.printf("The the Anual interest is : %.2f%n", InterestRate);
       System.out.printf("Saving years are : %.2f%n",NumofYears);
       System.out.printf("--------------------------------%n" );
       System.out.printf("Balance after  : %.2f%n",FinalBalance);

       
    }
    
}
