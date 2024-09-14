/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.servlets;

import br.uninove.model.Cliente;
import br.uninove.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Renan
 */
@WebServlet(name = "Cadastro", urlPatterns = {"/Cadastro"})
public class Cadastro extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String nomeUsuario = request.getParameter("txtnome");
        String sobrenomeUsuario = request.getParameter("txtsobrenome");
        String data_nasc = request.getParameter("txtdataNascimento");
        String endereco = request.getParameter("txtendereco");
        String bairro = request.getParameter("txtbairro");
        String cep = request.getParameter("txtcep");
        String telefone = request.getParameter("txttelefone");
        String celular = request.getParameter("txtcelular");
        String email = request.getParameter("txtemail");
        String login = request.getParameter("txtlogin");
        String senha = request.getParameter("txtsenha");
        
        //cria um obj user(Usuario) que recebe login e senha digitados no formulario
	Usuario user = new Usuario (login, senha);
        
        //cria um obj cli(Cliente) que recebe as informações do cliente nome, sobrenome...
        //adiciona o cliente(cli) no usuario(user)
        user.cliente = new Cliente(nomeUsuario, sobrenomeUsuario, data_nasc, endereco, bairro, cep, telefone, celular, email);
        
                 
        // inseri um PrintWriter apenas pra testar se o codigo estava correto e salvando
        try (PrintWriter out = response.getWriter()) {
           
            out.println("<br> Login:" + user.getLogin());
            out.println("<br> senha:" + user.getSenha());
            out.println("<br> Nome:" + user.cliente.getNomeUsuario());
            out.println("<br> Sobrenome:" + user.cliente.getSobrenomeUsuario());
            out.println("<br> Data de Nascimento:" + user.cliente.getData_nasc());
            out.println("<br> Endereço:" + user.cliente.getEndereco());
            out.println("<br> Bairro:" + user.cliente.getBairro());
            out.println("<br> CEP:" + user.cliente.getCep());
            out.println("<br> Telefone:" + user.cliente.getTelefone());
            out.println("<br> Celular:" + user.cliente.getCelular());
            out.println("<br> Email:" + user.cliente.getEmail());
            
            
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
