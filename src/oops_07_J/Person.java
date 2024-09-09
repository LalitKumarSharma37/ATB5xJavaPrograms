package src.oops_07_J;

public class Person {

    String name;

    Person(){
        System.out.println("DC");
    }

    Person(String ref_name){
       this.name = ref_name;
    }

    void printdetails(){
        System.out.println(this.name);
    }
}
