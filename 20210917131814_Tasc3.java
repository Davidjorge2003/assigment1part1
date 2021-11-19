/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author davic
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Here we implement a scanner that will ask for our data for example the 4 digits octal.
     Scanner myScanner = new Scanner(System.in);
   
    //Here we ask for the 4 digit octal 
    System.out.println("please enter a 4 digits octal number");
     double octalNumber= myScanner.nextDouble();
     
     //Here we do all the operaion that are need it.
     double p1=octalNumber%10;

     //Here we use the class int insted of double to make the number whit out decimal 
     int octalNumber1=(int) (octalNumber/10);
     double p2=octalNumber1%10;
     int octalNumber2=octalNumber1/10;
     double p3=octalNumber2%10;
     int octalNumber3=octalNumber2/10;
     double p4= octalNumber3%10; 
     
     double pow1=Math.pow (8,0);
     double num1=p1*pow1;
        
     double pow2=Math.pow (8,1);
     double num2=p2*pow2;
     
     double pow3=Math.pow (8,2);
     double num3=p3*pow3;
     
     double pow4=Math.pow (8,3);
     double num4=p4*pow4;
     
     double decimalNum=num4+num3+num2+num1;
     
     //Here we print the result nice and clear.
     System.out.printf("The octal number is : %.0f%n",octalNumber);
     System.out.printf("The the decimal number is : %.0f%n",decimalNum);
    }
    
}
