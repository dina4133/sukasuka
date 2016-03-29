/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jur_1;

import java.util.ArrayList;

/**
 *
 * @author Praktikum
 */
public class Fibonaci2 {
    ArrayList<Integer> al = new ArrayList<>();
    
    public void performFibonaci2(int i){
        int sum = 0;
        for (int j = 0; j < i; j++) {
            if ( j == 0 || j == 1){
                al.add(1);
                sum += 1;
                continue;
            }
            al.add(al.get(j-1)+al.get(j-2));
            sum += al.get(j);
        }
        
        System.out.println("" + sum);
        
    }
}
