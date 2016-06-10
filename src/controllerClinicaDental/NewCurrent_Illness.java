package controllerClinicaDental;
import java.io.IOException;
import java.util.List;

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
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewCurrent_Illness extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickCurrent")==null){
			Current_Illness consulta = new Current_Illness(
					req.getParameter("enfermedad_actual"),
					req.getParameter("data_reporting"),
					req.getParameter("reason_consultation"),
					req.getParameter("sick_time"),
					req.getParameter("signs_symptoms_main"),
					req.getParameter("chronological_story"),
					req.getParameter("biological_functions"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickCurrent", click);
			
			// persist the entity
			try {
				pm.makePersistent(consulta);
				
				
				//Query q=pm.getObjectById(Query.class, misesion.getAttribute("queryKey"));
				//q.setCurrent_illness(consulta);
				//resp.getWriter().println(q);
				
			} finally {
				
				pm.close();
				resp.getWriter().println("Se guardo exitosamente");
				String queryCurrent=consulta.getKey();
				misesion.setAttribute("queryCurrent",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("viewNuevaConsulta");
			
		}
		else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryCurrent"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Current_Illness illnes = pm.getObjectById(Current_Illness.class,keycurrent );
					
					/**
					 * req.getParameter("data_reporting"),
					req.getParameter("reason_consultation"),
					req.getParameter("sick_time"),
					req.getParameter("signs_symptoms_main"),
					req.getParameter("chronological_story"),
					req.getParameter("biological_functions"),
					(String)misesion.getAttribute("queryKey")
					 */
					illnes.setData_reporting(req.getParameter("data_reporting"));
					illnes.setReason_consultation(req.getParameter("reason_consultation"));
					illnes.setSick_time(req.getParameter("sick_time"));
					illnes.setSigns_symptoms_main(req.getParameter("signs_symptoms_main"));
					illnes.setChronological_story(req.getParameter("chronological_story"));
					illnes.setBiological_functions(req.getParameter("biological_functions"));
					System.out.println(illnes);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("viewNuevaConsulta");
			}
			    	
			
		}
			
				
	}
}
