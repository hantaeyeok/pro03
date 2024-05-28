<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>자유 게시판 글 상세 보기</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
    <style>
        .content-container { margin-top: 50px; }
        .title { margin-top: 20px; }
        .button { margin-top: 20px; }
    </style>
</head>
<body>
<header>
    <jsp:include page="../include/header.jsp"></jsp:include>
</header>
<section class="section">
    <div class="container content-container">
        <h1 class="title has-text-centered">자유 게시판 글 상세 보기</h1>
        <div class="box">
            <div class="field">
                <label class="label">제목</label>
                <div class="control">
                    <p class="content">${free.title}</p>
                </div>
            </div>

            <div class="field">
                <label class="label">작성자</label>
                <div class="control">
                    <p class="content">${free.name}</p>
                </div>
            </div>

            <div class="field">
                <label class="label">작성일</label>
                <div class="control">
                    <p class="content"><fmt:formatDate value="${free.resdate}" pattern="yyyy-MM-dd HH:mm:ss" /></p>
                </div>
            </div>

            <div class="field">
                <label class="label">조회수</label>
                <div class="control">
                    <p class="content">${free.hits}</p>
                </div>
            </div>

            <div class="field">
                <label class="label">내용</label>
                <div class="control">
                    <div class="content" style="white-space: pre-wrap;">${free.content}</div>
                </div>
            </div>
        </div>
        
        <div class="buttons is-centered">
            <a href="${path}/free/freeList.do" class="button is-link">목록으로</a>
            <a href="${path}/free/editFree.do?no=${free.no}" class="button is-primary">수정</a>
            <a href="${path}/free/deleteFree.do?no=${free.no}" class="button is-danger" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</a>
        </div>
    </div>
</section>
<footer>
    <jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>
