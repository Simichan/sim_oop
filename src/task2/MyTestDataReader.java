/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author 2ENG
 */
public class MyTestDataReader {

    static int INITIAL_CAPACITY = 3;

    public static int[] DoubleTheSize(int[] prevData) {
        return Arrays.copyOf(prevData, prevData.length * 2);
    }

    public static int[] readIntValues() {
        int[] MyData = new int[INITIAL_CAPACITY];
        int HowMany = 0;
        try {

            String fileName = "test.txt";
            FileInputStream fstream = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
//                System.out.println(strLine);
                if (HowMany == MyData.length) {
                    MyData = DoubleTheSize(MyData);
                }
                MyData[HowMany] = Integer.parseInt(strLine);
                HowMany++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Arrays.copyOf(MyData, HowMany);
    }
    
    public static int[] readIntValues2() {
        int[] MyData = new int[INITIAL_CAPACITY];
        int HowMany = 0;
        try {

//            String fileName = "test.txt";
//            FileInputStream fstream = new FileInputStream(fileName);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //commend input  
            //if java task2.TestDriver1 < test.txt    replaced by file
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
//                System.out.println(strLine);
                if (HowMany == MyData.length) {
                    MyData = DoubleTheSize(MyData);
                }
                MyData[HowMany] = Integer.parseInt(strLine);
                HowMany++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Arrays.copyOf(MyData, HowMany);
    }
}
