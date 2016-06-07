package viewClinicaDental;
import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import modelClinicaDental.Patient;
import javax.jdo.PersistenceManager;
import modelClinicaDental.*;
import modelClinicaDental.Query;
import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class ViewPatient extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException {
		HttpSession misesion= request.getSession();
		
		String patientKey=(String)misesion.getAttribute("patientId");
		String queryKey=(String)misesion.getAttribute("queryKey");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		//Key k = KeyFactory.createKey(Patient.class.getSimpleName(), new Long(request.getParameter("patientId")));
		
		
		Key keypatient=KeyFactory.stringToKey(patientKey);
		Patient paciente = pm.getObjectById(Patient.class, keypatient);
		
		String query = "select from " + 
				Query.class.getName() + " where queryId =="
				+request.getParameter("patientId");		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		
		request.setAttribute("patient", paciente);
		request.setAttribute("consultas", consultas);
		
		if(misesion.getAttribute("queryKey")==null){
			response.sendRedirect("viewPatientNew");
			
		}
		else{
			System.out.println((String)misesion.getAttribute("queryKey"));
			Key keybackground=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Background background = pm.getObjectById(Background.class, keybackground);
			request.setAttribute("background", background);
			
			System.out.println(background);
			
			Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Current_Illness current = pm.getObjectById(Current_Illness.class, keycurrent);
			request.setAttribute("current", current);
			
			Key keydiagnosis=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Diagnosis diagnosis = pm.getObjectById(Diagnosis.class, keydiagnosis);
			request.setAttribute("diagnosis", diagnosis);
			
			Key keyforecast=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Forecast forecast = pm.getObjectById(Forecast.class, keyforecast);
			request.setAttribute("forecast", forecast);
			
			Key keyodontograma=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Odontograma odontograma = pm.getObjectById(Odontograma.class, keyodontograma);
			request.setAttribute("odontograma", odontograma);
			
			Key keydischarge=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Patient_Discharge discharge = pm.getObjectById(Patient_Discharge.class, keydischarge);
			request.setAttribute("discharge", discharge);
			
			Key keyphysical=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			PhysicalExploration physical = pm.getObjectById(PhysicalExploration.class, keyphysical);
			request.setAttribute("physical", physical);
			
			Key keytreatment=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Treatment_Recomendation treatment = pm.getObjectById(Treatment_Recomendation.class, keytreatment);
			request.setAttribute("treatment", treatment);
			
			Key keyworkplan=KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
			Workplan workplan = pm.getObjectById(Workplan.class, keyworkplan);
			request.setAttribute("workplan", workplan);
		
		}
		//}
		/**
		String query1 = "select from " + Background.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> background = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("background", background);
		//request.setAttribute("background", background.get(background.size()-1));
		
		String query2 = "select from " + Current_Illness.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> current = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("current", current);
		//request.setAttribute("current", current.get(current.size()-1));
		
		String query3 = "select from " + Diagnosis.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> diagnosis = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("diagnosis", diagnosis);
		//request.setAttribute("diagnosis", diagnosis.get(diagnosis.size()-1));
		
		String query4 = "select from " + Forecast.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> forecast = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("forecast", forecast);
		//request.setAttribute("forecast", forecast.get(forecast.size()-1));
		
		String query5 = "select from " + Odontograma.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> odontograma = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("odontograma", odontograma);
		//request.setAttribute("odontograma", odontograma.get(odontograma.size()-1));
		
		String query6 = "select from " + Patient_Discharge.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> discharge = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("discharge", discharge);
		//request.setAttribute("discharge", discharge.get(discharge.size()-1));
		
		String query7 = "select from " + PhysicalExploration.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> physical = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("physical", physical);
		//request.setAttribute("physical", physical.get(physical.size()-1));
		
		String query8 = "select from " + Treatment_Recomendation.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> treatment = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("treatment", treatment);
		//request.setAttribute("treatment", treatment.get(treatment.size()-1));
		
		String query9 = "select from " + Workplan.class.getName() + " where queryId =="+request.getParameter("queryKey");		
		List<Query> workplan = (List<Query>)pm.newQuery(query).execute();
		request.setAttribute("workplan", workplan);
		//request.setAttribute("workplan", workplan.get(workplan.size()-1));
		**/
		
	
		pm.close();//agregado
		
		
		//RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/queryPatient.jsp");
		//dispatcher.forward(request, response);
		
		
	}
}