<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE>
<html lang="ko">
<head>
	<title>Home</title>
	<jsp:include page="../include/head.jsp"></jsp:include> 
</head>
<body>
<header>
	<jsp:include page="../include/header.jsp"></jsp:include>
</header>

<h1>
	관리자 페이지 
</h1>

<h3>제품 등록 및 삭제</h3>
<p><a href="${path}/product/productList.do">productList</a></p>

<h3>재고 등록 및 삭제</h3>
<p><a href="${path}/product/productList.do">productList</a></p>

<h3> 공지사항 관리</h3>
<p> <a href="${path}/board/boardList.do">boardList</a></p>

<h3> 자유계시판 관리</h3>
<p><a href="${path}/free/freeList.do">freeList</a></p>

<h3> qna 관리</h3>
<p><a href="${path}/qna/qnaList.do">qnaList</a></p>


<footer>
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>
