<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>getBoard(공지사항 상세보기)</title>
</head>
<body>
<jsp:include page="../include/header.jsp"></jsp:include>
    <div class="boarddiv">
  
      <section class="page" id="page1">
        <div class="breadcrumb">
            <p><a href="">홈</a><a href="">커뮤니티</a><span>공지사항</span></p>
        </div>
        <hr>
        <h2 class="page_title">공지사항 상세보기</h2>
        <div class="page_wrap clr-fix">
		   <table border="1">
		       <tr>
		           <th>Bno</th>
		           <td>${board.bno}</td>
		       </tr>
		       <tr>
		           <th>Title</th>
		           <td>${board.title}</td>
		       </tr>
		       <tr>
		           <th>Content</th>
		           <td>${board.content}</td>
		       </tr>
		       <tr>
		           <th>Author</th>
		           <td>${board.author}</td>
		       </tr>
		       <tr>
		           <th>View Count</th>
		           <td>${board.vcnt}</td>
		       </tr>
		       <tr>
		           <th>Resdate</th>
		           <td>${board.resdate}</td>
		       </tr>
		   </table>
	   <a href="${path}/board/upBoard.do?bno=${board.bno}">Edit</a>
	   <a href="${path}/board/delBoard.do?bno=${board.bno}">Delete</a>
	   <a href="${path}/board/boardList.do">Back to List</a>
	   </div>
    </section>
    </div>

<jsp:include page="../include/footer.jsp"></jsp:include>
</body>
</html>
