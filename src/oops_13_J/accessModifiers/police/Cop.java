package src.oops_13_J.accessModifiers.police;

public class Cop   {

   public int gun;
    //modifier return type name_variable

    public Cop(int gun){
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("OfCourse, Shoot");
    }
}
