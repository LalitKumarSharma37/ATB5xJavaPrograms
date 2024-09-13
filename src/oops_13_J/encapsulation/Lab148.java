package src.oops_13_J.encapsulation;

public class Lab148 {

    public static void main(String[] args) {

        //Hidden
        vwologinfixed vwologin = new vwologinfixed("admin", "admin");


        boolean check = vwologin.isLoggedIn("admin", "password");
       String u = vwologin.getUsername();
     // String p = vwologin.getPassword();
     // vwologin.password = "password";  //Not able to set the password because of encapsulation
       System.out.println(u);
        System.out.println(check);
     //   System.out.println(vwologin.password); //But access if password makes public
    }

}

class vwologinfixed{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    vwologinfixed(String u, String p){
        this.username = u;
        this.password = p;
    }

    boolean isLoggedIn(String username, String password){
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged In!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
}
