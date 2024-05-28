<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>제품 등록</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
</head>
<body>
<header>
<jsp:include page="../include/header.jsp"></jsp:include>
</header>
    <section class="section">
        <div class="container">
            <h1 class="title">제품 등록</h1>
            <form action="${pageContext.request.contextPath}/product/productRegister.do" method="post" enctype="multipart/form-data">
                <div class="field">
                    <label class="label">카테고리</label>
                    <div class="control">
                        <input class="input" type="text" name="cate" placeholder="카테고리" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label">제품명</label>
                    <div class="control">
                        <input class="input" type="text" name="pname" placeholder="제품명" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label">가격</label>
                    <div class="control">
                        <input class="input" type="number" name="price" placeholder="가격" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label">이미지</label>
                    <div class="control">
                        <input class="input" type="file" name="file" required>
                    </div>
                </div>
                <div class="field">
                    <label class="label">제조사</label>
                    <div class="control">
                        <input class="input" type="text" name="com" placeholder="제조사" required>
                    </div>
                </div>
                <div class="field is-grouped">
                    <div class="control">
                        <button type="submit" class="button is-link">등록</button>
                    </div>
                    <div class="control">
                        <button type="reset" class="button is-link is-light">취소</button>
                    </div>
                </div>
            </form>
        </div>
    </section>
      <footer>
    <jsp:include page="../include/footer.jsp"></jsp:include>
    </footer>
</body>
</html>
