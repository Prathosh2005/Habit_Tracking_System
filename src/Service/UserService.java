package Service;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String,String> userMap=new HashMap<>();

   public void addUser(String email,String username)
   {
       userMap.put(email,username);
   }
    public String getUsername(String email)
    {
        return userMap.get(email);
    }
    public Map<String, String> getUserMap() {
        return userMap;
    }
}
