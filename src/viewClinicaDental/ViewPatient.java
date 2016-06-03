package viewClinicaDental;
import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import modelClinicaDental.Patient;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import modelClinicaDental.Query;
import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class ViewPatient extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Key k = KeyFactory.createKey(Patient.class.getSimpleName(), new Long(request.getParameter("patientId")));
		Patient a = pm.getObjectById(Patient.class, k);
		
		String query = "select from " + 
				Query.class.getName() + " where queryId =="
				+request.getParameter("patientId");
				
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("patient", a);
		request.setAttribute("consultas", consultas);
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/queryPatient.jsp");
		dispatcher.forward(request, response);
		
	}
}