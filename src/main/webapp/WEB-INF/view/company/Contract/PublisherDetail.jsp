<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<!--제목 설정-->
<title>출판사 상세 정보</title>
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
<link href="../../../css/PublisherDetail_content.css" rel="stylesheet"
	type="text/css">
<!--contents js설정(페이지에 따라 바뀌는 값)-->
<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

<style>
.tableHeader, .tableContents {
	display: inline-block;
	width: 85px;
	text-align: center;
}

.tableContents {
	font-size: 13px;
	font-family: 'Noto Sans KR', sans-serif;
}
</style>
<script>

	</script>
</head>
<body>
	<jsp:include page="../mheader.jsp" />
	<!-- Contents -->
	<div id="contents">
		<div id="formWriting">
			<form>
				<h2 id="title">출판사 상세 정보</h2>
				<div class="textBox">계약 번호</div>
				<div class="valueBox">
					<input type="hidden" value="485039">485039
				</div>
				<div class="textBox">출판사명</div>
				<div class="valueBox">
					<input type="hidden" value="고려출판사">고려출판사
				</div>
				<div class="textBox">계약 체결일</div>
				<div class="daysformBox">2019-02-04</div>
				<div class="textBox">계약 종료일</div>
				<div class="daysformBox">2020-03-31</div>
				<div class="textBox">계약 상태</div>
				<div class="daysformBox">
					<span style="color: blue;">계약 중</span> <span
						style="color: red; display: none;">계약 완료</span>
				</div>
				<div class="textBox">계약 도서 목록</div>
				<div id="tableBox">
					<div id="table">
						<div class="mainTableHeader">
							<div class="tableHeader">도서 번호</div>
							<div class="tableHeader">도서명</div>
							<div class="tableHeader">도서 정가</div>
							<div class="tableHeader">계약 금액</div>
							<div class="tableHeader">상세보기</div>
						</div>
						<div class="subTableRow">
							<div class="tableContents">
								<input type="hidden" value="1203924">1203924
							</div>
							<div class="tableContents">승재 코딱지</div>
							<div class="tableContents">30,000￦</div>
							<div class="tableContents">12,000,000￦</div>
							<div class="tableContents">
								<a href="#">이동</a>
							</div>
						</div>
					</div>
				</div>
				<div class="textBox">로열티</div>
				<div class="valueBox">0 ￦</div>
				<div id="btnBox">
					<input type="button" value="계약 연장하기"><input type="button"
						value="재계약하기"><input type="button" value="리스트로 돌아가기">
				</div>
			</form>
		</div>
		<!-- 레이아웃 설정 -->
	</div>
	<jsp:include page="../mfooter.jsp" />
</body>
</html>