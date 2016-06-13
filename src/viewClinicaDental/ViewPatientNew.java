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
public class ViewPatientNew extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		String patientId=(String)misesion.getAttribute("patientId");
		/**
		String dni=(String)misesion.getAttribute("dni");
		String query = "select from " + Patient.class.getName() + " where number_dni == '"+dni+"'";
		List<Patient> pacientes = (List<Patient>)pm.newQuery(query).execute();
		**/
		Patient paciente = pm.getObjectById(Patient.class,KeyFactory.stringToKey((String)misesion.getAttribute("patientId")));
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
		
		System.out.println(patient);
		System.out.println(consultas);
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/queryPatientNew.jsp");
		dispatcher.forward(req, resp);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}