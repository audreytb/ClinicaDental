package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Current_Illness;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
@SuppressWarnings("serial")
public class NewCurrent_Illness extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		HttpSession misesion= req.getSession();
		
		
		
		if(req.getParameter("action").equals("data")){
			Current_Illness consulta = new Current_Illness(
					req.getParameter("data_reporting"),
					req.getParameter("reason_consultation"),
					req.getParameter("sick_time"),
					req.getParameter("signs_symptoms_main"),
					req.getParameter("chronological_story"),
					req.getParameter("biological_functions"),
					(String)misesion.getAttribute("queryKey")
					);
			
			// persist the entity
			try {
				pm.makePersistent(consulta);
				
				//Query q=pm.getObjectById(Query.class, misesion.getAttribute("queryKey"));
				//q.setCurrent_illness(consulta);
				//resp.getWriter().println(q);
				
			} finally {
				pm.close();
				resp.getWriter().println("Se guardo exitosamente");
				
				
			}
			resp.getWriter().println(consulta);
			
			
			
			
			//resp.sendRedirect("telesales?action=accountDisplay&accountId="+req.getParameter("accountId"));
		
		}
	}
}
