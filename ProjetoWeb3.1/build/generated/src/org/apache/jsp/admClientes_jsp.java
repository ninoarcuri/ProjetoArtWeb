package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import br.uninove.dao.UsuarioDAO;
import java.util.Map;
import br.uninove.model.Usuario;
import br.uninove.model.Cliente;

public final class admClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    UsuarioDAO uDAO = new UsuarioDAO();
    ArrayList<Usuario> usuarios = uDAO.getTodosUsuarios();


      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "cabeçalho2.jsp", out, false);
      out.write("\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>ArtWeb Pedidos</title>\n");
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
      out.write("                    <li><a href=\"admHome.jsp\">Área do Administrador</a></li>\n");
      out.write("                    <li><a href=\"admPedidos.jsp\">Pedidos</a></li>\n");
      out.write("                    <li><a href=\"admClientes.jsp\">Clientes</a></li>\n");
      out.write("                    <li style=\"float:right\"><a class=\"active\" href=\"index.jsp\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2> Nossos Clientes:</h2>\n");
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
      out.write("                                <th class=\"column2\"></th>\n");
      out.write("                                <th class=\"column2\"></th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                        ");
 for (Usuario u : usuarios) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getIdUser());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getNomeUsuario());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getSobrenomeUsuario());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getData_nasc());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getEndereco());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getBairro());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getCep());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getTelefone());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getCelular());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getCliente().getEmail());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getLogin());
      out.write("</td>\n");
      out.write("                            <td class=\"column1\">");
      out.print(u.getSenha());
      out.write("</td>\n");
      out.write("\n");
      out.write("                            <td class=\"column2\">Editar</td>\n");
      out.write("                            <td class=\"column2\">Excluir</td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("\n");
      out.write("            gtag('config', 'UA-23581568-13');\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <script defer src=\"https://static.cloudflareinsights.com/beacon.min.js\" data-cf-beacon='{\"rayId\":\"65945bee0a6bf667\",\"token\":\"cd0b4b3a733644fc843ef0b185f98241\",\"version\":\"2021.5.2\",\"si\":10}'></script>\n");
      out.write("    </body>\n");
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
