package login;

import java.util.HashMap;

public class IdAndPasswords {
    HashMap<String,String> loginInfo = new HashMap<>();
    
    IdAndPasswords(){
        loginInfo.put("Olga", "qwerty");
        loginInfo.put("Vasileva", "password");
        loginInfo.put("OlgaVasileva", "123");
        loginInfo.put("a", "s");
    }
    
    protected HashMap<String,String> getLoginInfo(){
        return loginInfo;
    }
}
