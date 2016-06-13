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
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
@SuppressWarnings("serial")
public class NuevaConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		Query query=new Query((String)misesion.getAttribute("patientId"));
							
		try {
			pm.makePersistent(query);
			
		} finally {
			pm.close();
			
			String queryKey=query.getKey();
			misesion.setAttribute("queryKey",queryKey);
			
			
			//System.out.println(query.getQueryId());
					
		} 
		
		resp.sendRedirect("nuevoHistorial.jsp");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}

		//tad diccionario--arboles
		//compresion de datos--
		//ordenacinamiento quic heap merson insersort