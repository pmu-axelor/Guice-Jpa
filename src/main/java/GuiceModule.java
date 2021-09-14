import com.google.inject.persist.PersistFilter;
import com.google.inject.servlet.ServletModule;

public class GuiceModule extends ServletModule{
	@Override
	  protected void configureServlets() {
		 
		 filter("/*").through(PersistFilter.class);
		 serve("/").with(MyServlet.class);
		 serve("/add").with(AddServlet.class);
		 serve("/DeleteStudentServlet").with(DeleteStudentServlet.class);
		 
		
		 
		 
	  }  
}
