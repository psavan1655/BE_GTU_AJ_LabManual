import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("/hibernate.cfg.xml").build();  
            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
         Customer e1=new Customer();    
            e1.setId(1);    
            e1.setFirstName("Gaurav");    
            e1.setContact("9898989898");
            e1.setAddress("This is demo address");
         
       session.save(e1);  
       t.commit();  
       System.out.println("successfully saved");    
        factory.close();  
        session.close();     
    }  
}  