package controllerClinicaDental;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import modelClinicaDental.PMF;
import modelClinicaDental.Patient;
import java.util.List;
@SuppressWarnings("serial")
public class Search_Dni extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		int dni=Integer.parseInt(req.getParameter("dni"));
		System.out.println(dni);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String query = "select from " + Patient.class.getName() + " where getNumber_dni() == '"+dni+"'";
		List<Patient> pacientes = (List<Patient>)pm.newQuery(query).execute();
		
		System.out.println(query);
		
	}
}
