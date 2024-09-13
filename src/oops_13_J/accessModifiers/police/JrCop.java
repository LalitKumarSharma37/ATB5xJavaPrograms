package src.oops_13_J.accessModifiers.police;

public class JrCop {

    public static void main(String[] args) {

        Cop c = new Cop(10);
        System.out.println(c.gun );
        c.canIShoot();
    }
}
