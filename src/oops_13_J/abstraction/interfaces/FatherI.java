package src.oops_13_J.abstraction.interfaces;

interface FatherI {

    void loan1K();

   default void print(){
       System.out.println("I am default method");
   }

   static void print2(){
       System.out.println("I am static method");
   }

}


