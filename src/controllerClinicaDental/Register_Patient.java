package controllerClinicaDental;
import modelClinicaDental.Patient;
import modelClinicaDental.PMF;
import javax.jdo.PersistenceManager;

import java.io.IOException;

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
		
		Patient a = new Patient(
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
		
				
		System.out.println(a);
		try {
			pm.makePersistent(a);
			System.out.println(a);
		} finally {
			pm.close();
		}
		misesion.setAttribute("patientId",a.getKey());
		//resp.sendRedirect("viewPatient?action=patientDisplay&patientId="+a.getId());
		response.sendRedirect("viewPatientNew");
		//System.out.println("aqui");
		//resp.sendRedirect("searh_Dni?dni=deRegistro&accountId="+a.getId());
		//System.out.println(a.getId());
		//System.out.println(a);
		
	}
}