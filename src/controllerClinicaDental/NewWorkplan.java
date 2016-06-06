package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Workplan;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;

import modelClinicaDental.Odontograma;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewWorkplan extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("guardarConsulta");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickWorkplan")==null){
			Workplan consulta = new Workplan(
					req.getParameter("work_plan"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickWorkplan", click);
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
				misesion.setAttribute("queryWorkplan",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("nuevoHistorial.jsp");
		}else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryWorkplan"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Workplan back = pm.getObjectById(Workplan.class,keycurrent );
					
					
					back.setWork_plan(req.getParameter("work_plan"));
				
					System.out.println(back);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("nuevoHistorial.jsp");
			}
			    	
			
		}
			
				
	}
}