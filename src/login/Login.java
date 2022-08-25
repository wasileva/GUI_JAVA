package login;

public class Login {

    public static void main(String[] args) {
        new LoginPage(new IdAndPasswords().getLoginInfo());
    }
    
}
