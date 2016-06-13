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

import modelClinicaDental.PhysicalExploration;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewPhysicalExploration extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		ArrayList <String> physical=(ArrayList <String>)misesion.getAttribute("physical");
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickPhysicalExploration")==null){
			//==================Altera===========================================
			PhysicalExploration consulta = new PhysicalExploration(
					req.getParameter("vitalSigns_pa"),
					req.getParameter("vitalSigns_pulso"),
					req.getParameter("vitalSigns_temp"),
					req.getParameter("vitalSigns_fc"),
					req.getParameter("vitalSigns_frecResp"),
					req.getParameter("clinica_examination"),
					req.getParameter("odontoestomatologico"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickPhysicalExploration", click);
			physical.add(req.getParameter("vitalSigns_pa"));
			physical.add(req.getParameter("vitalSigns_pulso"));
			physical.add(req.getParameter("vitalSigns_temp"));
			physical.add(req.getParameter("vitalSigns_fc"));
			physical.add(req.getParameter("vitalSigns_frecResp"));
			physical.add(req.getParameter("clinica_examination"));
			physical.add(req.getParameter("odontoestomatologico"));
			misesion.setAttribute("physical", physical);
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
				misesion.setAttribute("queryPhysicalExploration",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("viewNuevaConsulta");
		}else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryPhysicalExploration"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					PhysicalExploration back = pm.getObjectById(PhysicalExploration.class,keycurrent );
					
					
					back.setVitalSigns_pa(req.getParameter("vitalSigns_pa"));
					back.setVitalSigns_pulso(req.getParameter("vitalSigns_pulso"));
					back.setVitalSigns_temp(req.getParameter("vitalSigns_temp"));
					back.setVitalSigns_fc(req.getParameter("vitalSigns_fc"));
					back.setVitalSigns_frecResp(req.getParameter("vitalSigns_frecResp"));
					back.setClinica_examination(req.getParameter("clinica_examination"));
					back.setOdontoestomatologico(req.getParameter("odontoestomatologico"));
					
					physical.set(0, req.getParameter("vitalSigns_pa"));
					physical.set(1, req.getParameter("vitalSigns_pulso"));
					physical.set(2, req.getParameter("vitalSigns_temp"));
					physical.set(3, req.getParameter("vitalSigns_fc"));
					physical.set(4, req.getParameter("vitalSigns_frecResp"));
					physical.set(5, req.getParameter("clinica_examination"));
					physical.set(6, req.getParameter("odontoestomatologico"));
					misesion.setAttribute("physical", physical);
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