/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import ejb.CartBean;
import ejb.EJBController;
import ejb.Login;
import ejb.Purchase;
import ejb.Watch;
import java.io.Serializable;
import java.util.List;
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

    @EJB
    private CartBean cartBean;
    @EJB
    private EJBController c;
    
    private String name, password;
    private List<Watch> cart;
    private List<Watch> productsFromDB;
    private Watch watch;
    private Login user;
    private Purchase order;

    /**
     * Creates a new instance of WebController
     */
    
    public WebController() {
    }

    public void webStart1() {
        
        watch = new Watch("Rolex", "Fin kloka för herrar");
//        c.persist(watch);
        addToCart();
    }
    public void webStart() {
        
        name = "Albin";
        password = "albin123";
        //addUser();
        checkOutCart();
    }
    
    public void addUser(){
        user = new Login(name, password, 0, 0);
        c.persist(user);
    }

    public void fillDB(){
        Login login = new Login("Erik", "password", 1, 0);
        c.persist(login);
        Login login2 = new Login("Anna", "password321", 0, 0);
        c.persist(login2);
        Login login3 = new Login("Adam", "password123", 0, 1);
        c.persist(login3);
    }
    
    public void addToCart(){
        cartBean.addToCart(watch);
        updateCart();
    }
    
    public void deleteFromCart(){
        cartBean.deleteFromCart(watch);
        updateCart();
    }
    
    public void updateCart(){
        cart = cartBean.getCart();
    }
    
    public void clearCart(){
        cart.clear();
        cartBean.clearCart();
    }
    
    public void checkOutCart(){
        for(Watch w : cart){
            order = new Purchase(user, w);
            c.persist(order);
        }
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

    public List<Watch> getCart() {
        return cart;
    }

    public void setCart(List<Watch> cart) {
        this.cart = cart;
    }

    public List<Watch> getProductsFromDB() {
        return productsFromDB;
    }

    public void setProductsFromDB(List<Watch> productsFromDB) {
        this.productsFromDB = productsFromDB;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    public Login getUser() {
        return user;
    }

    public void setUser(Login user) {
        this.user = user;
    }
    
    
}