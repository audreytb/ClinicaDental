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
		ArrayList <String> patient=(ArrayList <String>)misesion.getAttribute("patient");
		patient.add(paciente.getName());
		patient.add(Integer.toString(paciente.getNumber_historia_clinica()));
		patient.add(paciente.getNumber_dni());
		patient.add(Integer.toString(paciente.getDate_time_care()));
		patient.add(Integer.toString(paciente.getOpening_date_medical_history()));
		patient.add(paciente.getSex());
		patient.add(Integer.toString(paciente.getAge()));
		patient.add(paciente.getBirthplace());
		patient.add(Integer.toString(paciente.getBirthdate()));
		patient.add(paciente.getDegree_instruction());
		patient.add(paciente.getRace());
		patient.add(paciente.getOccupation());
		patient.add(paciente.getReligion());
		patient.add(paciente.getCvil_status());
		patient.add(paciente.getPlace_origin());
		patient.add(paciente.getCurrent_address());
		patient.add(paciente.getName_lastName_companion());
	
		
		
		String query = "select from " + Query.class.getName() + " where queryId ==" +patientId;		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		ArrayList <String> consultasId=(ArrayList <String>)misesion.getAttribute("consultas");
		for(int i=0; i<consultas.size();i++){
			consultasId.add(consultas.get(i).getQueryId());
		}
		//String consultaAc=consultas.get(consultas.size()-1).getQueryId();
		
		
		req.setAttribute("patient", patient);
		req.setAttribute("consultas", consultasId);
		
		
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
			
			
			System.out.println(consultas);
			System.out.println(paciente);
			
			System.out.println((ArrayList<String>) misesion.getAttribute("background"));
			System.out.println((ArrayList<String>) misesion.getAttribute("current"));
			System.out.println((ArrayList<String>) misesion.getAttribute("diagnosis"));
			System.out.println((ArrayList<String>) misesion.getAttribute("forecast"));
			System.out.println((ArrayList<String>) misesion.getAttribute("odontograma"));
			System.out.println((ArrayList<String>) misesion.getAttribute("discharge"));
			System.out.println((ArrayList<String>) misesion.getAttribute("forecast"));
		
			System.out.println((ArrayList<String>) misesion.getAttribute("treatment"));
			System.out.println((ArrayList<String>) misesion.getAttribute("workplan"));
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