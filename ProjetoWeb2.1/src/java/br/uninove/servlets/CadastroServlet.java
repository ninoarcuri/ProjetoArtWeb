package br.uninove.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renan
 */
@WebServlet(name = "CadastroServlet", urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nome = request.getParameter("txtnome");
        String sobrenome = request.getParameter("txtsobrenome");
        Date dataNascimento = converterParaDate(request.getParameter("txtdataNascimento"));
        String endereco = request.getParameter("txtendereco");
        String bairro = request.getParameter("txtbairro");
        String cep = request.getParameter("txtcep");
        String telefone = request.getParameter("txttelefone");
        String celular = request.getParameter("txtcelular");
        String email = request.getParameter("txtemail");
        String login = request.getParameter("txtlogin");
        String senha = request.getParameter("txtsenha");
        
    
        
        //---------------------------
        
    
    }
    private Date converterParaDate(String dataComoString){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dataFormatada = null;
        try{
            dataFormatada = sdf.parse(dataComoString);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return dataFormatada;
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
