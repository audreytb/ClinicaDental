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

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ViewNuevaConsulta extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse
			resp) throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= request.getSession();
		
		
		String patientKey=(String)misesion.getAttribute("patientId");
		String queryKey=(String)misesion.getAttribute("queryKey");
		

		//Key k = KeyFactory.createKey(Patient.class.getSimpleName(), new Long(request.getParameter("patientId")));
		
		
		Key keypatient=KeyFactory.stringToKey(patientKey);
		Patient paciente = pm.getObjectById(Patient.class, keypatient);
		
		String query = "select from " + Query.class.getName() + " where queryId ==" +patientKey;		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		
		request.setAttribute("patient", paciente);
		request.setAttribute("consultas", consultas);			
		
		request.setAttribute("background",(ArrayList<String>) misesion.getAttribute("background"));
		request.setAttribute("current", (ArrayList<String>) misesion.getAttribute("current"));
		request.setAttribute("diagnosis", (ArrayList<String>) misesion.getAttribute("diagnosis"));
		request.setAttribute("forecast", (ArrayList<String>) misesion.getAttribute("forecast"));
		request.setAttribute("odontograma", (ArrayList<String>) misesion.getAttribute("odontograma"));
		request.setAttribute("discharge", (ArrayList<String>) misesion.getAttribute("discharge"));
		request.setAttribute("physical", (ArrayList<String>) misesion.getAttribute("physical"));
		request.setAttribute("treatment", (ArrayList<String>) misesion.getAttribute("treatment"));
		request.setAttribute("workplan", (ArrayList<String>) misesion.getAttribute("workplan"));

		RequestDispatcher dispatcher =request.getRequestDispatcher("/queryHistory.jsp");
		dispatcher.forward(request, resp);
	}
	/**
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
	**/
}
