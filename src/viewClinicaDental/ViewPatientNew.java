package viewClinicaDental;
import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import javax.jdo.PersistenceManager;
import modelClinicaDental.*;

import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class ViewPatientNew extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		/**
		String dni=(String)misesion.getAttribute("dni");
		String query = "select from " + Patient.class.getName() + " where number_dni == '"+dni+"'";
		List<Patient> pacientes = (List<Patient>)pm.newQuery(query).execute();
		**/
		Patient patient = pm.getObjectById(Patient.class,KeyFactory.stringToKey((String)misesion.getAttribute("patientId")));
		
		String query = "select from " + 
				Query.class.getName() + " where queryId =="
				+(String)misesion.getAttribute("patientId");		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		
		
		req.setAttribute("patient", patient);
		req.setAttribute("consultas", consultas);
		
		System.out.println(patient);
		System.out.println(consultas);
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/queryPatientNew.jsp");
		dispatcher.forward(req, resp);
	}
}