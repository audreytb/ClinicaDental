package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelClinicaDental.Current_Illness;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;

@SuppressWarnings("serial")
public class NuevaConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		if(req.getParameter("action").equals("data")){
			Current_Illness consulta = new Current_Illness(
					req.getParameter("data_reporting"),
					req.getParameter("reason_consultation"),
					req.getParameter("sick_time"),
					req.getParameter("signs_symptoms_main"),
					req.getParameter("chronological_story"),
					req.getParameter("biological_functions")
					);
			// persist the entity
			try {
				pm.makePersistent(consulta);
			} finally {
				pm.close();
			}
		
			//resp.sendRedirect("telesales?action=accountDisplay&accountId="+req.getParameter("accountId"));
		
		}
	}
}
