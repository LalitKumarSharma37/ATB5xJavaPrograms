package src.oops_07_J.Inheritance;

public class Java extends Programming {

    String newFeature;

    Java(){
        System.out.println("Java DC");
    }

   Java(String feature){
      this.newFeature =  feature;
   }
    void printInfo(){
        System.out.println("Child Information");
    }
}
