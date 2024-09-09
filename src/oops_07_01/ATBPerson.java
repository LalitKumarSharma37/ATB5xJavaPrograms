package src.oops_07_01;

public class ATBPerson {

        String name; //Attributes/Data member/Instance variable
        long phone;  //Instance variable values are default
        String email;
        boolean isMarried;

        ATBPerson(){  //Default Constructor
            System.out.println("I am called");
        }

        ATBPerson(String valuefromObjectRef){  //Parameterized constructor
            this.name = valuefromObjectRef;
            System.out.println("I am called");
        }

        void talk() {   //Behaviour/Method

            System.out.println("Talk");
        }

            void printdetail(){
                System.out.println(name);
                System.out.println(phone);
                System.out.println(email);
                System.out.println(isMarried);
        }


}
