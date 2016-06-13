package controllerClinicaDental;
import java.io.IOException;
import java.util.ArrayList;

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
		ArrayList <String> treatment=(ArrayList <String>)misesion.getAttribute("treatment");
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
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
			
			treatment.add(req.getParameter("treatmentRecomendations"));
			treatment.add(req.getParameter("generic_drug_name"));
			treatment.add(req.getParameter("dose"));
			treatment.add(req.getParameter("way_administration"));
			treatment.add(req.getParameter("care"));
			treatment.add(req.getParameter("hygiene_measures_dietary"));
			treatment.add(req.getParameter("preventive"));
			
			misesion.setAttribute("treatment", treatment);
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

			resp.sendRedirect("viewPatient");
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
					
					treatment.set(0, req.getParameter("treatmentRecomendations"));
					treatment.set(1, req.getParameter("generic_drug_name"));
					treatment.set(2, req.getParameter("dose"));
					treatment.set(3, req.getParameter("way_administration"));
					treatment.set(4, req.getParameter("care"));
					treatment.set(5, req.getParameter("hygiene_measures_dietary"));
					treatment.set(6, req.getParameter("preventive"));
					
					misesion.setAttribute("treatment", treatment);
					System.out.println(back);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("viewPatient");
			}
			    	
			
		}
			
				
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}