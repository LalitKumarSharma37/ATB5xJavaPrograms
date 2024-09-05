package src.oops_07_30;

import java.sql.SQLOutput;

public class Lab112 {
    public static void main(String[] args) {

      /*int a = 10;
      int b = 20;
      int c = a+b;
      System.out.println(c);

      a = 34;
      b = 45;
      int d  = a+b;
        System.out.println(d);*/
        int c = sum(); //No arguments
       int c1 = sum(3); //1 arguments 3
        int c2 = sum(3,4); //2 arguments 3,4
       System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        sayHello(); // Call to the function


    }
  static int sum(int a, int b){  //Defintion of the function
        return a+b;
    }
   static int sum(int a){
        return a;
    }
    static int sum(){
        return 0-99; //Return any integer number
    }
    static void sayHello(){
        System.out.println("Say Yes");
    }


}
