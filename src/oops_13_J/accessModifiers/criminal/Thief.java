package src.oops_13_J.accessModifiers.criminal;

import src.oops_13_J.accessModifiers.police.Cop;

public class Thief {

    public static void main(String[] args){

    Cop c = new Cop(10);
    System.out.println(c.gun );
   // c.canIShoot();
   //Thief is not allowed to access "canIShoot" because thief is not in protected folder

    }
}
