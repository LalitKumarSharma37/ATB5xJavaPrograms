package src.oops_13_J;

public class  Lab146 {
    public static void main(String[] args) {

     BlockClass bc = new BlockClass();  //Object is created
    // BlockClass bc;
// Here object not created so no IIB is call, and no default constructor will call
      new BlockClass(); //Object is created
    // 2 time object is created
    //But SIB is call only one time
    //Then IIB call and then DC call

    }
}
