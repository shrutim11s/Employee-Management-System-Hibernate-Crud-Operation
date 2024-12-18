import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonalMatterController {
          public static void main(String[] args) {
	
        	   Configuration cfg = new Configuration();
        	   cfg.addAnnotatedClass(PersonalMatter.class).configure();
        	   
        	   SessionFactory sf = cfg.buildSessionFactory();
        	   Session ss = sf.openSession();
        	   
        	   Transaction tt = ss.beginTransaction();
        	   
        	   PersonalMatter pm = new PersonalMatter( 111, "Rahul" , "Mishra" , "9 Aug 1997" , "Male" );
        	   
        	   ss.save(pm);
        	   
        	   System.out.println(pm);
        	   
        	   tt.commit();
        	   
        	   ss.close();
        	   
        	   
	
}
	
	
}
