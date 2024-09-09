package src.oops_07_01.Inheritance;

public class Programming { //Parent Class

    int version;
    String author;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(String author,int version){
        this.author = author;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Version -> " +this.version + " Author -> " +this.author);
    }

    void car(){
       System.out.println("Lamborghini");
    }

    void bhk3(){
     System.out.println("bhk3");
    }
}
