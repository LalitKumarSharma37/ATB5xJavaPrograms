package src.oops_14_J.innerclass;

public class Lab155 {

    public static void main(String[] args) {

        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };

        s1.setId();


//        NoName s2 = new NoName();
//        s2.setId();
//
//
       }

}

// B b = new B() {
//    // This is a Anoynymous class
//    // No Name
//};



abstract class B{ //Concrete class
    int var_b = 12;
}

interface Student{ //Interface class
    int id = 11;
    void setId();
}

//class NoName implements Student{
//
//    @Override
//    public void setId() {
//
//    }