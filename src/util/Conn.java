package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conn {

	public EntityManager em;
	public EntityManagerFactory emf;
	
	public void open(){
		emf=Persistence.createEntityManagerFactory("persis");
		em=emf.createEntityManager();
	}
	public void close(){
		em.close();
		emf.close();
	}
}
