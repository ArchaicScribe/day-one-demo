package edu.cnm.deepdive;


public class Demo {

  public static void main (String [] args){
    System.out.println("Hello, Wold!");//System is the name of class in the library.  Out is an object. Prinln is a method and takes arguments.
    long msSinceStartOfTime = System.currentTimeMillis();
    double secondsSinceStartOfTime = msSinceStartOfTime / 1000.0;//literal int value. Double precision value
    long truncated = (long) secondsSinceStartOfTime;//type cast. Get rid of fraction.
    long rounded = Math.round(secondsSinceStartOfTime);//Math is the class, upper case, round is the method, lower case.
    System.out.println(secondsSinceStartOfTime);//println followed by a new line character
    System.out.println(truncated);
    System.out.println((rounded));//Classes are upper case. Methods are lower or Camel Case. Packages always lower case. Fields and methods are camel cases.
  }

}
