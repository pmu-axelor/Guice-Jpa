import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import student.db.Student;

@Singleton
public class DeleteStudentServlet extends HttpServlet {
	
	@Inject
	ServiceClasImpl serviceClasImpl;
	
	@Inject
	 EntityManager em;
	
	@Override 
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException {
		String sid = req.getParameter("id");
		System.out.println(sid);
		int id = Integer.parseInt(sid);
		    
		  /*  Student st = new Student();
		    st.setId(id);*/
		 
		
		serviceClasImpl.deleteStudent(id);
		
		resp.sendRedirect(req.getContextPath());
	}
}
