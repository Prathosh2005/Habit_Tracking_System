package Model;

public class User {

    private String  username;
    private String email;
    public User(String email,String username)
    {
        this.email=email;
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
