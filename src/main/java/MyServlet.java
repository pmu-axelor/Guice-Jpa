import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;

import student.db.Student;

@Singleton
public class MyServlet extends HttpServlet{

	@Inject
	EntityManager em;
	
	@Override 
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException {
		
		 Query query =  em.createQuery("SELECT s FROM Student s ");
		  List results = query.getResultList();
		
		 req.setAttribute("data",results);
		 
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);  
		 
	}
	
	@Override 
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String department = req.getParameter("dpt");
		String city = req.getParameter("city");
		
		Student st = new Student();
		st.setName(name);
		st.setDepartment(department);
		st.setCity(city);
		
		
		
		 Query query =  em.createQuery("SELECT s FROM Student s ");
		  List results = query.getResultList();
		
		req.setAttribute("data",results);
		 
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);  
		
	}
}
