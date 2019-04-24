/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author buster
 */
@Stateless
@LocalBean
public class EJBController {
        @PersistenceContext(unitName = "WebShop-ejbPU")
        private EntityManager em;

        
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

//    public void persist(Object object) {
//        em.persist(object);
//    }

    public void persist(Object object) {
        
        em.persist(object);
    }
}
