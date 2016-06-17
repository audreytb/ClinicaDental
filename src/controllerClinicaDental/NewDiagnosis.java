package controllerClinicaDental;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Current_Illness;
import modelClinicaDental.Diagnosis;
import modelClinicaDental.Querys;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewDiagnosis extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		ArrayList <String> diagnosis=(ArrayList <String>)misesion.getAttribute("diagnosis");
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickBackground")==null){
			Diagnosis consulta = new Diagnosis(
					req.getParameter("presumptive_diagnosis"),
					req.getParameter("definitive_diagnosis"),
		
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickBackground", click);
			diagnosis.add(req.getParameter("presumptive_diagnosis"));
			diagnosis.add(req.getParameter("definitive_diagnosis"));
			misesion.setAttribute("diagnosis", diagnosis);
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
				misesion.setAttribute("queryDiagnosis",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("viewNuevaConsulta");
		
		}
		else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryDiagnosis"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Diagnosis illnes = pm.getObjectById(Diagnosis.class,keycurrent );
					
			
					illnes.setPresumptive_diagnosis(req.getParameter("presumptive_diagnosis"));
					illnes.setDefinitive_diagnosis(req.getParameter("definitive_diagnosis"));
					
					diagnosis.set(0, req.getParameter("presumptive_diagnosis"));
					diagnosis.set(1, req.getParameter("definitive_diagnosis"));
					misesion.setAttribute("diagnosis", diagnosis);
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


