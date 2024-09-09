package src.oops_07_30D;

public class Lab113 {
    public static void main(String[] args) {


      //What is Function- Function is something that can do some task

    //How to create a function?
    //1. Definition
    //2. Call the function

    // Function vs Method(is different OOPs)

    sayHello4Times();//Call the function
     double d = Math.pow(2,3);
     System.out.println(d);

     //OOPs - accessModifier (Private, public and protected)

    }


    //    accessModifier returnType methodName(parameterList) {
    // method body
    //    }

    static void sayHello4Times(){ //Defintion 
        for(int i=0;i<4;i++){
            System.out.println("Hello");
        }
    }

}
