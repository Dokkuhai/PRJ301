/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ducha
 */
public class LoginServlet1 extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet1</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet1 at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title>");  
            out.println("</head>");
            out.println("<body>");
            String error = request.getParameter("error");
            if(error!=null && error.equals("1")){
                out.println("<p style=\"color: red\">Username hoặc password không hợp lệ!</p>");
            }
            out.println("<form name=\"f1\" method=\"post\" action=\"login1\" >");
            out.println("Username <input type=\"text\" name=\"user\"/> </br>");
            out.println("Password <input type=\"password\" name=\"pass\"/> </br>");
            out.println("<input type=\"Submit\" value =\"Login\"/> </br>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>login</title>");
            out.println("</head>");
            out.println("<body>");
            
            String userContext=req.getServletContext().getInitParameter("user");
            String passContext=req.getServletContext().getInitParameter("pass");
            
            if(user!=null && pass!=null && user.equalsIgnoreCase("Lan") && pass.equals("123")){
                out.println("Hello "+user);
            }
            else{
                resp.sendRedirect("login1?error=1");
                }
            out.println("</body>");
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
