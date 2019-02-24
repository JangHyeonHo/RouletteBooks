<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--제목 설정-->
<title>도서 상세 페이지</title>
<!-- 기본 설정 -->
<meta name="viewport"
	content="width = device-width, initial-scale = 1.0, 
	maximum-scale = 1.0 minimum-scale = 1.0">
<!-- font 설정 -->
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->
<!--Jquery설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>

<!--css 설정(기본값)-->
<link href="../../../css/body.css" rel="stylesheet" type="text/css">
<link href="../../../css/com_header.css" rel="stylesheet"
	type="text/css">
<link href="../../../css/com_footer.css" rel="stylesheet"
	type="text/css">

<!--contents css설정(페이지에 따라 바뀌는 값)-->
<link href="../../../css/BookDetail_content.css" rel="stylesheet"
	type="text/css">
<!--contents js설정(페이지에 따라 바뀌는 값)-->
<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

<style>
</style>
<script>
		$(function () {
			var isOpen = true;
			$("#openBookReaderText").on("click",function(){
				if(isOpen){
					isOpen = false;
					$("#BookReaderText").css("display","block");
				} else{
					isOpen = true;
					$("#BookReaderText").css("display","none");
				}
				return false;
			})
		})
	</script>

</head>
<body>
	<jsp:include page="../../mheader.jsp" />
	<!-- Contents -->

	<div id="contents">
		<form:form enctype="multipart/form-data">
		<div id="formWriting">
				<h2 id="title">선택 도서 상세 정보(수정)</h2>
				<div class="textBox">도서 번호</div>
				<div class="valueBox">
					<input type="hidden" name="num" value="${modify.num }">
				${modify.num }
				</div>
				<div class="textBox">도서 사진</div>
				<div id="photoBox">
					
					<input type="file" name="image">
			<%-- 	<img src="<c:url value = "../../../book/uploadImage/${modify.BookStoreImgName}" />"> --%>
				</div>
				<div class="textBox">도서명</div>
				<div class="valueBox">
					<input type="text" name="bname" value="${modify.bname }"> 
				</div>
				<div class="leftBox upline">
					<div class="textBox">도서 장르</div>
					<div class="valueBox">	
					<select  name="genre">
						<option value="도서장르선택">도서장르선택</option>
						<option value="문화/역사">문화/역사</option>
						<option value="유아/어린이/청소년">유아/어린이/청소년</option>
						<option value="참고서/자격증">참고서/자격증</option>
						<option value="자연과학/IT">자연과학/IT</option>
						<option value="예술/인물">예술/인물</option>
						<option value="여행/잡지/취미">여행/잡지/취미</option>
						<option value="사회/정치/경제/경영">사회/정치/경제/경영</option>
						<option value="만화/라이트노벨">만화/라이트노벨</option>
						<option value="기타">기타</option>
					</select></div>
				</div>
				<div class="rightBox upline">
					<div class="textBox">도서 저자</div>
					<div class="valueBox"><input type="text" name="bookwriter" value="${modify.bookwriter }"></div>
				</div>
				<div class="rightBox upline">
					<div class="textBox">도서 정가</div>
					<div class="valueBox"><input type="text" name="price" value="${modify.price }">￦</div>
				</div>
				<div class="rightBox upline">
					<div class="textBox">페이지수</div>
					<div class="valueBox"><input type="text" name="page" value="${modify.page }"></div>
				</div>
				<div class="leftBox">
					<div class="textBox">국제 표준 책번호</div>
					<div class="valueBox"><input type="text" name="isbn" value="${modify.isbn }"></div>
				</div>
				<div class="rightBox">
					<div class="textBox">출판사명</div>
					<div class="valueBox">${modify.pname }</div>
				</div>
				<div class="leftBox">
					<div class="textBox">도서 등록일</div>
					<div class="valueBox">${modify.bpublicationdate }</div>
				</div>
				<div class="rightBox">
					<div class="textBox">도서 계약 만료 예정일</div>
					<div class="valueBox">${modify.cdate }</div>
				</div>
				<div class="textBox upline">도서 발간일</div>
				<div class="valueBox"><input type="date" name="writedata" value="${modify.writedata }"></div>

				<div class="textBox">도서 대여 금액</div>
				<div class="valueBox"><input type="text" name="rentalprice">￦</div>
				<div class="textBox">도서 목차</div>
				<div class="valueBox">
				<textarea name="booktoc">${modify.booktoc }</textarea>
					<!-- <ol>
						<li>시작하기에 앞서</li>
						<li>이것은 왜 책이 아닌가?</li>
						<li>전자책의 역사</li>
						<li>결론</li>
					</ol> -->
				</div>
				<div class="textBox">도서 소개</div>
				<div class="valueBox whitePreLine"><textarea name="intro">${modify.intro }</textarea></div>
				<div class="textBox">도서 저장 디렉토리</div>
				<div class="valueBox">
					C:\roulettebooks\text\munhak\thisisnotbook</div>
				<div class="textBox">이 도서에 대한 평가보기</div>
				<div class="valueBox">
					<button type="button" id="openBookReaderText">열기</button>
					<div id="BookReaderText" style="display: none;">닉네임 : xxx
						[삭제] 이 책 겁나 재미없음 솔직히 돈 아까움</div>
					<div id="btnBox">
						<input type="submit" value="변경하기">
						<button type="button" style="margin: 10px 0 0 0;" >리스트로 돌아가기</button>
					</div>
				</div>
			
			<!-- 레이아웃 설정 -->
		</div>
	</form:form>
	</div>
	
	<jsp:include page="../../mfooter.jsp" />
</body>
</html>