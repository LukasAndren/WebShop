/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import ejb.EJBController;
import ejb.Login;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author buster
 */
@Named(value = "webController")
@SessionScoped
public class WebController implements Serializable {
    private String name, password;
    @EJB
    private EJBController c;

    /**
     * Creates a new instance of WebController
     */
    public WebController() {
    }
    
    public void addUser(){
        Login login = new Login();
        login.setAdministrator(1);
        login.setName(name);
        login.setPassword(password);
        login.setPremium(1);
        c.persist(login);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}