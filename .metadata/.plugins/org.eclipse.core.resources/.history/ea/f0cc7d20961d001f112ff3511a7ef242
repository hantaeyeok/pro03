<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <title>Notice List</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <style>
        /*공통*/
        * { margin: 0; padding: 0; }
        body { width:100%; height: auto; } 
        ul {list-style:none;}
        a{text-decoration: none;}
 

      .qnalist_header{ width: 1980px; height: 600px; margin: 0px auto;  background-image:url(${path}/resources/img/notiheader.jpg);
      background-size: cover; /* Ensure the image covers the entire header */
      background-position: center; /* Center the image */
      background-repeat: no-repeat; /* Prevent the image from repeating */}

      .qnalist_contents{width: 1260px; height: 500px; margin: 0px auto; position: relative;}




      /*noti css*/
      .breadcrumb { clear:both; border-bottom:2px solid #777; 
      padding-top: 24px; padding-bottom: 24px; text-align: right; 
      box-sizing:border-box;  padding-right: 40px;   }
      .breadcrumb p * { padding:0px 7px; color:#333; font-weight:bold; }
      .breadcrumb p a:after { content:">"; padding-left: 14px; }
      
      #contents { width: 100%; }
      .page { clear:both; width: 100%; min-height:60vh; }
      .page:after { content:""; display:block; width:100%; clear:both; }
      .page_title { text-align: center; padding-top: 2em; 
          padding-bottom: 0.5em; }
      .page_wrap { clear:both; width: 1200px; margin: 0 auto; }
      .tb1 { width:1200px; margin:0 auto; border-collapse: collapse; clear:both;  }
      .tb1 th, .tb1 td { line-height: 32px; }
      .tb1 th { background-color: #333; color:#fff; }
      .tb1 td { border-bottom:1px solid #333; }
      .tb1 td:first-child { text-align: center; color:deepskyblue; }
      .tb1 td { text-align: center; padding-right: 20px; }
      .tb1 a { text-decoration: none; color:#333; }
      .tb1 a:hover { text-decoration: underline; color:deepskyblue; }
      .tb1 a.answer { padding-left: 28px; }

      .btn-group{clear: both; float: right; margin-right: 1.0rem; margin-top: 1rem;} 
        .qnalist_contents button{width: 70px; height: 40px; font: bolder; }
    </style>
</head>
<body>

   <%@ include file="/WEB-INF/views/header.jsp"%>
   <header class="qnalist_header">

    </header>
   <div class="qnalist_contents">
        <div class="breadcrumb">
            <p>
                <a href="">홈</a><a href="">커뮤니티</a><span>QNA</span>
            </p>
        </div>
        <hr>
        <h2 class="page_title">QNA 목록</h2>
        <div class="page_wrap clr-fix" style="padding-bottom: 90px;">
            <table class="tb1">
                <thead>
                    <tr>
                        <th>글번호</th>
                        <th>제목</th>
                        <th>글내용</th>
                        <th>작성자</th>
                        <th>조회수</th>
                        <th>작성일</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="qna" items="${qnaList}">
                        <tr>
                            <td>${qna.no}</td>
                            <td>
                                <c:forEach var="i" begin="1" end="${qna.plevel}">
                                    <span class="indent"></span>
                                </c:forEach>
                                <a href="${path}/qna/getQna.do?no=${qna.no}">${qna.title}</a>
                            </td>
                            <td>${qna.content}</td>
                            <td>${qna.aid}</td>
                            <td>${qna.visited}</td>
                            <td>${qna.resdate}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
                <div class="btn-group">      
                    <button type="submit"><a href="${path}/qna/insQna.do">글등록</a></button>
                </div>
        </div>
   </div>
   <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>