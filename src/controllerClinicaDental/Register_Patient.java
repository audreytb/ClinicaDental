package controllerClinicaDental;
import modelClinicaDental.Patient;
import modelClinicaDental.PMF;
import javax.jdo.PersistenceManager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Register_Patient extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Patient a = new Patient(
				req.getParameter("name"),
				
				new Integer(req.getParameter("number_historia_clinica")).intValue(),
				req.getParameter("number_dni"),
				
				new Integer(req.getParameter("date_time_care")).intValue(),
				new Integer(req.getParameter("opening_date_medical_history")).intValue(),
				req.getParameter("sex"),
				new Integer(req.getParameter("age")).intValue(),
				req.getParameter("birthplace"),
				new Integer(req.getParameter("birthdate")).intValue(),
				req.getParameter("degree_instruction"),
				req.getParameter("race"),
				req.getParameter("occupation"),
				req.getParameter("religion"),
				req.getParameter("cvil_status"),
				req.getParameter("place_origin"),
				req.getParameter("current_address"),
				req.getParameter("name_lastName_companion")
				);
		
				
		System.out.println(a);
		try {
			pm.makePersistent(a);
			System.out.println(a);
		} finally {
			pm.close();
		}
		
		resp.sendRedirect("viewPatient?action=patientDisplay&patientId="+a.getId());
		//System.out.println("aqui");
		//resp.sendRedirect("searh_Dni?dni=deRegistro&accountId="+a.getId());
		//System.out.println(a);
		
	}
}