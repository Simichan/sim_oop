/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author 2ENG
 */
public class MyArray {
  
    public static <T extends Comparable<? super T>> T getMax(T[] a)
 {
  if (a == null || a.length == 0) 
   return null;
  T largest = a[0];
  for (int i = 1; i < a.length; i++)
   if (largest.compareTo(a[i]) < 0) 
    largest = a[i];
  return largest;
 }
    public static <T extends Comparable> T getLast(T[] a)
    {
        return (a==null||a.length==0)?null:a[a.length-1];
    }
}
