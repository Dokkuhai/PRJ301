/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ducha
 */
public class SecondServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name1 = req.getParameter("name");
        int birth = Integer.parseInt(req.getParameter("yearOfBirth"));
        resp.setContentType("text/html;charset=\"UTF-8");
        try(PrintWriter out = resp.getWriter() ){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<body>");
            out.println("Hello " + name1 + "!</br>");
            out.println("Ban " + (2024-birth) + " tuoi </br>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }
   
    
    
}
