package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Treatment_Recomendation;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;

import modelClinicaDental.Odontograma;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewTreatment_Recomendation extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("guardarConsulta");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickTreatment_Recomendation")==null){
			//==================Altera===========================================
			Treatment_Recomendation consulta = new Treatment_Recomendation(
					req.getParameter("treatmentRecomendations"),
					req.getParameter("generic_drug_name"),
					req.getParameter("dose"),
					req.getParameter("way_administration"),
					req.getParameter("care"),
					req.getParameter("hygiene_measures_dietary"),
					req.getParameter("preventive"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickTreatment_Recomendation", click);
			// persist the entity
			try {
				pm.makePersistent(consulta);
			//==============================================================
				//Query q=pm.getObjectById(Query.class, misesion.getAttribute("queryKey"));
				//q.setCurrent_illness(consulta);
				//resp.getWriter().println(q);
				
				
			} finally {
				pm.close();
				resp.getWriter().println("Se guardo exitosamente");
				String queryCurrent=consulta.getKey();
				misesion.setAttribute("queryTreatment_Recomendation",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("nuevoHistorial.jsp");
		}else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryTreatment_Recomendation"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Treatment_Recomendation back = pm.getObjectById(Treatment_Recomendation.class,keycurrent );
					
					
					back.setTreatmentRecomendations(req.getParameter("treatmentRecomendations"));
					back.setGeneric_drug_name(req.getParameter("generic_drug_name"));
					back.setDose(req.getParameter("dose"));
					back.setWay_administration(req.getParameter("way_administration"));
					back.setCare(req.getParameter("care"));
					back.setHygiene_measures_dietary(req.getParameter("hygiene_measures_dietary"));
					back.setPreventive(req.getParameter("preventive"));
				
					System.out.println(back);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("nuevoHistorial.jsp");
			}
			    	
			
		}
			
				
	}
}