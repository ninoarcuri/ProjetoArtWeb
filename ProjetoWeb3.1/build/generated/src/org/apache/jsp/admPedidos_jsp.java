package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admPedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabeçalho2.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ArtWeb Pedidos</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link href=\"Css/estilomenu.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu2\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"admHome.jsp\">Área do Administrador</a></li>\n");
      out.write("                <li><a href=\"admPedidos.jsp\">Pedidos</a></li>\n");
      out.write("                <li><a href=\"admClientes.jsp\">Clientes</a></li>\n");
      out.write("                <li style=\"float:right\"><a class=\"active\" href=\"index.jsp\">Sair</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2> Pedidos:</h2>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!--  ------------------------------>\n");
      out.write("        Realizados/Pendentes\n");
      out.write("        <table border=\"1\" style=\"width: 70%\">\n");
      out.write("            <thead>\n");
      out.write("                <tr style=\"background-color: black;color:white\">\n");
      out.write("                    <th>ID do Cliente:</th>   \n");
      out.write("                    <th>Nome do Cliente:</th> \n");
      out.write("                    <th>Sobrenome do Cliente:</th>\n");
      out.write("                    <th>Nome do Serviço:</th> \n");
      out.write("                    <th>ID do Serviço:</th>\n");
      out.write("                    <th>Data do Pedido:</th> \n");
      out.write("                    <th>OBS:</th> \n");
      out.write("                    <th>Telefone:</th> \n");
      out.write("                    <th>Celular:</th> \n");
      out.write("                    <th>Stats:</th> \n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>Renan</td>\n");
      out.write("                    <td>Rosela Batista</td>\n");
      out.write("                    <td>Logotipo</td>\n");
      out.write("                    <th>3</th>\n");
      out.write("                    <td>23/05/2021</td>\n");
      out.write("                    <td>Gostaria de um logotipo empresarial para minha empresa de Contabilidade</td>\n");
      out.write("                    <th>(13)5256-9474:</th>\n");
      out.write("                    <th>(13)98854-9573:</th>\n");
      out.write("                    <th>Pendente</th> <th>Alterar</th>\n");
      out.write("\n");
      out.write("                </tr>    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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
