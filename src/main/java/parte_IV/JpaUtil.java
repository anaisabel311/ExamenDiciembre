package parte_IV;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil { 

    public static EntityManager getEM (String persistenceUnit) {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
    	EntityManager em = emf.createEntityManager(); 
    	
    	return em;
    }
}
