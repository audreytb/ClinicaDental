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
import modelClinicaDental.Forecast;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@SuppressWarnings("serial")
public class NewForecast extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/plain");
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		ArrayList <String> forecast=(ArrayList <String>)misesion.getAttribute("forecast");
		if(req.getParameter("action").equals("salir")){
			resp.sendRedirect("viewPatient");
		}
		
		else if(req.getParameter("action").equals("data")&&misesion.getAttribute("clickForecast")==null){
			Forecast consulta = new Forecast(
					req.getParameter("fore_cast"),
					(String)misesion.getAttribute("queryKey")
					);
			boolean click=true;
			misesion.setAttribute("clickForecast", click);
			forecast.add(req.getParameter("fore_cast"));
			misesion.setAttribute("forecast", forecast);
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
				misesion.setAttribute("queryForecast",queryCurrent);
				
				
			}
			resp.getWriter().println(consulta);

			resp.sendRedirect("viewNuevaConsulta");
		
		}
		else{
			
			
			 try {
					Key keycurrent=KeyFactory.stringToKey((String)misesion.getAttribute("queryForecast"));
					//Key key = KeyFactory.createKey(keycurrent, Current_Illness.class.getSimpleName(), java.util.UUID.randomUUID().toString());
				
					Forecast back = pm.getObjectById(Forecast.class,keycurrent );
					
					
					back.setFore_cast(req.getParameter("fore_cast"));
					forecast.set(0, req.getParameter("fore_cast"));
					misesion.setAttribute("forecast", forecast);
					System.out.println(back);
					
			} finally {
					
			    	pm.close();
			    	resp.sendRedirect("viewNuevaConsulta");
			}
			    	
			
		}
			
				
	}
}