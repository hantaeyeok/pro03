<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판등록</title>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <style>
        /*공통*/
        * { margin: 0; padding: 0; }
        body { width:100%; height: auto; } 
        ul {list-style:none;}
        a{text-decoration: none;}
 

      .insqna_header{ width: 1980px; height: 600px; margin: 0px auto; background-image:url(${path}/resources/img/notiheader.jpg);
      background-size: cover; /* Ensure the image covers the entire header */
      background-position: center; /* Center the image */
      background-repeat: no-repeat; /* Prevent the image from repeating */}


      /*noti css*/
      .breadcrumb { clear:both; border-bottom:2px solid #777; 
      padding-top: 24px; padding-bottom: 24px; text-align: right; 
      box-sizing:border-box;  padding-right: 40px;   }
      .breadcrumb p * { padding:0px 7px; color:#333; font-weight:bold; }
      .breadcrumb p a:after { content:">"; padding-left: 14px; }

        .insqna_contents{width: 1260px; height: 650px; margin: 0px auto; position: relative; }
        .page_title{text-align: center; margin-top: 1rem;}
        .ins_qna{width: 750px; height: auto; margin: 2rem auto; margin: 0px auto; margin-top: 2rem; } 
        #title{width: 660px; height: 30px;}
        #content{width: 660px; height: 300px; resize: none; margin-top: 1rem; margin-left: 3.7rem;}
        #author{width: 660px; height: 30px; margin-top: 1rem;}
        
        .btnbox{clear: both; float: right; margin-right: 2.0rem; margin-top: 1rem;} 
        .insqna_contents button{width: 70px; height: 40px; font: bolder; }
    </style>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
    <header class="insqna_header">

    </header>
    <div class="insqna_contents">
        <div class="breadcrumb">
            <p> 
                <a href="">홈</a><a href="">커뮤니티</a><span>질문 답변</span>
            </p>
        </div>
        <hr>
        <h2 class="page_title"> QNA 등록</h2>

        <div class="ins_qna">
            <form action="${path}/qna/insQna.do" method="post">
                <label for="title">글제목:</label>
                <input type="text" id="title" name="title" class="form-control" required>
                <label for="content"></label>
                <textarea id="content" name="content" required placeholder="내용을 입력해주세요"></textarea><br>
                <input type="hidden" name="parno" value="0">
                <input type="hidden" name="plevel" value="1">
                <input type="hidden" name="visited" value="0"> 
               
                <div class="btnbox">
                    <button type="submit">등록하기</button>
                    <button type="button" onclick="history.back()">돌아가기</button>
                </div>
            </form>
        </div>
    
    </div>
    <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>