package controllerClinicaDental;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Current_Illness;
import modelClinicaDental.Querys;
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
		ArrayList <String> current=(ArrayList <String>)misesion.getAttribute("current");
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
			current.add(req.getParameter("enfermedad_actual"));
			current.add(req.getParameter("data_reporting"));
			current.add(req.getParameter("reason_consultation"));
			current.add(req.getParameter("sick_time"));
			current.add(req.getParameter("signs_symptoms_main"));
			current.add(req.getParameter("chronological_story"));
			current.add(req.getParameter("biological_functions"));
			misesion.setAttribute("current", current);
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
					illnes.setEnfermedad_actual(req.getParameter("enfermedad_actual"));
					illnes.setData_reporting(req.getParameter("data_reporting"));
					illnes.setReason_consultation(req.getParameter("reason_consultation"));
					illnes.setSick_time(req.getParameter("sick_time"));
					illnes.setSigns_symptoms_main(req.getParameter("signs_symptoms_main"));
					illnes.setChronological_story(req.getParameter("chronological_story"));
					illnes.setBiological_functions(req.getParameter("biological_functions"));
					//System.out.println(illnes);
					
					
					current.set(0, req.getParameter("enfermedad_actual"));
					current.set(1, req.getParameter("data_reporting"));
					current.set(2, req.getParameter("reason_consultation"));
					current.set(3, req.getParameter("sick_time"));
					current.set(4, req.getParameter("signs_symptoms_main"));
					current.set(5, req.getParameter("chronological_story"));
					current.set(6, req.getParameter("biological_functions"));
					misesion.setAttribute("current", current);
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("viewNuevaConsulta");
			}
			    	
			
		}
			
				
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}
