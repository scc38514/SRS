/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-06-30 17:12:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<!-- Meta -->\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<!-- End of Meta -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Page title -->\n");
      out.write("\t\t<title>选课系统登陆页面</title>\n");
      out.write("\t\t<!-- End of Page title -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t<!-- Libraries -->\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/login.css\">\n");
      out.write("\t\t<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/smoothness/jquery-ui-1.7.2.custom.html\" rel=\"stylesheet\" />\t\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.3.2.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/easyTooltip.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-ui-1.7.2.custom.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\tfunction login(){\n");
      out.write("\t\tvar ssn = $(\"#ssn\").val();\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/userAction_login',\n");
      out.write("\t\t\ttype:'POST',\n");
      out.write("\t\t\tdataType:'json',\n");
      out.write("\t\t\tdata:{ssn:ssn,password:$(\"#password\").val(),type:$(\"select\").val()},\n");
      out.write("\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\n");
      out.write("\t\t\t\t\tif($(\"#select\").val()==\"Student\"){\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student?'+ ssn +'';\n");
      out.write("\t\t\t\t\t}else if($(\"#select\").val()==\"Professor\"){\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/professor?'+ ssn +''\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\twindow.location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin';\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\talert(\"账号或密码错误！或者身份错误！\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}); \n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\t\t<!-- End of Libraries -->\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t<div id=\"container\">\n");
      out.write("\t\t<div class=\"logo\">\n");
      out.write("\t\t\t<a href=\"#\"><img src=\"assets/logo.png\" alt=\"\" /></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<center>\n");
      out.write("\t\t<div id=\"box\">\n");
      out.write("\t\t\t<form action=\"index.html\" method=\"POST\">\n");
      out.write("\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t<label>请输入姓名：</label>\n");
      out.write("\t\t\t\t<input name=\"username\" id=\"ssn\" /> \n");
      out.write("\t\t\t</div> <br/>\n");
      out.write("\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t<label>请输入密码：</label>\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\"/> \t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br/>\n");
      out.write("\t\t\t<div class=\"col-lg-10 mycheckbox checkbox\">\n");
      out.write("                <select id=\"select\">\n");
      out.write("                \t<option>Student</option>\n");
      out.write("                \t<option>Professor</option>\n");
      out.write("                \t<option>admin</option>\n");
      out.write("                </select>\n");
      out.write("                <span>请选择身份</span> <br/><br/>\n");
      out.write("                <button type=\"button\" onclick=\"login()\">Login</button>\n");
      out.write("            </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</center>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
