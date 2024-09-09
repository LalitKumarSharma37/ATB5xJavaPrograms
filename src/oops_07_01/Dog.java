package src.oops_07_01;

public class Dog {

    Dog(){
        System.out.println("DC");
    }
    Dog(String name){
        System.out.println("Paramterized C");
    }


    String name; //Instance variable -> I can use it outside the block

    void bark(){
        int age = 10; //Local variable -> I can't use this outside the block
        System.out.println("Bark");
        System.out.println(name); //Instance variable is used here
    }


}
