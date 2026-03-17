package Service;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String,String> login=new HashMap<>();

   public void registerUser(String email,String password)
   {
       login.put(email,password);
   }

    public Map<String, String> getLogin() {
        return login;
    }


}
