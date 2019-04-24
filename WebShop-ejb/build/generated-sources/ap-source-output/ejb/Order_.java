package ejb;

import ejb.Login;
import ejb.Watch;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-24T11:24:14")
@StaticMetamodel(Order.class)
public class Order_ { 

    public static volatile SingularAttribute<Order, Date> date;
    public static volatile SingularAttribute<Order, Integer> amount;
    public static volatile SingularAttribute<Order, Double> total;
    public static volatile SingularAttribute<Order, Watch> watch;
    public static volatile SingularAttribute<Order, Long> id;
    public static volatile SingularAttribute<Order, Login> Login;

}