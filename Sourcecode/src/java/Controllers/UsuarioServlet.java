/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Storage.FakeStorage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alisson
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/Usuario"})
public class UsuarioServlet extends HttpServlet {

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
        String c = request.getParameter("c");
        
        RequestDispatcher dispatcher  = null;
        
        if(c.equals("Listar")){
            dispatcher = listar(request, response);
        }else if(c.equals("Cadastrar")){
            dispatcher = cadastrar(request, response);
        }else if(c.equals("Detalhar")){
            dispatcher = detalhar(request, response);
        }else if(c.equals("Inserir")){
            dispatcher = inserir(request, response);
        }else if(c.equals("Remover")){
            dispatcher = remover(request, response);
        }else if(c.equals("Editar")){
            dispatcher = editar(request, response);
        }
        
        if(dispatcher != null)
            dispatcher.forward(request, response);
    }
    
    private RequestDispatcher listar(HttpServletRequest request, HttpServletResponse response){
        return request.getRequestDispatcher("WEB-INF/Usuario/Listar.jsp");
    }
     private RequestDispatcher detalhar(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("Model", getById(Integer.parseInt(request.getParameter("Id"))));
          
        return request.getRequestDispatcher("WEB-INF/Usuario/Detalhar.jsp");
    }
            
    private RequestDispatcher cadastrar(HttpServletRequest request, HttpServletResponse response){
        return request.getRequestDispatcher("WEB-INF/Usuario/Cadastrar.jsp");
    }
    
    private RequestDispatcher inserir(HttpServletRequest request, HttpServletResponse response){
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        FakeStorage.Usuario.List.add(new Models.Usuario(usuario, senha));
        return listar(request, response);
    }
    
    private RequestDispatcher editar(HttpServletRequest request, HttpServletResponse response){
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        Models.Usuario user = getById(Integer.parseInt(request.getParameter("Id")));
        user.setSenha(senha);
        user.setUsuario(usuario);

        return listar(request, response);
    }
    
    
    private RequestDispatcher remover(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("Id"));
        FakeStorage.Usuario.List.remove(getById(id));
        return listar(request, response);
    }
    
    private Models.Usuario getById(int id){
        Models.Usuario user = null;
        for(Models.Usuario u : FakeStorage.Usuario.List){
            if(u.getId() == id){
                user = u;
                break;
            }
        }
        return user;
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
