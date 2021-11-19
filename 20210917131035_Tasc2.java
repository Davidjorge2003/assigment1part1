/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author davic
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //We implement a scanner that will ask for the data 
        Scanner myScanner = new Scanner(System.in);
        //We put the data that we are going to used to do the discount 
        double a=100;
        double federalTaxes= 0.05;
        double provincialTax= 0.09975;
        
        //We ask fro the price of the object 
        System.out.println("Introduce the price of the object");
        double price= myScanner.nextDouble();
        
        //Know the program ask for the discount off the object 
        System.out.println("Introduce the discount of the object (5 to 5%)");
        double discount= myScanner.nextDouble();
        
        //Here we will do the operation for the discount 
        double DiscountPrice= price*discount/a;
        
        //Know we are gonna substract the initial price less the DiscountPrice
        double FinalPrice= price-DiscountPrice;
        
        //Know we implent the federal taxes 
         double federaltaxes=FinalPrice*federalTaxes;
        
          //Know we implent the provincial taxes 
         double provincialtaxes=FinalPrice*provincialTax;
         
         //Know we sume all the taxes and we get the final price 
         double Finalpricetax=FinalPrice+federaltaxes+provincialtaxes;
       
         //Know whit the Printf we make that when te program is finish we can see all the imformation whit space 
         System.out.printf("The the initial price is : %.2f%n",price);
        
         System.out.printf("The discount is : %.2f%n",discount );
         
         System.out.printf("The final price is : %.2f%n", FinalPrice);
         
         System.out.printf("Price Before Fedral Taxes : %.2f%n",FinalPrice );
         
         System.out.printf("--------------------------------%s%n","-----" );
         
         System.out.printf("The federal taxes is : %.2f%n",federaltaxes );
         
         System.out.printf("The provincial taxes is : %.2f%n",provincialtaxes  );
         
         System.out.printf("the final price is : %.2f%n",Finalpricetax );
    }
    
}
