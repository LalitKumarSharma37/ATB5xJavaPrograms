package src.basics_06_24;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

      //Take a input from user Marks of 5 subjects and Print the marks
      Scanner sc = new Scanner(System.in);
      float[] marks = new float[5];
      System.out.println("Enter the First Subject Marks");
      marks[0] = sc.nextFloat();
      System.out.println("Enter the Second Subject Marks");
      marks[1] = sc.nextFloat();
      System.out.println("Enter the Third Subject Marks");
      marks[2] = sc.nextFloat();
      System.out.println("Enter the Fourth Subject Marks");
      marks[3] = sc.nextFloat();
      System.out.println("Enter the Fifth Subject Marks");
      marks[4] = sc.nextFloat();

      for(int i=0;i<marks.length;i++) {
          if(marks[i]<30){
              System.out.println("You are fail in this subject" +marks[i]);
          }
          System.out.println(marks[i]);
      }
      sc.close();
    }
}
