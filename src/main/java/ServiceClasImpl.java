import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import student.db.Student;

public class ServiceClasImpl implements Serviceclas{
	
	@Inject
	 private Provider<EntityManager> em;
	   
	
	@Transactional
	public void createNewStudent(Student st) {
		 Student st1 = new Student();
		  st1.setName(st.getName());
		  st1.setDepartment(st.getDepartment());
		  st1.setCity(st.getCity());
		
		  
		  em.get().persist(st1);
		
		  } 
	
	@Transactional
	 public void deleteStudent(int id) {
		Student s = em.get().find(Student.class, id);
		em.get().remove(s);
	}
}
