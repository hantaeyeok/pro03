/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-28 00:48:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/hty/pro03/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro03/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/hty/pro03/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro03/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/hty/pro03/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro03/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1714616059379L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Footer - 하이트진로</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css\">\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.3.1/js/all.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        #footer { padding: 40px 100px 40px 0; background: #292929; color: #fff; font-size: 12px; text-align: center;}\r\n");
      out.write("        .dropdown.is-active .dropdown-menu { display: block; }\r\n");
      out.write("        .dropdown.is-up .dropdown-trigger { border-bottom: none; }\r\n");
      out.write("        .dropdown.is-up .dropdown-menu { top: auto; bottom: 100%; margin-bottom: 4px; }\r\n");
      out.write("        .policy, .site_sns, .familysite { padding: 10px 0; margin-top: 20px; background-color: #1f1f1f; }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- 정책 및 SNS 링크 드롭다운 -->\r\n");
      out.write("            <div class=\"dropdown is-up\">\r\n");
      out.write("                <div class=\"dropdown-trigger\">\r\n");
      out.write("                    <button class=\"button\" aria-haspopup=\"true\" aria-controls=\"policy-dropdown-menu\">\r\n");
      out.write("                        <span>정책 및 SNS 링크</span>\r\n");
      out.write("                        <span class=\"icon is-small\">\r\n");
      out.write("                            <i class=\"fas fa-angle-up\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"dropdown-menu\" id=\"policy-dropdown-menu\" role=\"menu\">\r\n");
      out.write("                    <div class=\"dropdown-content\">\r\n");
      out.write("                        <a href=\"/customer/privacy_policy.asp\" class=\"dropdown-item\">개인정보처리방침</a>\r\n");
      out.write("                        <a href=\"/customer/cust_agree.asp\" class=\"dropdown-item\">회원이용약관</a>\r\n");
      out.write("                        <a href=\"/customer/email_protect.asp\" class=\"dropdown-item\">이메일무단수집거부</a>\r\n");
      out.write("                        <a href=\"/esg/partnership.asp\" class=\"dropdown-item\">동반성장</a>\r\n");
      out.write("                        <a href=\"/esg/ethical_mng.asp\" class=\"dropdown-item\">청음고(부정제보)</a>\r\n");
      out.write("                        <a href=\"/company/rule.asp\" class=\"dropdown-item\">공시정보 관리규정</a>\r\n");
      out.write("                        <a href=\"/esg/justice_bsn.asp\" class=\"dropdown-item\">공정거래자율준수</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 하이트진로 SNS 드롭다운 -->\r\n");
      out.write("            <div class=\"dropdown is-up\">\r\n");
      out.write("                <div class=\"dropdown-trigger\">\r\n");
      out.write("                    <button class=\"button\" aria-haspopup=\"true\" aria-controls=\"sns-dropdown-menu\">\r\n");
      out.write("                        <span>하이트진로 SNS</span>\r\n");
      out.write("                        <span class=\"icon is-small\">\r\n");
      out.write("                            <i class=\"fas fa-angle-up\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"dropdown-menu\" id=\"sns-dropdown-menu\" role=\"menu\">\r\n");
      out.write("                    <div class=\"dropdown-content\">\r\n");
      out.write("                        <a href=\"https://www.facebook.com/HITEJINRO.kr\" class=\"dropdown-item\" target=\"_blank\">페이스북</a>\r\n");
      out.write("                        <a href=\"https://twitter.com/Beer2DAY\" class=\"dropdown-item\" target=\"_blank\">트위터</a>\r\n");
      out.write("                        <a href=\"https://www.youtube.com/user/hitevideo\" class=\"dropdown-item\" target=\"_blank\">유튜브</a>\r\n");
      out.write("                        <a href=\"http://www.beer2day.com/\" class=\"dropdown-item\" target=\"_blank\">블로그</a>\r\n");
      out.write("                        <!-- Additional SNS links -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- 패밀리 사이트 드롭다운 -->\r\n");
      out.write("            <div class=\"dropdown is-up\">\r\n");
      out.write("                <div class=\"dropdown-trigger\">\r\n");
      out.write("                    <button class=\"button\" aria-haspopup=\"true\" aria-controls=\"family-dropdown-menu\">\r\n");
      out.write("                        <span>패밀리 사이트</span>\r\n");
      out.write("                        <span class=\"icon is-small\">\r\n");
      out.write("                            <i class=\"fas fa-angle-up\" aria-hidden=\"true\"></i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"dropdown-menu\" id=\"family-dropdown-menu\" role=\"menu\">\r\n");
      out.write("                    <div class=\"dropdown-content\">\r\n");
      out.write("                        <a href=\"http://www.hitejinroholdings.com\" class=\"dropdown-item\" target=\"_blank\">하이트진로 홀딩스</a>\r\n");
      out.write("                        <a href=\"https://hitejinroamerica.com\" class=\"dropdown-item\" target=\"_blank\">진로 아메리카</a>\r\n");
      out.write("                        <a href=\"http://www.hitejinrobeverage.com\" class=\"dropdown-item\" target=\"_blank\">하이트진로음료㈜</a>\r\n");
      out.write("                        <a href=\"http://www.blueheron.co.kr\" class=\"dropdown-item\" target=\"_blank\">블루헤런</a>\r\n");
      out.write("                        <a href=\"http://www.jinro.co.jp\" class=\"dropdown-item\" target=\"_blank\">진로 재팬</a>\r\n");
      out.write("                        <!-- Additional family site links -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"address_tel\">\r\n");
      out.write("            <address class=\"address\">(06075) 서울특별시 강남구 영동대로 714 하이트진로빌딩</address>\r\n");
      out.write("            <p class=\"tel\"><strong>대표전화</strong> 02-3219-0114 / <strong>사업자등록번호</strong> 214-81-00777</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"copyright\">\r\n");
      out.write("            Copyright&copy; 2016 HITEJINRO CO.LTD. ALL RIGHTS RESERVED.\r\n");
      out.write("        </p>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script>\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("            var dropdowns = document.querySelectorAll('.dropdown');\r\n");
      out.write("            dropdowns.forEach(function(dropdown) {\r\n");
      out.write("                dropdown.addEventListener('click', function(event) {\r\n");
      out.write("                    event.stopPropagation();\r\n");
      out.write("                    dropdown.classList.toggle('is-active');\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            window.addEventListener('click', function(e) {\r\n");
      out.write("                if (!e.target.matches('.dropdown-trigger button')) {\r\n");
      out.write("                    dropdowns.forEach(function(dropdown) {\r\n");
      out.write("                        if (dropdown.classList.contains('is-active')) {\r\n");
      out.write("                            dropdown.classList.remove('is-active');\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/include/footer.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("fpath");
      // /WEB-INF/views/include/footer.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/include/footer.jsp(5,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
