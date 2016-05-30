package controllerClinicaDental;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/HTML");
		String nombre=req.getParameter("nombre");
		String correo=req.getParameter("clave");
		
		if(nombre.equalsIgnoreCase("flores")&&correo.equalsIgnoreCase("flores")){
			
			HttpSession misesion= req.getSession(true);
			misesion.setAttribute("nombre","Juan Perez");
			misesion.setAttribute("correo","jperez@gmail.com");
			
			resp.sendRedirect("consultaPaciente.jsp");
			}
		else{
			resp.sendRedirect("loginAdmin.jsp");
		}
			
	}
}
