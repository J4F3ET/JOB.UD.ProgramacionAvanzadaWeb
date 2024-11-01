package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Nomina;

import java.io.IOException;
import java.util.HashMap;
@MultipartConfig
@WebServlet(name = "nominaCTO", value = "/nomina-cto")
public class NominaCTO extends HttpServlet {
    private final HashMap<String, Nomina> nominaHashMap = new HashMap<>();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        System.out.println("get");
        request.setAttribute("nominaMap", nominaHashMap);
        request.getRequestDispatcher("/nomina-cto.jsp").include(request, response);
    }
    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("delete");
        nominaHashMap.clear();
        request.getRequestDispatcher("/nomina-cto.jsp").include(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("post");
        Nomina nomina = new Nomina();
        nomina.setNombre(request.getParameter("nombre"));
        nomina.setId(request.getParameter("identificacion"));
        nomina.setDias(Integer.parseInt(request.getParameter("dias")));
        double salario;
        switch (Integer.parseInt(request.getParameter("salario"))) {
            case 0:salario = 1300000.0;
                break;
            case 1:salario = 1500000.0;
                break;
            case 2:salario = 2000000.0;
                break;
            case 3:salario = 2500000.0;
                break;
            case 4:salario = 3000000.0;
                break;
            default:salario = 0.0;
                break;
        }
        nomina.setSalarioBasico(salario);

        nominaHashMap.put(nomina.getNombre(), nomina);
        response.sendRedirect(getServletContext().getContextPath()+"/nomina-cto");
    }

}
