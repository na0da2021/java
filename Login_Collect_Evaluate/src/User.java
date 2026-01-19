public class User {
    private String email = "user_name";
    private String password = "user444";


    //constructor
    public User(String mail, String pass){
        this.email = mail;
        this.password = pass;
    }

    /*
    //setter method
    public void set_credentials(String mail, String pass){
        email = mail;
        password = pass;
    }
    */

    //getter method
    public String get_mail(){
        return email;
    }

    public String get_pass(){
        return password;
    }
}
