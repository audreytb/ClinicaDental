package controllerClinicaDental;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.*;

import modelClinicaDental.Query;


@SuppressWarnings("serial")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	
		String nombre=req.getParameter("nombre");
		String clave=req.getParameter("clave");
		
		
		if(nombre.equalsIgnoreCase("Dr. Flores")&&clave.equalsIgnoreCase("Dr. Flores")){
			HttpSession misesion= req.getSession(true);
			misesion.setAttribute("nombre","Juan Perez");
			misesion.setAttribute("correo","jperez@gmail.com");
			ArrayList <String> diagnosis=new ArrayList<String>();
			ArrayList <String> forecast=new ArrayList<String>();
			ArrayList <String> odontograma=new ArrayList<String>();
			ArrayList <String> discharge=new ArrayList<String>();
			ArrayList <String> physical=new ArrayList<String>();
			ArrayList <String> treatment=new ArrayList<String>();
			ArrayList <String> workplan=new ArrayList<String>();
			ArrayList <String> background=new ArrayList<String>();
			ArrayList <String> current=new ArrayList<String>();
			
			misesion.setAttribute("background", background);
			misesion.setAttribute("current", current);
			misesion.setAttribute("odontograma", odontograma);
			misesion.setAttribute("physical", physical);
			misesion.setAttribute("treatment", treatment);
			misesion.setAttribute("workplan", workplan);
			misesion.setAttribute("diagonis", diagnosis);
			misesion.setAttribute("discharge", discharge);
			resp.sendRedirect("consultaPaciente.jsp");
		}
		else
			resp.sendRedirect("loginAdmin.jsp");
	
	}
}
