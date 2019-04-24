/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import ejb.EJBController;
import ejb.Login;
import ejb.Order;
import ejb.Watch;
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

    public void fillDB(){
        Login login = new Login("Erik", "password", 1, 0);
        c.persist(login);
        Login login2 = new Login("Anna", "password321", 0, 0);
        c.persist(login2);
        Login login3 = new Login("Adam", "password123", 0, 1);
        c.persist(login3);
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