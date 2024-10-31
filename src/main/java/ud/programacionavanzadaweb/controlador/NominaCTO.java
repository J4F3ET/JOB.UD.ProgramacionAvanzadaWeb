package ud.programacionavanzadaweb.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ud.programacionavanzadaweb.modelo.Nomina;

import java.io.IOException;
import java.io.PrintWriter;
@MultipartConfig
@WebServlet(name = "nominaCTO", value = "/nomina-cto")
public class NominaCTO extends HttpServlet {
    private Nomina nomina;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Nomina");
        response.setContentType("text/html");
        // Hello
        Nomina nomina = new Nomina();
        nomina.setNombre(request.getParameter("nombre"));
        nomina.setId(request.getParameter("identificacion"));
        nomina.setSalarioBasico(Double.parseDouble(request.getParameter("salario")));
        nomina.setDias(Integer.parseInt(request.getParameter("dias")));
        try(PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>" + nomina.getNombre() + "</h1>");
            out.println("</body></html>");
        }
    }

}
