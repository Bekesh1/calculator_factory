/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.abstractcalculation;

/**
 *
 * @author bekesh
 */
public class CalculationGroup {

   public static AbstractCalculation get(int a){
       if(a==1){
           return new Addition();
           
       }
       else if(a==2)
       {
           return new Subtraction();
           
       }
   
       else if(a==3)
       {
           return new Multiplication();
           
       }
       
       else if(a==4)
       {
           return new Power();
           
       }
       
       else {
           return null;
       }
   }
    
}
