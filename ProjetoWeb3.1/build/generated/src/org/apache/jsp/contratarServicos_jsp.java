package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.uninove.model.Servico;
import java.util.ArrayList;
import br.uninove.dao.ServicoDAO;
import java.util.Map;
import br.uninove.model.Usuario;

public final class contratarServicos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ServicoDAO aDAO = new ServicoDAO();
    ArrayList<Servico> servicos = aDAO.getTodosServicos();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabeçalho2.jsp", out, false);
      out.write("\n");
      out.write("            <title>ArtWeb Área do Cliente</title>\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <!--===============================================================================================-->\n");
      out.write("            <link href=\"Css/estilomenu.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <div class=\"menu2\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"clienteHome.jsp\">Meus dados</a></li>\n");
      out.write("                    <li><a href=\"meusServicos.jsp\">Meus Serviços</a></li>\n");
      out.write("                    <li><a href=\"contratarServicos.jsp\">Contratar Serviços</a></li>\n");
      out.write("                    <li style=\"float:right\"><a class=\"active\" href=\"index.jsp\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"ServicosCliente\" method=\"post\">\n");
      out.write("                <h3> Selecione os serviços que deseja contratar:</h3>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div class=\"container mt-4\">\n");
      out.write("                    <table class=\"table justify-content-center\">\n");
      out.write("                        <thead class=\"thead-dark\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th scope=\"col\">ID</th>\n");
      out.write("                                <th scope=\"col\">Nome do Serviço</th>\n");
      out.write("                                <th scope=\"col\">Descrição</th>\n");
      out.write("                                <th scope=\"col\">Tipo</th>\n");
      out.write("                                <th scope=\"col\">Valor</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");
 for (Servico a : servicos) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(a.getIdServ());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getNome_servico());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getDescricao());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getTipo());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(a.getValor());
      out.write("</td>\n");
      out.write("                            <td>Contratar</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
