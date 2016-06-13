package controllerClinicaDental;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Background;
import modelClinicaDental.Current_Illness;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewBackground extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		ArrayList <String> background=(ArrayList <String>)misesion.getAttribute("background");
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickBackground")==null){
			Background consulta = new Background(
					req.getParameter("family_background"),
					req.getParameter("personal_history"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickBackground", click);
			background.add(req.getParameter("family_background"));
			background.add(req.getParameter("personal_history"));
			misesion.setAttribute("background", background);
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
				misesion.setAttribute("queryBackground",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("viewNuevaConsulta");
			
		}
		else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryBackground"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Background back = pm.getObjectById(Background.class,keycurrent );
					
					/**
					 * req.getParameter("data_reporting"),
					req.getParameter("reason_consultation"),
					req.getParameter("sick_time"),
					req.getParameter("signs_symptoms_main"),
					req.getParameter("chronological_story"),
					req.getParameter("biological_functions"),
					(String)misesion.getAttribute("queryKey")
					 */
					back.setFamily_background(req.getParameter("family_background"));
					back.setPersonal_history(req.getParameter("personal_history"));
					
					background.set(0, req.getParameter("family_background"));
					background.set(1, req.getParameter("personal_history"));
					misesion.setAttribute("background", background);
					System.out.println(back);
					
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
