<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="path2" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품 정보 수정</title>
</head>
<body>
<div class="full-wrap">
    <!-- 헤더 부분 인클루드 -->
    <header id="hd">
        <div class="container">
            <jsp:include page="../include/header.jsp"></jsp:include>
        </div>
    </header>
    <main id="contents" class="contents">
        <div id="breadcrumb" class="container breadcrumb-wrap clr-fix" style="height:60px; line-height:60px;">
            <nav class="breadcrumb" aria-label="breadcrumbs">
                <ul>
                    <li><a href="${path2}">Home</a></li>
                    <li><a href="${path2}/product/productList.do">상품</a></li>
                    <li class="is-active"><a href="#" aria-current="page">상품 정보 수정</a></li>
                </ul>
            </nav>
        </div>
        <section class="page" id="page1">
            <h2 class="page-title">상품 정보 수정</h2>
            <div class="page-wrap">
                <div class="clr-fix">
                    <br>
                    <form action="${path2}/product/upProduct.do" method="post" enctype="multipart/form-data">
                        <table class="table">
                            <tbody>
                                <tr>
                                    <th><label for="cate">카테고리</label></th>
                                    <td>
                                        <select name="cate" id="cate" required>
                                            <option value="">선택 안함</option>
                                            <option value="beer" ${product.cate == 'beer' ? 'selected' : ''}>맥주</option>
                                            <option value="soju" ${product.cate == 'soju' ? 'selected' : ''}>소주</option>
                                            <option value="wine" ${product.cate == 'wine' ? 'selected' : ''}>와인</option>
                                            <option value="others" ${product.cate == 'others' ? 'selected' : ''}>기타 주류</option>
                                            <option value="new" ${product.cate == 'new' ? 'selected' : ''}>신제품</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="pname">상품명</label></th>
                                    <td>
                                        <input type="hidden" name="pno" id="pno" value="${product.pno}">
                                        <input type="text" name="pname" id="pname" class="input" maxlength="100" value="${product.pname}" required>
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="context">상품 설명</label></th>
                                    <td>
                                        <textarea name="context" id="context" class="textarea" required>${product.context}</textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="price">가격</label></th>
                                    <td>
                                        <input type="number" value="${product.price}" name="price" id="price" class="input" required />
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="img1">상품 메인이미지</label></th>
                                    <td>
                                        <input type="file" name="img1" id="img1" accept="image/*" />
                                        <br>현재 이미지: <img src="${path2}/resources/upload/${product.img1}" width="100">
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="img2">상품 상세 이미지</label></th>
                                    <td>
                                        <input type="file" name="img2" id="img2" accept="image/*" />
                                        <br>현재 이미지: <img src="${path2}/resources/upload/${product.img2}" width="100">
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="img3">상품 썸네일 이미지</label></th>
                                    <td>
                                        <input type="file" name="img3" id="img3" accept="image/*" />
                                        <br>현재 이미지: <img src="${path2}/resources/upload/${product.img3}" width="100">
                                    </td>
                                </tr>
                                <tr>
                                    <th><label for="com">제조사</label></th>
                                    <td>
                                        <textarea name="com" id="com" rows="8" cols="80" maxlength="980" class="textarea" required>${product.com}</textarea>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                        <hr>
                        <div class="buttons">
                            <button type="submit" class="button is-danger">수정 완료</button>
                            <a href="${path2}/product/productList.do" class="button is-primary">상품 목록</a>
                            <a href="${path2}/product/getProduct.do?pno=${product.pno}" class="button is-success">상품 정보 상세보기</a>
                        </div>
                    </form>
                </div>
            </div>
        </section>
    </main>
    <!-- 푸터 부분 인클루드 -->
    <footer id="ft">
        <jsp:include page="../include/footer.jsp"></jsp:include>
    </footer>
</div>
</body>
</html>
