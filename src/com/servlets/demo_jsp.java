package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by RUSLAN77 on  16.01.2018 in Ukraine
 */
public class demo_jsp extends HttpServlet {
    public void _jspservice(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.write("<html> <body>");
        int demvar = 0;
        out.write("Count is:");
        out.write(demvar++);
        out.write("/<body> /<html>");

    }

}
