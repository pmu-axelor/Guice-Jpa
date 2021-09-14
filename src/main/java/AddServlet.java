import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import student.db.Student;

@Singleton
public class AddServlet extends HttpServlet{
	
	@Inject
	ServiceClasImpl serviceClasImpl;
	
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
		
		serviceClasImpl.createNewStudent(st);
		
		resp.sendRedirect(req.getContextPath());
}
	 
}
	
