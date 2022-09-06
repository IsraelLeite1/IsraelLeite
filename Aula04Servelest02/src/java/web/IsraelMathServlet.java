/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "IsraelMathServlet", urlPatterns = {"/operacaoaritmetica.html"})
public class IsraelMathServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IsraelMathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Tarefa IsraelMathServlet at " + request.getContextPath() + "</h1>");
                        
            double n1 = 1;
            double n2 = 1;
            String operador = "";
            
            try{
                n1 = Double.parseDouble(request.getParameter("n1"));
                n2 = Double.parseDouble(request.getParameter("n2"));
                operador = request.getParameter("operador");
            }catch(NumberFormatException ex){
                out.println("<h2>Ocorreu um erro: "+ex.getLocalizedMessage()+"</h2>");
            }
            out.println("<h2>Operção Aritmética</h2>");
            out.println("<form action=\"operacaoaritmetica.html\">\n" +
"            <input type=\"number\" step=\"0.1\" name=\"n2\" value=\""+n1+"\"/>\n" +
"            \n" +
"            <select name=\"operador\">\n" +
"                <option value=\"soma\"> + </option>\n" +
"                <option value=\"subtracao\"> - </option>\n" +
"                <option value=\"divisao\"> / </option>\n" +
"                <option value=\"multiplicacao\"> * </option>\n" +
"                \n" +
"            </select>\n" +
"            <input type=\"number\" step=\"0.1\" name=\"n2\" value=\""+n2+"\"/>\n" +
"            \n" +
"            \n" +
"            <input type=\"submit\" value=\"=\"/>\n" +
"            \n" +
"        </form>");

            out.println(operador);
            if(operador.equals("soma")){
                 out.println("<h2>"+n1+" + " +n2+" = " +(n1+n2)+"</h2>");
                }
                else if(operador.equals("subtracao")){
                 out.println("<h2>"+n1+" - " +n2+" = " +(n1-n2)+"</h2>");
                }
                  else if(operador.equals("divisao")){
                 out.println("<h2>"+n1+" / " +n2+" = " +(n1/n2)+"</h2>");
                }      
                  else if(operador.equals("miltiplicacao")){
                 out.println("<h2>"+n1+" * " +n2+" = " +(n1*n2)+"</h2>");
                }
            out.println("");
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
