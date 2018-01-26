package demotest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class guru_register
 */
@WebServlet("/Guru_register.java")

public class Guru_register extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() ||
                password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
//            PrintWriter printWriter = response.getWriter();
//            printWriter.print("dfdf");
//            requestDispatcher.include(request, response);
//            requestDispatcher.forward(request, response);

            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);

        } else {
            RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
            req.forward(request, response);
        }

    }
}