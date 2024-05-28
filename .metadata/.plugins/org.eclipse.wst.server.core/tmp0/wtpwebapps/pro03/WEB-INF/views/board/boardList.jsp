<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Board List(공지사항)</title>
</head>
<body>
<jsp:include page="../include/header.jsp"></jsp:include>
    <div class="boarddiv">
  
      <section class="page" id="page1">
        <div class="breadcrumb">
            <p><a href="">홈</a><a href="">커뮤니티</a><span>공지사항</span></p>
        </div>
        <hr>
        <h2 class="page_title">공지사항 목록</h2>
        <div class="page_wrap clr-fix" style="padding-bottom: 90px;">
            <table class="tb1">
                <thead>
                    <tr>
                      <th>Bno</th>
                      <th>Title</th>
                      <th>content</th>
                      <th>author</th>
                      <th>vcnt</th>
                      <th>resdate</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="board" items="${boardList}">
            <tr>
                <td>${board.bno}</td>
                <td><a href="${path}/board/getBoard.do?bno=${board.bno}">${board.title}</a></td>
                <td>${board.content}</td>
                <td>${board.author}</td>
                <td>${board.vcnt}</td>
                <td>${board.resdate}</td>
                <td><a href="${path}/board/upBoard.do?bno=${board.bno}">Edit</a> </td>
                <td><a href="${path}/board/delBoard.do?bno=${board.bno}">Delete</a> </td>
            </tr>
        </c:forEach>
               </tbody>
            </table>
    <a href="${path}/board/insBoard.do">Insert Board</a>
            <div class="btn-group"></div>
       </div>
    </section>
    </div>

<jsp:include page="../include/footer.jsp"></jsp:include>
</body>
</html>
