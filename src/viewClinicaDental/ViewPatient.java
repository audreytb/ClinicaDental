package viewClinicaDental;
import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import javax.jdo.PersistenceManager;
import modelClinicaDental.*;

import java.util.ArrayList;
import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class ViewPatient extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException {
		HttpSession misesion= req.getSession();
		
		String patientId=(String)misesion.getAttribute("patientId");
		String queryKey=(String)misesion.getAttribute("queryKey");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		//Key k = KeyFactory.createKey(Patient.class.getSimpleName(), new Long(request.getParameter("patientId")));
		
		
		Key keypatient=KeyFactory.stringToKey(patientId);
		Patient paciente = pm.getObjectById(Patient.class, keypatient);
		
		String query = "select from " + Query.class.getName() + " where queryId ==" +patientId;		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		
		req.setAttribute("patient", paciente);
		req.setAttribute("consultas", consultas);
		
		if(misesion.getAttribute("queryKey")==null){
			resp.sendRedirect("viewPatientNew");
			
		}
		else{
			req.setAttribute("background",(ArrayList<String>) misesion.getAttribute("background"));	
			req.setAttribute("current", (ArrayList<String>) misesion.getAttribute("current"));	
			req.setAttribute("diagnosis", (ArrayList<String>) misesion.getAttribute("diagnosis"));
			req.setAttribute("forecast", (ArrayList<String>) misesion.getAttribute("forecast"));
			req.setAttribute("odontograma", (ArrayList<String>) misesion.getAttribute("odontograma"));
			req.setAttribute("discharge", (ArrayList<String>) misesion.getAttribute("discharge"));
			req.setAttribute("physical", (ArrayList<String>) misesion.getAttribute("physical"));
			req.setAttribute("treatment", (ArrayList<String>) misesion.getAttribute("treatment"));
			req.setAttribute("workplan", (ArrayList<String>) misesion.getAttribute("workplan"));
			
			
			pm.close();
			RequestDispatcher dispatcher =req.getRequestDispatcher("/queryPatient.jsp");
			dispatcher.forward(req, resp);
		
		}
		
		
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}