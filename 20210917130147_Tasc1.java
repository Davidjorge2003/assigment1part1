/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author davic
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //we implement a scanner that it will as for our name,age,gender,height and depatment  
      Scanner myScanner = new Scanner(System.in);
      
      //here the program is asking fro your name
      System.out.println("please enter your name:");
      String name = myScanner.nextLine();
      
      //here the program is asking fro your age
      System.out.println("please enter your age:");
      String age = myScanner.nextLine();
      
      //here the program is asking fro your gender
      System.out.println("please enter your gender:");
      String gender = myScanner.nextLine();
      
      //here the program is asking fro your height 
      System.out.println("please enter your height:");
      String height = myScanner.nextLine();
      
      //here the program is asking fro your department 
      System.out.println("please enter your department:");
      String department = myScanner.nextLine();
      
      //Know whit the Printf we make that when te program is finish we can see all the imformation whit space 
      System.out.printf("Name : %s%n",name );
      System.out.printf("Age : %s%n",age );
      System.out.printf("Gender : %s%n",gender );
      System.out.printf("Height : %s%n",height );
      System.out.printf("Department : %s%n",department );
      
    }
    
}
