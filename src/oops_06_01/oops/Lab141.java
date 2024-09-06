package src.oops_06_01.oops;

public class Lab141 {
    public static void main(String[] args) {
        //Oops concept

        Person p = new Person(); //Person is blueprint/Class and new person is object/real world entity
        p.name = "Amit"; //New person is created through blueprint
        System.out.println(p.name);

        //person = Class or blueprint
        //p - reference variable
        //new Person() - Object or real world entity
        // Person(); - Method or Function

        Person p2 = new Person(); //Person is blueprint/Class and new person is object/real world entity
        p.name = "Pramod"; //New person is created through blueprint
        System.out.println(p2.name);

        new Person(); //New Object with no reference
        Person p3 = null; //No object because without "new" no object is created
        System.out.println("End of the Program");
    }
}
