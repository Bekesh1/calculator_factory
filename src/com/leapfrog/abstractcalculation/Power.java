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
public class Power extends AbstractCalculation{

    @Override
    public double calculate(double x, double y) {
       int total = 0;
        for(int i=1; i<=y; i++)
        {
            total*=y;
        }
        return total;
    
    }
    
}
