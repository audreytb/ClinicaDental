package viewClinicaDental;
import javax.servlet.http.*;
import  javax.servlet.*;
import java.io.IOException;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import javax.jdo.PersistenceManager;
import modelClinicaDental.*;

import java.util.ArrayList;
import java.util.List;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class ViewPatientNew extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse
			resp) throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		HttpSession misesion= req.getSession();
		String patientId=(String)misesion.getAttribute("patientId");
		/**
		String dni=(String)misesion.getAttribute("dni");
		String query = "select from " + Patient.class.getName() + " where number_dni == '"+dni+"'";
		List<Patient> pacientes = (List<Patient>)pm.newQuery(query).execute();
		**/
		
		/**
		String query = "select from " + Query.class.getName() + " where queryId ==" +patientId;		
		List<Query> consultas = (List<Query>)pm.newQuery(query).execute();
		ArrayList <String> consultasId=(ArrayList <String>)misesion.getAttribute("consultas");
		if(consultasId.size()>0){
			for(int i=0; i<consultas.size();i++){
				consultasId.set(i, consultas.get(i).getKey());
				
			}
		}else{
			for(int i=0; i<consultas.size();i++){
				consultasId.add(consultas.get(i).getKey());
			}
		}
		
		misesion.setAttribute("consultas", consultasId);
		//String consultaAc=consultas.get(consultas.size()-1).getQueryId();
		**/
		
		req.setAttribute("patient", (ArrayList <String>)misesion.getAttribute("patient"));
		//req.setAttribute("consultas", consultasId);
		
		//System.out.println(patient);
		//System.out.println(consultas);
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/queryPatientNew.jsp");
		dispatcher.forward(req, resp);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}