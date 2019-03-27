package Controle;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Autorizacao implements Filter{
    public void init(FilterConfig config) throws ServletException {
      }

    public void doFilter(ServletRequest req, ServletResponse res,
                  FilterChain chain) throws IOException, ServletException {
            HttpSession session = ((HttpServletRequest)req).getSession();
            String Usuario = (String) session.getAttribute("usuario");
            if(Usuario == null){
                ((HttpServletResponse)res).sendRedirect("../login.html");

            }
            else{
                chain.doFilter(req, res);  
                
            }
      }

      public void destroy() {
      }
}
