/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Calendar;
/**
 *
 * @author 2ENG
 */
public class taskdriver1 {

    public static void main(String[] args) {
        test1();
        test3();
    }

    public static void test1() {
        MyArray myarr = new MyArray();
        String[] mylangs = {"java", "C++", "python", "C#", "R"};
        String getmax = MyArray.<String>getLast(mylangs);
        System.out.println("laststr:" + getmax);
    }

    public static void test3() {
        
        Calendar[] myobjs = new Calendar[4];
        myobjs[0] = Calendar.getInstance();
        myobjs[0].set(2015, 12, 20, 0, 0, 0);
        myobjs[1] = Calendar.getInstance();
        myobjs[1].set(2014, 12, 25, 0, 0, 0);
        myobjs[2] = Calendar.getInstance();
        myobjs[2].set(1999, 6, 13, 0, 0, 0);
        myobjs[3] = Calendar.getInstance();
        myobjs[3].set(1984, 2, 5, 0, 0, 0);

        Calendar maxNum = MyArray.<Calendar>getMax(myobjs);

        System.out.println("maxNum:" + maxNum);
    }

}
