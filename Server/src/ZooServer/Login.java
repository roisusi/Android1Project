package ZooServer;

import java.util.ArrayList;
import java.util.List;

public class Login {

    private String login;
    private String pas;
    private String admin;
    private String email;
    private List<String> logins;

    public Login(String login, String pas, String admin, String email) {
        this.login = login;
        this.pas = pas;
        this.admin = admin;
        this.email = email;
        logins = new ArrayList<>();
    }

    public Login(String login, String pas) {
        this.login = login;
        this.pas = pas;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPas() {
        return pas;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> send(){
        logins.add(getLogin());
        logins.add(getPas());
        logins.add(getAdmin());
        logins.add(getEmail());
        return logins;
    }

}
