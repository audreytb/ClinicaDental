package controllerClinicaDental;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import modelClinicaDental.Querys;


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
			ArrayList <String> background=new ArrayList<String>();
			ArrayList <String> current=new ArrayList<String>();
			ArrayList <String> diagnosis=new ArrayList<String>();
			ArrayList <String> forecast=new ArrayList<String>();
			ArrayList <String> odontograma=new ArrayList<String>();
			ArrayList <String> discharge=new ArrayList<String>();
			ArrayList <String> physical=new ArrayList<String>();
			ArrayList <String> treatment=new ArrayList<String>();
			ArrayList <String> workplan=new ArrayList<String>();
			
			
			ArrayList <String> patient=new ArrayList<String>();
			ArrayList <String> consultas=new ArrayList<String>();
			misesion.setAttribute("patient", patient);
			misesion.setAttribute("consultas", consultas);
			
			String dni="";
			misesion.setAttribute("dni", dni);
			
			
			misesion.setAttribute("background", background);
			misesion.setAttribute("current", current);
			misesion.setAttribute("diagnosis", diagnosis);
			misesion.setAttribute("forecast", forecast);
			misesion.setAttribute("odontograma", odontograma);
			misesion.setAttribute("discharge", discharge);
			misesion.setAttribute("physical", physical);
			misesion.setAttribute("treatment", treatment);
			misesion.setAttribute("workplan", workplan);
			
			
			resp.sendRedirect("consultaPaciente.jsp");
		}
		else
			resp.sendRedirect("loginAdmin.jsp");
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse
			response)
					throws ServletException, IOException {
		doGet(request, response);
	}
}
