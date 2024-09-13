package src.oops_13_J.abstraction.interfaces.askinterviewquestions;

public class Lab149 {

    public static void main(String[] args) {

    }
}

interface I01{

}
interface I02{

}
class A{}
class B{}
abstract class C{}
abstract class D{}

class Test1 extends A{}
//class Test2 extends A,B{} //Two class extends not allowed
class Test3 implements I01{}
class Test4 implements I01,I02{} //Two class implements is allowed in interface
class Test5 extends A implements I01,I02{}
// class test6 implements I01 extends A{} //Not possible because implements should be last
//interface I3 extends A{} //interface not use extends keyword
//interface I4 implements A{} //interface can't use class reference

interface I5 extends I01,I02{}

