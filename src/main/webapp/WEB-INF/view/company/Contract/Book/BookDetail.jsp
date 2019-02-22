<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  --%>
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
		<div id="formWriting">
			<form>
				<h2 id="title">선택 도서 상세 정보</h2>
				<div class="textBox">도서 번호</div>
				<div class="valueBox">
					<input type="hidden" value="485039343">485034339
				</div>
				<div class="textBox">도서 사진</div>
				<div id="photoBox">
					<img src="img/book1.jpg" width="100px" height="125px">
				</div>
				<div class="textBox">도서명</div>
				<div class="valueBox">
					<input type="hidden" value="이것은 도서가 아닙니다. 전자책입니다.">이것은 도서가
					아닙니다. 전자책입니다.
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
					<div class="textBox">도서 정가</div>
					<div class="valueBox">15,000￦</div>
				</div>
				<div class="leftBox">
					<div class="textBox">국제 표준 책번호</div>
					<div class="valueBox">394820489203</div>
				</div>
				<div class="rightBox">
					<div class="textBox">출판사명</div>
					<div class="valueBox">한경출판사</div>
				</div>
				<div class="leftBox">
					<div class="textBox">도서 등록일</div>
					<div class="valueBox">2019-03-21</div>
				</div>
				<div class="rightBox">
					<div class="textBox">도서 계약 만료 예정일</div>
					<div class="valueBox">2019-04-23</div>
				</div>
				<div class="textBox upline">도서 발간일</div>
				<div class="valueBox">2015-02-24</div>

				<div class="textBox">도서 대여 금액</div>
				<div class="valueBox">1,500￦</div>
				<div class="textBox">도서 목차</div>
				<div class="valueBox">
					<ol>
						<li>시작하기에 앞서</li>
						<li>이것은 왜 책이 아닌가?</li>
						<li>전자책의 역사</li>
						<li>결론</li>
					</ol>
				</div>
				<div class="textBox">도서 소개</div>
				<div class="valueBox whitePreLine">이 책의 줄거리를 소개하는 것이다</div>
				<div class="textBox">도서 저장 디렉토리</div>
				<div class="valueBox">
					C:\roulettebooks\text\munhak\thisisnotbook</div>
				<div class="textBox">이 도서에 대한 평가보기</div>
				<div class="valueBox">
					<button id="openBookReaderText">열기</button>
					<div id="BookReaderText" style="display: none;">닉네임 : xxx
						[삭제] 이 책 겁나 재미없음 솔직히 돈 아까움</div>
					<div id="btnBox">
						<input type="button" value="변경하기"><input type="button"
							value="리스트로 돌아가기">
					</div>
				</div>
			</form>
			<!-- 레이아웃 설정 -->
		</div>
	</div>
	<jsp:include page="../../mfooter.jsp" />
</body>
</html>