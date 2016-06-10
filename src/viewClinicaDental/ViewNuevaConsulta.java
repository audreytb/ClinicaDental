package viewClinicaDental;

import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import modelClinicaDental.Patient;
import modelClinicaDental.Patient_Discharge;
import modelClinicaDental.PhysicalExploration;

import javax.jdo.PersistenceManager;

import modelClinicaDental.Background;
import modelClinicaDental.Current_Illness;
import modelClinicaDental.Diagnosis;
import modelClinicaDental.Forecast;
import modelClinicaDental.Odontograma;
import modelClinicaDental.PMF;
import modelClinicaDental.Query;
import modelClinicaDental.Treatment_Recomendation;
import modelClinicaDental.Workplan;

import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class ViewNuevaConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		
		String patientKey=(String)misesion.getAttribute("patientId");
		String queryKey=(String)misesion.getAttribute("queryKey");
		

		//Key k = KeyFactory.createKey(Patient.class.getSimpleName(), new Long(request.getParameter("patientId")));
		
		
		Key keypatient=KeyFactory.stringToKey(patientKey);
		Patient paciente = pm.getObjectById(Patient.class, keypatient);
		
		String query = "select from " + Query.class.getName() + " where queryId ==" +patientKey;		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		
		req.setAttribute("patient", paciente);
		req.setAttribute("consultas", consultas);
		
	
		
		/**
		req.setAttribute("background", null);
		if((String)misesion.getAttribute("queryBackground")!=null){
		Key keybackground=KeyFactory.stringToKey((String)misesion.getAttribute("queryBackground"));
		Background background = pm.getObjectById(Background.class, keybackground);
		req.setAttribute("background", background);
		}
		**/
		
		
		//req.setAttribute("current", null);
		System.out.println(req.getAttribute("current"));
		if((String)misesion.getAttribute("queryCurrent")!=null){
		Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryCurrent"));
		Current_Illness current = pm.getObjectById(Current_Illness.class, keycurrent);
		req.setAttribute("current", current);
		}
		System.out.println(req.getAttribute("current"));
		/**
		req.setAttribute("diagnosis", null);
		if((String)misesion.getAttribute("queryDiagnosis")!=null){
		Key keydiagnosis=KeyFactory.stringToKey((String)misesion.getAttribute("queryDiagnosis"));
		Diagnosis diagnosis = pm.getObjectById(Diagnosis.class, keydiagnosis);
		req.setAttribute("diagnosis", diagnosis);
		}
		
		req.setAttribute("forecast", null);
		if((String)misesion.getAttribute("queryForecast")!=null){
		Key keyforecast=KeyFactory.stringToKey((String)misesion.getAttribute("queryForecast"));
		Forecast forecast = pm.getObjectById(Forecast.class, keyforecast);
		req.setAttribute("forecast", forecast);
		}
		
		req.setAttribute("odontograma", null);
		if((String)misesion.getAttribute("queryOdontograma")!=null){
		Key keyodontograma=KeyFactory.stringToKey((String)misesion.getAttribute("queryOdontograma"));
		Odontograma odontograma = pm.getObjectById(Odontograma.class, keyodontograma);
		req.setAttribute("odontograma", odontograma);
		}
		
		req.setAttribute("discharge", null);
		if((String)misesion.getAttribute("queryPatient_Discharge")!=null){
		Key keydischarge=KeyFactory.stringToKey((String)misesion.getAttribute("queryPatient_Discharge"));
		Patient_Discharge discharge = pm.getObjectById(Patient_Discharge.class, keydischarge);
		req.setAttribute("discharge", discharge);
		}
		
		req.setAttribute("physical", null);
		if((String)misesion.getAttribute("queryPhysicalExploration")!=null){
		Key keyphysical=KeyFactory.stringToKey((String)misesion.getAttribute("queryPhysicalExploration"));
		PhysicalExploration physical = pm.getObjectById(PhysicalExploration.class, keyphysical);
		req.setAttribute("physical", physical);
		}
		
		req.setAttribute("treatment", null);
		if(misesion.getAttribute("queryTreatment_Recomendation")!=null){
		Key keytreatment=KeyFactory.stringToKey((String)misesion.getAttribute("queryTreatment_Recomendation"));
		Treatment_Recomendation treatment = pm.getObjectById(Treatment_Recomendation.class, keytreatment);
		req.setAttribute("treatment", treatment);
		}
		
		req.setAttribute("workplan", null);
		if((String)misesion.getAttribute("queryWorkplan")!=null){
		Key keyworkplan=KeyFactory.stringToKey((String)misesion.getAttribute("queryWorkplan"));
		Workplan workplan = pm.getObjectById(Workplan.class, keyworkplan);
		req.setAttribute("workplan", workplan);
		}
		**/
		pm.close();
		RequestDispatcher dispatcher =req.getRequestDispatcher("queryHistory.jsp");
		dispatcher.forward(req, resp);
	}
}
