/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

public class Autenticacao extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    public Autenticacao() {
        super();
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        doPost(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
        String nome = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        Usuario usuario1 = new Usuario();
            usuario1.setLogin("user");
            usuario1.setSenha("pass");
            
        Usuario user = new Usuario();
        
        List<Usuario> meusUsuarios = new ArrayList();
        meusUsuarios.add(usuario1);
        
        HttpSession sessao = request.getSession();
        
        for(int i = 0; i < meusUsuarios.size(); i++){
        user = meusUsuarios.get(i);
                if(nome.equals(user.getLogin()) && 
                        senha.equals(user.getSenha())){

            
                sessao.setAttribute("usuario", nome);
                i = meusUsuarios.size()+1;
            }
        }
        if(sessao.getAttribute("usuario") == null)
                    response.sendRedirect("login.html");
          
        else
            response.sendRedirect("paginas/home.html");
        
    }
}
