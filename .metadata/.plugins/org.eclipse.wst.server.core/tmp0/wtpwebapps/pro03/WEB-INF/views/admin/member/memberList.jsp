<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Member List</title>
    <link href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css" rel="stylesheet">
</head>
<body>
    <%@ include file="../../include/header.jsp" %>
    <div class="container">
        <nav class="breadcrumb" aria-label="breadcrumbs">
            <ul>
                <li><a href="${path}">홈</a></li>
                <li><a href="#">회원관리</a></li>
                <li class="is-active"><a href="#" aria-current="page">회원 목록</a></li>
            </ul>
        </nav>
        <h2 class="title is-3">회원 목록</h2>
        <div class="table-container">
            <table class="table is-fullwidth is-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>이름</th>
                        <th>이메일</th>
                        <th>전화번호</th>
                        <th>우편번호</th>
                        <th>생일</th>
                        <th>주소</th>
                        <th>포인트</th>
                        <th>가입일</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="member" items="${memberList}">
                        <tr>
                            <td>${member.id}</td>
                            <td>${member.name}</td>
                            <td>${member.email}</td>
                            <td>${member.tel}</td>
                            <td>${member.postcode}</td>
                            <td><fmt:formatDate value="${member.birth}" pattern="yyyy-MM-dd"/></td>
                            <td>${member.addr}</td>
                            <td>${member.point}</td>
                            <td><fmt:formatDate value="${member.regdate}" pattern="yyyy-MM-dd"/></td>
                         	<td><a href="${path0}/admin/delMember.do?id=${member.id}" class="button is-warning">탈퇴</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="${path0}/admin/adminHome.do"></a>
        </div>
    </div>
    <%@ include file="../../include/footer.jsp" %>
</body>
</html>
