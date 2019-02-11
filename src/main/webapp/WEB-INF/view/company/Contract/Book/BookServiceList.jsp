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
<title>도서 관리 페이지</title>
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
<link href="../../../css/BookServiceList_content.css" rel="stylesheet"
	type="text/css">
<!--contents js설정(페이지에 따라 바뀌는 값)-->
<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

<style>
</style>
<script>
	</script>
</head>
<body>
	<jsp:include page="../../mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<form>
			<h2 id="title">Roulette Books 도서 관리 페이지</h2>
			<table border="1px">
				<tr>
					<th class="seventy">도서 번호</th>
					<th class="twohundred">도서명</th>
					<th class="hundred">도서 사진</th>
					<th class="hundthirty">도서 장르</th>
					<th class="hundthirty">국제 표준 책 번호(ISBN)</th>
					<th class="eighty">도서 출판사명</th>
					<!-- 수정 가능(회원 등급) 불량 회원에 대한 제재 필요 -->
					<th class="eighty">도서 등록일</th>
					<th class="eighty">도서 대여횟수</th>
					<th class="eighty">도서 대여금액</th>
					<th class="ninety">도서 등록상태</th>
					<!-- 앞자리 4개 뒷자리 4개 중간 x -->
				</tr>
				<tr>
					<td>140393424</td>
					<td><a href="#" title="이곳을 누르면 도서 상세 정보 페이지로 이동합니다.">승재
							비염으로 인한 코딱지는 너무 커서 먹을 수가 없다</a></td>
					<td><img src="img/book1.jpg" width="100px" height="125px"></td>
					<td>[만화/라이트노벨]</td>
					<td>978-89-88131-24-4</td>
					<td>한경출판사</td>
					<td>2019-02-05</td>
					<td>423</td>
					<td>1,000 ￦</td>
					<td><a href="#" title="이곳을 누르면 수정 페이지로 이동합니다.">등록[계약 중]</a></td>
				</tr>
				<tr>
					<td>140392425</td>
					<td><a href="#" title="이곳을 누르면 도서 상세 정보 페이지로 이동합니다.">방구가
							마려워서 방구를 꼈더니 똥이 나온 사연</a></td>
					<td><div class="noneData"
							style="width: 100px; height: 125px; background-color: brown;"></div></td>
					<td>미정</td>
					<td>미등록</td>
					<td>한경출판사</td>
					<td>2019-02-06</td>
					<td>0</td>
					<td>2,000 ￦</td>
					<td><a href="#" title="이곳을 누르면 수정 페이지로 이동합니다.">가등록[계약 중]</a></td>
				</tr>
				<tr>
					<!-- 페이징 -->
					<td colspan="12">1 2 3 4 5 6 7 8</td>
				</tr>
			</table>
			<div class="alertBox" style="float: left;">※각 도서 제목을 클릭하시면 해당
				도서 상세페이지로 이동합니다.</div>
			<div class="alertBox">※각 도서별 등록상태를 클릭하시면 도서 수정페이지로 이동합니다.</div>
			<div id="searchBox">
				<select name="searchSet" id="search">
					<option value="email">도서번호로 찾기</option>
					<option value="name">도서명으로 찾기</option>
					<option value="nickname">도서 장르별로 찾기</option>
					<option value="gender">도서 출판사명으로 찾기</option>
					<option value="createDate">도서 등록일로 찾기</option>
					<option value="grade">도서 대여횟수로 찾기</option>
					<option value="money">도서 대여금액으로 찾기</option>
				</select> <input type="text" name="query" placeholder="example@roulette.com"
					id="textLine"> <input type="submit" value="찾기">
			</div>
		</form>
	</div>
	<jsp:include page="../../mfooter.jsp"/>
</body>
</html>