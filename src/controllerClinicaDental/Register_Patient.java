package controllerClinicaDental;
import modelClinicaDental.Patient;
import modelClinicaDental.PMF;
import javax.jdo.PersistenceManager;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Register_Patient extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		HttpSession misesion= request.getSession();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Patient paciente = new Patient(
				request.getParameter("name"),
				new Integer(request.getParameter("number_historia_clinica")).intValue(),
				request.getParameter("number_dni"),
				new Integer(request.getParameter("date_time_care")).intValue(),
				new Integer(request.getParameter("opening_date_medical_history")).intValue(),
				request.getParameter("sex"),
				new Integer(request.getParameter("age")).intValue(),
				request.getParameter("birthplace"),
				new Integer(request.getParameter("birthdate")).intValue(),
				request.getParameter("degree_instruction"),
				request.getParameter("race"),
				request.getParameter("occupation"),
				request.getParameter("religion"),
				request.getParameter("cvil_status"),
				request.getParameter("place_origin"),
				request.getParameter("current_address"),
				request.getParameter("name_lastName_companion")
				);
		
				
		//System.out.println(paciente);
		try {
			pm.makePersistent(paciente);
			//System.out.println(paciente);
		} finally {
			pm.close();
		}
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
		
		misesion.setAttribute("patient", patient);
		
		misesion.setAttribute("patientId",paciente.getKey());
		//resp.sendRedirect("viewPatient?action=patientDisplay&patientId="+a.getId());
		response.sendRedirect("viewPatientNew");
		//System.out.println("aqui");
		//resp.sendRedirect("searh_Dni?dni=deRegistro&accountId="+a.getId());
		//System.out.println(a.getId());
		//System.out.println(a);
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}