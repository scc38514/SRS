/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-06-30 17:53:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class haha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("\t\t<!-- End of Meta -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Page title -->\n");
      out.write("\t\t<title>选课系统</title>\n");
      out.write("\t\t<!-- End of Page title -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Libraries -->\n");
      out.write("\t\t<link type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/layout.css\" rel=\"stylesheet\" />\t\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.3.2.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/easyTooltip.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery-ui-1.7.2.custom.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.wysiwyg.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/hoverIntent.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/superfish.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/custom.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tvar str=location.href;\n");
      out.write("\t\t\tvar cc = str.substr(str.indexOf(\"?\")+1);\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t$(\"#show\").empty();\n");
      out.write("\t\t\tvar html = '<h1>欢迎您，' + cc + '</h1>'\n");
      out.write("\t\t\t$(\"#show\").append(html);\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t\t$.ajax({\n");
      out.write("\t\t\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/planOfStudyAction_findAllPlan',\n");
      out.write("\t\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\tdata : {ssn:cc},\n");
      out.write("\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t$(\"#planCourse\").empty();\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < data.length; i++) {\n");
      out.write("\t\t\t\t\t\t\tvar c = data[i];\n");
      out.write("\t\t\t\t\t\t\tvar html = '<tr><td>'\n");
      out.write("\t\t\t\t\t\t\t\t+ c.courseNo\n");
      out.write("\t\t\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t\t\t+ c.courseName\n");
      out.write("\t\t\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t\t\t+ c.credits\n");
      out.write("\t\t\t\t\t\t\t\t+ '</td></tr>';\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#planCourse\").append(html);\n");
      out.write("\t\t\t\t\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t//查询所有已选课程\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sectionAction_getBySsn',\n");
      out.write("\t\t\ttype : 'POST',\n");
      out.write("\t\t\tdataType : 'json',\n");
      out.write("\t\t\tdata : {ssn:cc},\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t$(\"#hasSection\").empty();\n");
      out.write("\t\t\t\tfor (var i = 0; i < data.length; i++) {\n");
      out.write("\t\t\t\t\tvar s = data[i];\n");
      out.write("\t\t\t\t\tvar se =\"'\" + s.sectionNo + \"'\";\n");
      out.write("\t\t\t\t\tvar html = '<tr><td>'\n");
      out.write("\t\t\t\t\t\t+ s.sectionNo\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.dayOfWeek\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.timeOfDay\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.room\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.professor\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.course\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.grade\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"addTranscript('+ se +')\">退选</a></td></tr>';\n");
      out.write("\t\t\t\t\t\t$(\"#hasSection\").append(html);\n");
      out.write("\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t})\n");
      out.write("\t\t\t//查询所有可选课程\n");
      out.write("\t\t\t$(function() {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sectionAction_findAllSection',\n");
      out.write("\t\t\ttype : 'POST',\n");
      out.write("\t\t\tdataType : 'json',\n");
      out.write("\t\t\tdata : {},\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t$(\"#allSection\").empty();\n");
      out.write("\t\t\t\tfor (var i = 0; i < data.length; i++) {\n");
      out.write("\t\t\t\t\tvar s = data[i];\n");
      out.write("\t\t\t\t\tvar se =\"'\" + s.sectionNo + \"'\";\n");
      out.write("\t\t\t\t\tvar html = '<tr><td>'\n");
      out.write("\t\t\t\t\t\t+ s.sectionNo\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.dayOfWeek\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.timeOfDay\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.room\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.seatingCapacity\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.professor\n");
      out.write("\t\t\t\t\t\t+ '</td><td>'\n");
      out.write("\t\t\t\t\t\t+ s.course\n");
      out.write("\t\t\t\t\t\t+ '</td><td><a href=\"javascript:void(0);\"  onclick=\"addTranscript('+ se +')\">选课</a></td></tr>';\n");
      out.write("\t\t\t\t\t\t$(\"#allSection\").append(html);\n");
      out.write("\t\t\t\t\t}\t\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t})\n");
      out.write("\t\t\tfunction addTranscript(val){\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/sectionAction_addTranscript',\n");
      out.write("\t\t\ttype:'POST',\n");
      out.write("\t\t\tdataType : 'json',\n");
      out.write("\t\t\tdata:{ssn:cc,sectionNo:val},\n");
      out.write("\t\t\tsuccess:function(data){\n");
      out.write("\t\t\t\tif(data.status==\"ok\"){\n");
      out.write("\t\t\t\t\talert(\"添加成功！\");\n");
      out.write("\t\t\t\t\twindow.location.reload();\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<!-- End of Libraries -->\t\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<!-- Container -->\n");
      out.write("\t\t<div id=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<!-- Header -->\n");
      out.write("\t\t\t<div id=\"header\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!-- Top -->\n");
      out.write("\t\t\t\t<div id=\"top\">\n");
      out.write("\t\t\t\t\t<!-- Logo -->\n");
      out.write("\t\t\t\t\t<div class=\"logo\"> \n");
      out.write("\t\t\t\t\t\t<a href=\"#\" title=\"Administration Home\" class=\"tooltip\"><img src=\"assets/logo.png\" alt=\"Wide Admin\" /></a> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- End of Logo -->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<!-- Meta information -->\n");
      out.write("\t\t\t\t\t<div class=\"meta\">\n");
      out.write("\t\t\t\t\t\t<p>欢迎来到我的选课系统！</p>\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"End administrator session\" class=\"tooltip\"><span class=\"ui-icon ui-icon-power\"></span>Logout</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"Change current settings\" class=\"tooltip\"><span class=\"ui-icon ui-icon-wrench\"></span>Settings</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" title=\"Go to your account\" class=\"tooltip\"><span class=\"ui-icon ui-icon-person\"></span>My account</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- End of Meta information -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- End of Top-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- End of Header -->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!-- Background wrapper -->\n");
      out.write("\t\t\t<div id=\"bgwrap\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<!-- Main Content -->\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div id=\"show\"></div>\n");
      out.write("\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t<h1>PlanOfStudy</h1>\n");
      out.write("\t\t\t\t\t<table class=\"fullwidth\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>courseNo</td>\n");
      out.write("\t\t\t\t\t\t\t<td>courseName</td>\n");
      out.write("\t\t\t\t\t\t\t<td>credits</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody id=\"planCourse\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<h1>已选课程</h1>\n");
      out.write("\t\t\t\t<table class=\"fullwidth\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>sectionNo</td>\n");
      out.write("\t\t\t\t\t\t\t<td>dayOfWeek</td>\n");
      out.write("\t\t\t\t\t\t\t<td>timeOfDay</td>\n");
      out.write("\t\t\t\t\t\t\t<td>room</td>\n");
      out.write("\t\t\t\t\t\t\t<td>professor</td>\n");
      out.write("\t\t\t\t\t\t\t<td>course</td>\n");
      out.write("\t\t\t\t\t\t\t<td>grade</td>\n");
      out.write("\t\t\t\t\t\t\t<td>select</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody id=\"hasSection\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<h1>All Section</h1>\n");
      out.write("\t\t\t\t<table class=\"fullwidth\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td>sectionNo</td>\n");
      out.write("\t\t\t\t\t\t\t<td>dayOfWeek</td>\n");
      out.write("\t\t\t\t\t\t\t<td>timeOfDay</td>\n");
      out.write("\t\t\t\t\t\t\t<td>room</td>\n");
      out.write("\t\t\t\t\t\t\t<td>seatingCapacity</td>\n");
      out.write("\t\t\t\t\t\t\t<td>professor</td>\n");
      out.write("\t\t\t\t\t\t\t<td>course</td>\n");
      out.write("\t\t\t\t\t\t\t<td>select</td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody id=\"allSection\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div><br/><br/><br/>\n");
      out.write("\t\t<!-- End of Container -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<div id=\"footer\">\n");
      out.write("\t\t\t<p class=\"mid\">\n");
      out.write("\t\t\t\t<a href=\"#\" title=\"Top\" class=\"tooltip\">Top</a>&middot;<a href=\"index\" title=\"Main Page\" class=\"tooltip\">Home</a>&middot;<a href=\"index\" title=\"End administrator session\" class=\"tooltip\">Logout</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p class=\"mid\">\n");
      out.write("\t\t\t\t<!-- Change this to your own once purchased -->\n");
      out.write("\t\t\t\t&copy;scc38514.\n");
      out.write("\t\t\t\t<!-- -->\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End of Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
