/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ducha
 */

@WebServlet(name = "FirstSevrlet",urlPatterns = ("/first"))

public class FirstSevrlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int x1 = Integer.parseInt(req.getParameter("x1"));
        int x2 = Integer.parseInt(req.getParameter("x2"));
        resp.setContentType("text/html;charset=\"UTF-8");
        try(PrintWriter out = resp.getWriter() ){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<body>");
            out.println("x1 = " + x1 + "</br>");
            out.println("x2 = " + x2 + "</br>");
            out.println("Tong = " + (x1+x2));
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
