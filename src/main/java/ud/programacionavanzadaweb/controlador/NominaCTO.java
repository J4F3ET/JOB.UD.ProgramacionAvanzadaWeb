package ud.programacionavanzadaweb.controlador;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ud.programacionavanzadaweb.modelo.Nomina;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nominaCTO", value = "/nomina-cto")
public class NominaCTO extends HttpServlet {
    private Nomina nomina;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> pepe</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + this.nomina.getNombre() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

}
