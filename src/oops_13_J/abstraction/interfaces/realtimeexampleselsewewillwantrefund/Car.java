package src.oops_13_J.abstraction.interfaces.realtimeexampleselsewewillwantrefund;

public class Car implements Engine, Break{
   void start(){
   System.out.println("Started the Car");
       startEngine();
       breaks();
   }

   public void startEngine(){
       System.out.println("Started Engine");
   }

   public void breaks(){
       System.out.println("Break is working fine");
    }
}
