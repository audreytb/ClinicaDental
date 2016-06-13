package controllerClinicaDental;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.List;

import modelClinicaDental.Current_Illness;
import modelClinicaDental.Query;
import javax.jdo.PersistenceManager;
import modelClinicaDental.PMF;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class GuardarConsulta extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		HttpSession misesion= req.getSession();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		System.out.println((String)misesion.getAttribute("queryKey"));
		Key keyquery = KeyFactory.stringToKey((String)misesion.getAttribute("queryKey"));
		
		
		Query q = pm.getObjectById(Query.class, keyquery);
		
		String query = "select from " +
				Current_Illness.class.getName() + " where current_illnesId =="
				+q.getKey();
		List<Current_Illness> illnes = (List<Current_Illness>)pm.newQuery(query).execute();
		
		
		Current_Illness ci=(Current_Illness)illnes.get(0);
		//q.setCurrent_illness(ci);
		System.out.println(illnes);
		System.out.println(q);
		System.out.println(q.getKey());
		pm.deletePersistentAll(illnes);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}
