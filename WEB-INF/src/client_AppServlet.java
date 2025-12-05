import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class client_AppServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("username");
        String hobby = req.getParameter("hobby");

        req.setAttribute("username", name);
        req.setAttribute("hobby", hobby);

        RequestDispatcher rd = req.getRequestDispatcher("/output.jsp");
        rd.forward(req, res);
    }
}
