<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
    <title>QnA 상세보기</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <style>
         .getqna_header{ width: 1980px; height: 600px; margin: 0px auto; background-image:url(${path}/resources/img/notiheader.jpg);
      background-size: cover; /* Ensure the image covers the entire header */
      background-position: center; /* Center the image */
      background-repeat: no-repeat; /* Prevent the image from repeating */}


      /*noti css*/

      .breadcrumb1 { clear:both; border-bottom:2px solid #777; 
      padding-top: 24px; padding-bottom: 24px; text-align: right; 
      box-sizing:border-box;  padding-right: 40px;   }
      .breadcrumb1 p * { padding:0px 7px; color:#333; font-weight:bold; }
      .breadcrumb1 p a:after { content:">"; padding-left: 14px; }

        .qna_contents{width: 1260px; height: 2000px; margin: 0px auto; position: relative;}
        .page_title{text-align: center; margin-top: 1rem;}
        .view_getqna{width: 1060px; height: 1500px;  margin: 2rem auto; } 

        .view_getqna .titlebox{border-radius: 1px; width: 1060px; height: 30px; background-color: #F2F2F2; padding-top: 5px; padding-left: 1rem; }
        .view_getqna .textbox{border-radius: 1px; width: 1060px; height: 300px; background-color: #F2F2F2; padding-top: 5px; padding-left: 1rem;}
        .view_getqna h3{margin-top: 1rem;}
        .btn_wrap{display: flex; float: right; margin-top: 1.5rem;}
        button[type=button]{width: 80px; height: 40px; border-radius: 3px; color: bl; font-weight: bold;}
        .back_btn{background-color: rgb(173, 216, 230);}
        .del_btn{background-color: rgb(240, 128, 128); margin-left: 1rem;}
        .adit_btn{background-color: rgb(152, 251, 152); margin-left: 1rem;}
    </style>
</head>
<body>
    <%@ include file="/WEB-INF/views/header.jsp"%>
    <header class="getqna_header">

    </header>
    <div class="getqna_contents">
        <div class="breadcrumb1">
            <p>
                <a href="">홈</a><a href="">커뮤니티</a><span>질문 답변</span>
            </p>
        </div>
        
        <h2 class="page_title">질문답변 상세보기</h2>
        <div class="view_getqna">
            <h3>제목</h3>
            <div class="titlebox">${qna.title}</div>
            <h3>작성자</h3>
            <div class="titlebox">${qna.aid}</div>
            <h3>작성일</h3>
            <div class="titlebox">${qna.resdate}</div>
            <h3>조회수</h3>
            <div class="titlebox">${qna.visited}</div>
            <h3>글내용</h3>
            <div class="textbox">${qna.content}</div>

            <h4 class="mt-4">답변</h4>
            <c:forEach var="answer" items="${answerList}">
                <div style="margin-left: 20px; padding: 10px; border: 1px solid #ccc;">
                    <h5>제목 : ${answer.title}</h5>
                    <p> 내용 : ${answer.content}</p>
                    <p>작성자 :  ${answer.aid}</p>
                    <p>작성일 :  ${answer.resdate}</p>
                </div>
            </c:forEach>

            <!--
            <c:if test="${sid == 'admin'}">
                <a href="${path}/notice/editNotice.do?bno=${notice.bno}">Edit</a>
                <a href="${path}/notice/deleteNotice.do?bno=${notice.bno}">Delete</a>
            </c:if>
                <a href="${path}/notice/noticeList.do">Back to List</a>   
            -->
            <div class="btn_wrap">
                <button type="button" class="back_btn" onclick="history.back()">돌아가기</button>
                <c:if test="${sid == qna.aid || sid == 'admin'}">
                    <button type="button" class="adit_btn" onclick="goToPage('${path}/qna/upQna.do?no=${qna.no}')">글수정</button>
                    <button type="button" class="del_btn"  onclick="goToPage('${path}/qna/delQna.do?no=${qna.no}')">글삭제</button>
                </c:if>
            </div>
            <script>
                function goToPage(url) {
                    location.href = url;
                }
            </script>
         <c:if test="${sid == 'admin'}">
               <div class="answer_box" style="margin-top: 10rem;">
                    <h4 class="mt-4" >답변 등록하기 </h4>
                    <form action="${path}/qna/insAnswer.do" method="post">
                        <input type="hidden" name="parno" value="${qna.no}">
                        <div class="form-group">
                            <label for="title">답변제목:</label>
                            <input type="text" class="form-control" id="title" name="title">
                        </div>
                        <div class="form-group">
                            <label for="content">답변내용:</label>
                            <textarea class="form-control" id="content" name="content"></textarea>
                        </div>
                        <div class="answerbtnbox" style="display: flex; gap: 10px; float: right;">
                            <button type="submit" class="btn btn-primary" style="height: 40px; margin-top: 15px;">답변등록</button>
                            <a href="${path}/qna/qnaList.do" class="btn btn-secondary mt-3">돌아가기</a>
                        </div>
                    </form>
               </div>
            </c:if>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </div>    
    <%@ include file="/WEB-INF/views/footer.jsp"%>
</body>
</html>
