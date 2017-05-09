/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

public class Counter implements Comparable<Counter> {

    private final String name;     // counter name
    private final int maxCount;    // maximum value
    private int count;             // current value

    // create a new counter with the given parameters
    public Counter(String id, int max) {
        name = id;
        maxCount = max;
        count = 0;
    } 

    // increment the counter by 1
    public void increment() {
        if (count < maxCount) 
  {
   count++;
  }
    } 

    // return the current count
    public int value() {
        return count;
    } 

    // return a string representation of this counter
    public String toString() {
        return name + ": " + count;
    } 

    // compare two Counter objects based on their count
    public int compareTo(Counter that) {
        if      (this.count < that.count) return -1;
        else if (this.count > that.count) return +1;
        else                              return  0;
    }


    // test client
    public static void main(String[] args) { 
  Counter count1 = new Counter("id1", 10);
  Counter count2 = new Counter("id2", 10);
  Counter count3 = new Counter("id3", 10);
  Counter count4 = new Counter("id4", 10);
  count1.increment();
  count1.increment();
  count2.increment();
  count2.increment();
  count2.increment();
  count3.increment();
  count3.increment();
  count3.increment();
  count3.increment();
  count3.increment();
  count4.increment();
  count4.increment();
  count4.increment();

  Counter[] myarray = new Counter[4];
  myarray[0] = count1;
  myarray[1] = count2;
  myarray[2] = count3;
  myarray[3] = count4;

  System.out.println("" + MyArray.<Counter>getMax(myarray));
    } 
} 

