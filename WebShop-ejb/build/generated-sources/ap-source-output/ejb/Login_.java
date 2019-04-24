package ejb;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-24T12:55:10")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, String> password;
    public static volatile SingularAttribute<Login, Integer> administrator;
    public static volatile SingularAttribute<Login, Integer> premium;
    public static volatile SingularAttribute<Login, String> name;
    public static volatile SingularAttribute<Login, Long> id;

}