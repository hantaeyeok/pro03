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
 

      .notice_header{ width: 1980px; height: 600px; margin: 0px auto; background-image:url(img/notiheader.jpg);
      background-size: cover; /* Ensure the image covers the entire header */
      background-position: center; /* Center the image */
      background-repeat: no-repeat; /* Prevent the image from repeating */}

      .notice_contents{width: 1260px; height: 500px; margin: 0px auto; position: relative;}

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
      .tb1 td:last-child { text-align: right; padding-right: 20px; }
      .tb1 a { text-decoration: none; color:#333; }
      .tb1 a:hover { text-decoration: underline; color:deepskyblue; }
      .tb1 a.answer { padding-left: 28px; }
      
      #vs { clear:both; width: 1930px; height: 600px; overflow:hidden; position:relative; margin: 0 auto;}
      #vs img { display:block; width: 100%;  height: 100%; position:absolute;  z-index: 0px;}


    </style>
</head>
<body>

<%@ include file="/WEB-INF/views/header.jsp" %> 
    <figure id="vs">
        <img class="backimg" src="${path}/resources/img/back01.jpg" alt="배경이미지">
    </figure>
    <div class="notice_contents">
      <section class="page" id="page1">
        <div class="breadcrumb">
            <p>
                <a href="">홈</a><a href="">커뮤니티</a><span>공지사항</span>
            </p>
        </div>
        <hr>
        <h2 class="page_title">공지사항 목록</h2>
        <div class="page_wrap clr-fix" style="padding-bottom: 90px;">
            <table class="tb1">
                <thead>
                    <tr>
                      <th>Bno</th>
                      <th>Title</th>
                      <th>Author</th>
                      <th>View Count</th>
                      <th>Resdate</th>
                      <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="notice" items="${noticeList}">
            <tr>
                <td>${notice.bno}</td>
                <td><a href="${path}/notice/getNotice.do?bno=${notice.bno}">${notice.title}</a></td>
                <td>${notice.author}</td>
                <td>${notice.visited}</td>
                <td>${notice.resdate}</td>
                <td>
                    <a href="${path}/notice/editNotice.do?bno=${notice.bno}">Edit</a>
                    <a href="${path}/notice/deleteNotice.do?bno=${notice.bno}">Delete</a>
                </td>
            </tr>
        </c:forEach>
                  
                </tbody>
            </table>
    <a href="${path}/notice/insertNotice.do">Insert Notice</a>
            <div class="btn-group">
                <a href="" class="">글 쓰기</a>
            </div>
        </div>
    </section>
    </div>
   <%@ include file="/WEB-INF/views/footer.jsp" %> 
</body>
</html>
