/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2020-06-11 08:57:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/D:/jsp-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/new-jdbc-12-month-2018/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/jsp-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/new-jdbc-12-month-2018/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1588589456442L));
    _jspx_dependants.put("jar:file:/D:/jsp-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/new-jdbc-12-month-2018/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1584026083179L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1581841056926L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Đăng kí</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- \t\t<h1 class=\"form-heading\">login Form</h1> -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"main-div\">\r\n");
      out.write("\t\t\t<h3>Đăng kí tài khoản</h3>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<form id=\"formSubmit\" >\r\n");
      out.write("\t\t\t\t\t<b>Tên tài khoản</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"text\" placeholder=\"Tên tài khoản\" name=\"userName\" >\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<b>Mật khẩu</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"password\" placeholder=\"Mật khẩu\" name=\"password\" >\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<b>Nhập lại mật khẩu</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"password\" placeholder=\"Nhập lại mật khẩu\" name=\"repeatPassword\" >\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<b>Họ và tên</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"text\" placeholder=\"Họ và tên\" name=\"fullName\" >\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<b>Số điện thoại</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"text\" placeholder=\"Số điện thoại\" name=\"numberPhone\" >\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<b>Địa chỉ email</b>\r\n");
      out.write("    \t\t\t\t<input class=\"form-control\"  type=\"text\" placeholder=\"Địa chỉ email\" name=\"email\" >\r\n");
      out.write("\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<button id=\"btnDangKi\" class=\"btn btn-success btn-lg btn-block\" >Đăng kí</button>\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<br>\r\n");
      out.write("    \t\t\t\t<p>Nếu bạn đã có tài khoản? <a href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\">Đăng nhập</a>.</p>\r\n");
      out.write("\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\"#btnDangKi\").click(function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tvar data = {};\r\n");
      out.write("\t\tvar formData = $('#formSubmit').serializeArray();\r\n");
      out.write("\t\t$.each(formData, function(i, v) {\r\n");
      out.write("\t\t\tdata[\"\" + v.name + \"\"] = v.value;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar format = /[ !@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]/;\r\n");
      out.write("\t\tvar format_fullName = /[1234567890!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]/;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(data.userName == \"\" ||data.password == \"\" ||data.repeatPassword == \"\" ||\r\n");
      out.write("\t\t\t\tdata.fullName == \"\" ||data.numberPhone == \"\" ||data.email == \"\"){\r\n");
      out.write("\t\t\talert(\"Bạn phải điền đầy đủ thông tin\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(format.test(data.userName)){\r\n");
      out.write("\t\t\talert(\"Tên tài khoản không được chứa kí tự đặc biêt\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(format.test(data.password)){\r\n");
      out.write("\t\t\talert(\"Mật khẩu không được chứa kí tự đặc biêt\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(data.password != data.repeatPassword){\r\n");
      out.write("\t\t\talert(\"Nhập lại mật khẩu sai\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(format_fullName.test(data.fullName)){\r\n");
      out.write("\t\t\talert(\"Họ và tên chỉ có chữ và dấu cách\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(isNaN(data.numberPhone)){\r\n");
      out.write("\t\t\talert(\"Số điện thoại chỉ được nhập số\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse if(emailIsValid(data.email) == false){\r\n");
      out.write("\t\t\talert(\"Bạn đã nhập sai email\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tregister(data);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction emailIsValid (email) {\r\n");
      out.write("\t\t  return /^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$/.test(email)\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction register(data) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APIurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\tcontentType : 'application/json',\r\n");
      out.write("\t\t\tdata : JSON.stringify(data),\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\talert(result);\r\n");
      out.write("\t\t\t\twindow.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${RegisterURL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(error) {\r\n");
      out.write("\t\t\t\talert(\"Bạn đã đăng kí thất bại\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /views/register.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("APIurl");
      // /views/register.jsp(4,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/api-register");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /views/register.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setVar("RegisterURL");
      // /views/register.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("dang-ki");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /views/register.jsp(43,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("dang-nhap?action=login");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }
}