package controllerClinicaDental;
import java.io.IOException;

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
@SuppressWarnings("serial")
public class NuevaConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		Query query=new Query();
		HttpSession misesion= req.getSession();
		
		
		resp.setContentType("text/plain");
		
	
		try {
			pm.makePersistent(query);
			
		} finally {
			pm.close();
			String queryKey=query.getKey();
			misesion.setAttribute("queryKey",queryKey);
			System.out.println(misesion.getAttribute("queryKey") + "imprimiendo la consulta");
			System.out.println(query.getKey());
			System.out.println(queryKey);
			System.out.println(query);
			
			
		}
		
		resp.sendRedirect("nuevoHistorial.jsp");
	}
}
