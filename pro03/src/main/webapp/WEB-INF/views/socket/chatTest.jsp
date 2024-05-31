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
    <title>채팅 테스트</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
</head>
<body>

	<div id="wrap">
		<h2></h2>
		<input type="text" id="msg"/>
		<button type="button" id="bt1">전송</button>
	</div>
<script>
	$(document).ready(function(){
		var ws = new WebSocket("ws://localhost:8091/socket");
		
		ws.onopen = function(e){ //서버에 연결되면
			console.log("info : connection opened");
		}
		
		ws.onmessage = function(e){ //서버로 부터 메시지가 전송되면
			console.log(e.date)	//전달받은 메시지 출력
		}
		
		ws.onclose = function(e){
			console.log("info : connection closed");
		}
		
		ws.onerror = function(e){
			console.log("error");
		}
		
		$("#btn1").click(function(e){
			e.preventDefault();
			ws.send($("msg").val());
			
		})
	})
</script>

<header>
<jsp:include page="../include/header.jsp"></jsp:include>
</header>
    <section class="section">
        <div class="container join-form">
            <h1 class="title has-text-centered">회원가입</h1>
            <form action="${path}/member/join.do" method="post" onsubmit="return equalPasswords();">
                <div class="field">
                    <label class="label">아이디</label>
                    <div class="control">
                        <input class="input" type="text" name="id" placeholder="아이디" required>
                    </div>
                </div>

                <div class="field">
                    <label class="label">비밀번호</label>
                    <div class="control">
                        <input class="input" id="pw" type="password" name="pw" placeholder="비밀번호" required>
                    </div>
                </div>
                
                <div class="field">
                    <label class="label">비밀번호확인</label>
                    <div class="control">
                        <input class="input" id="pw1"  type="password" name="pw1" placeholder="비밀번호" required>
                    </div>
                </div>
				<script>
					function equalPasswords(){
						  var pw = document.getElementById('pw').value;
					      var pw1 = document.getElementById('pw1').value;
					      
					      if(pw != pw1){
					    	  alert('비밀번호가 일치하지 않습니다. 다시 입력해주세요');
					    	  return false;
					      }
					      return true;
					}
				</script>
                <div class="field">
                    <label class="label">이름</label>
                    <div class="control">
                        <input class="input" type="text" name="name" placeholder="이름" required>
                    </div>
                </div>

                <div class="field">
                    <label class="label">이메일</label>
                    <div class="control">
                        <input class="input" type="email" name="email" placeholder="이메일" required>
                    </div>
                </div>

				 <div class="field">
                    <label class="label">생년월일</label>
                    <div class="control">
                        <input class="input" type="date" name="birth" required>
                    </div>
                </div>
				
                <div class="field">
                    <label class="label">전화번호</label>
                    <div class="control">
                        <input class="input" type="tel" name="tel" placeholder="전화번호" required>
                    </div>
                </div>

                <div class="field">
                    <label class="label">우편번호</label>
                    <div class="control">
                        <input class="input" type="text" id="postcode" name="postcode" placeholder="우편번호" readonly>
                        <button type="button" class="button is-link" onclick="findPostcode()">우편번호 찾기</button>
                    </div>
                </div>

                <div class="field">
                    <label class="label">주소</label>
                    <div class="control">
                        <input class="input" type="text" id="addr1" name="addr1" placeholder="주소" readonly>
                    </div>
                </div>
                
                   <div class="field">
                    <label class="label">상세주소</label>
                    <div class="control">
                        <input class="input" type="text" id="addr2" name="addr2" placeholder="주소">
                    </div>
                </div>

                <div class="field is-grouped">
                    <div class="control">
                        <button type="submit" class="button is-link">회원가입</button>
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
