package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelClinicaDental.Forecast;
import modelClinicaDental.Odontograma;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewOdontograma extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("guardarConsulta");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickOdontograma")==null){
			Odontograma consulta = new Odontograma(
					req.getParameter("odontogram"),
		
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickOdontograma", click);
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
				misesion.setAttribute("queryOdontograma",queryCurrent);
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("nuevoHistorial.jsp");
		
		}else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryOdontograma"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Odontograma back = pm.getObjectById(Odontograma.class,keycurrent );
					
					
					back.setOdontogram(req.getParameter("odontogram"));
				
					System.out.println(back);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("nuevoHistorial.jsp");
			}
			    	
			
		}
			
				
	}
}