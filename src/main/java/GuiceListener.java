import java.util.Arrays;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceListener extends GuiceServletContextListener{
	
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(Arrays.asList(new GuiceModule(),new JpaPersistModule("studentUnit")));
	}
	
}