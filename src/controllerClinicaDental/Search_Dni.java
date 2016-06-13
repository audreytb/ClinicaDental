package controllerClinicaDental;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import modelClinicaDental.PMF;
import modelClinicaDental.Patient;
import java.util.List;

@SuppressWarnings("serial")
public class Search_Dni extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession misesion= request.getSession();
		
		String dni=request.getParameter("dni");
		misesion.setAttribute("dni", dni);
		
		System.out.println(dni);
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		String query = "select from " + Patient.class.getName() + " where number_dni == '"+dni+"'";
		
		List<Patient> pacientes = (List<Patient>)pm.newQuery(query).execute();
		if(pacientes.isEmpty()){
			response.sendRedirect("registrar.jsp");
		
		/**
		req.setAttribute("pacientes", pacientes);
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/viewPatient");
		dispatcher.forward(req, resp);
	// pm.deletePersistent(e);
		**/
		
		}else{
		System.out.println(query);
		System.out.println(pacientes);
		
		
		response.sendRedirect("/viewPatient");
		misesion.setAttribute("patientId", pacientes.get(pacientes.size()-1).getKey());
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}
