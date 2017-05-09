/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Arrays;

/**
 *
 * @author 2ENG
 */
public class TestDriver1 {
    
     public static void main(String[] args) {
        int[] myvals=MyTestDataReader.readIntValues2();
        System.out.println(""+Arrays.toString(myvals));
    }
}
