/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.CalculatorFactory;

import com.leapfrog.abstractcalculation.AbstractCalculation;
import com.leapfrog.abstractcalculation.CalculationGroup;
import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double total=0;
        System.out.println("Please enter the first number:");
        double a=sc.nextDouble();
        System.out.println("Please enter the Second  number:");
        double b=sc.nextDouble();
        
        System.out.println("Please enter your choice:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Power");
        int choice=sc.nextInt();
        
        
        AbstractCalculation abs= CalculationGroup.get(choice);
        if(abs!=null)
        {
            total=abs.calculate(a, b);
        }
 
        System.out.println(total);
        
        
        
        
        
    }
    
}
