/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-03 17:48:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class professorManage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">    \r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<!-- Meta -->\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<!-- End of Meta -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Page title -->\r\n");
      out.write("\t\t<title>老师管理</title>\r\n");
      out.write("\t\t<!-- End of Page title -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Libraries -->\r\n");
      out.write("\t\t<link type=\"text/css\" href=\"css/layout.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/easyTooltip.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-ui-1.7.2.custom.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.wysiwyg.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/hoverIntent.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/superfish.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t//查询所有教师\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : 'personAction_findAllProfessor',\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#allProfessor\").empty();\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\t\tvar p = data[i];\r\n");
      out.write("\t\t\t\t\tvar ps =\"'\" + p.ssn + \"'\";\r\n");
      out.write("\t\t\t\t\tvar html = '<tr><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.ssn\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.name\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.title\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\r\n");
      out.write("\t\t\t\t\t\t+ p.department\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"updateProfessor('+ ps +')\">updateProfessor</a>'\r\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"delectProfessor('+ ps +')\">delect</a></td></tr>';\r\n");
      out.write("\t\t\t\t\t\t$(\"#allProfessor\").append(html);\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\t//添加教师\r\n");
      out.write("\tfunction addProfessor(){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'personAction_addProfessor',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata:{ssn:$(\"#ssn\").val(),name:$(\"#name\").val(),title:$(\"#title\").val(),department:$(\"#department\").val()},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\r\n");
      out.write("\t\t\t\t\talert(\"添加成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t//删除教师\r\n");
      out.write("\tfunction delectProfessor(val){   \r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'personAction_deleteProfessor',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdata:{ssn:val},\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\r\n");
      out.write("\t\t\t\t\talert(\"删除成功！\");\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}) \r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\t\t<!-- End of Libraries -->\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- Container -->\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Top -->\r\n");
      out.write("\t\t\t\t<div id=\"top\">\r\n");
      out.write("\t\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\"> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" title=\"Administration Home\" class=\"tooltip\"><img src=\"assets/logo.png\" alt=\"Wide Admin\" /></a> \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End of Logo -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- Meta information -->\r\n");
      out.write("\t\t\t\t\t<div class=\"meta\">\r\n");
      out.write("\t\t\t\t\t\t<p>欢迎来到我的选课系统！</p>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"End administrator session\" class=\"tooltip\"><span class=\"ui-icon ui-icon-power\"></span>Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"Change current settings\" class=\"tooltip\"><span class=\"ui-icon ui-icon-wrench\"></span>Settings</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"Go to your account\" class=\"tooltip\"><span class=\"ui-icon ui-icon-person\"></span>My account</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- End of Meta information -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- End of Top-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- End of Header -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- Background wrapper -->\r\n");
      out.write("\t\t\t<div id=\"bgwrap\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<!-- Main Content -->\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group col-md-4\">\r\n");
      out.write("\t\t\t\t<h1>Add Section</h1>\r\n");
      out.write("\t\t\t\t<label>ssn:</label> \r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"ssn\" />\r\n");
      out.write("\t\t\t\t<label>name:</label> \r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"name\" /> \r\n");
      out.write("\t\t\t\t<label>title:</label>\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"title\" />\r\n");
      out.write("\t\t\t\t<label>department:</label>\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"department\" />\r\n");
      out.write("\t\t\t\t<button onclick=\"addProfessor()\" class=\"btn btn-default btn-lg btn-block\">add</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h2>All Professor</h2>\r\n");
      out.write("\t\t<table class=\"fullwidth\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>ssn</td>\r\n");
      out.write("\t\t\t\t\t<td>name</td>\r\n");
      out.write("\t\t\t\t\t<td>title</td>\r\n");
      out.write("\t\t\t\t\t<td>department</td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"allProfessor\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div></div><br/><br/><br/>\r\n");
      out.write("\t\t<!-- End of Container -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Footer -->\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<p class=\"mid\">\r\n");
      out.write("\t\t\t\t<a href=\"#\" title=\"Top\" class=\"tooltip\">Top</a>&middot;<a href=\"index\" title=\"Main Page\" class=\"tooltip\">Home</a>&middot;<a href=\"index\" title=\"End administrator session\" class=\"tooltip\">Logout</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p class=\"mid\">\r\n");
      out.write("\t\t\t\t<!-- Change this to your own once purchased -->\r\n");
      out.write("\t\t\t\t&copy;scc38514.\r\n");
      out.write("\t\t\t\t<!-- -->\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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