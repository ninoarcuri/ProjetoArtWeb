package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clienteHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabeçalho2.jsp", out, false);
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ArtWeb Área do Cliente</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link href=\"Css/estilomenu.css\" rel=\"stylesheet\">\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("        <link href=\"Css/estilotable.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"menu2\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"clienteHome.jsp\">Meus dados</a></li>\n");
      out.write("                <li><a href=\"meusServicos.jsp\">Meus Serviços</a></li>\n");
      out.write("                <li><a href=\"contratarServicos.jsp\">Contratar Serviços</a></li>\n");
      out.write("                <li style=\"float:right\"><a class=\"active\" href=\"index.jsp\">Sair</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"DadosCliente\" method=\"post\">\n");
      out.write("            <h3> Meus Dados</h3>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <!--  ------------------------------>\n");
      out.write("            <div class=\"limiter\">           \n");
      out.write("                <div class=\"table100\">\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"table100-head\">\n");
      out.write("                                <th class=\"column1\">ID</th>\n");
      out.write("                                <th class=\"column1\">Nome</th>\n");
      out.write("                                <th class=\"column1\">Sobrenome</th>\n");
      out.write("                                <th class=\"column1\">Data Nascimento</th>\n");
      out.write("                                <th class=\"column1\">Endereço</th>\n");
      out.write("                                <th class=\"column1\">Bairro</th>\n");
      out.write("                                <th class=\"column1\">CEP</th>\n");
      out.write("                                <th class=\"column1\">Tel</th>\n");
      out.write("                                <th class=\"column1\">Cel</th>\n");
      out.write("                                <th class=\"column1\">E-mail</th>\n");
      out.write("                                <th class=\"column1\">Login</th>\n");
      out.write("                                <th class=\"column1\">Senha</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("                                <td class=\"column1\"><input type=\"text\" name=\"txtmostraSenha\"/></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                window.dataLayer = window.dataLayer || [];\n");
      out.write("                function gtag() {\n");
      out.write("                    dataLayer.push(arguments);\n");
      out.write("                }\n");
      out.write("                gtag('js', new Date());\n");
      out.write("\n");
      out.write("                gtag('config', 'UA-23581568-13');\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <script defer src=\"https://static.cloudflareinsights.com/beacon.min.js\" data-cf-beacon='{\"rayId\":\"65945bee0a6bf667\",\"token\":\"cd0b4b3a733644fc843ef0b185f98241\",\"version\":\"2021.5.2\",\"si\":10}'></script>\n");
      out.write("    </body>");
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
