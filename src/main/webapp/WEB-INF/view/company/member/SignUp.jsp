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
<title>사원 등록</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport" content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
<!-- font 설정 -->
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR"
	rel="stylesheet">
<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->

<!--Jquery, JqueryUI설정-->
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
	integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
	crossorigin="anonymous"></script>

<!--css 설정(기본값)-->
<link href="../css/body.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<%--  <link href="${pageContext.request.contextPath }/jsp/css/comSignIn_content.css" rel="stylesheet" type="text/css"> --%>
<link href="../css/comSignIn_content.css" rel="stylesheet"/> 

	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<script src="../js/comSignIn.js"></script>

</head>
<body>
<!-- Header 시작 -->
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<div id="SignInForm">
			<form method="post" enctype="multipart/form-data">
				<h2>사원 등록</h2>
				<div class="textBox">사원 사진</div>
				<div id="photoZone"></div><input type="file" name="staffPhoto" id="imageSource" accept="image/*">
				<div class="textBox">사원명</div><input type = "text" name = "staffName" placeholder="홍길동">
				<div class="textBox">사원 비밀번호</div><input type = "password" name = "staffPw">
				<div class="textBox">사원 비밀번호 확인</div><input type = "password" name = "staffPwConfirm">
				<div class="textBox">사원 직책</div>
				<select name="position">
					<option value="사장">사장</option>
					<option value="부장">부장</option>
					<option value="과장">과장</option>
					<option value="대리">대리</option>
					<option value="사원">사원</option>
				</select>
				<div class="textBox">사원 부서</div>
				<select name="department">
					<option value="인사팀">인사팀</option>
					<option value="총무팀">총무팀</option>
					<option value="영업팀">영업팀</option>
					<option value="전산팀">전산팀</option>
					<option value="마케팅팀">마케팅팀</option>
				</select>
				<div class="textBox">사원 생년월일</div>
				<input type="text" name = "birthDate" maxlength = "8">
				<div class="textBox">사원 전화번호(핸드폰번호)</div>
				<div id="phoneBox"><input type = "text" name = "phone1" maxlength="3" placeholder="010"> - <input type = "text" name = "phone2" maxlength="4" placeholder="5555">
					- <input type = "text" name = "phone3" maxlength="4" placeholder="1111"></div>
				<input type="submit" value="등록">
				<input type="reset" value="다시 작성">
			</form>
		</div>
	</div>
<!-- Footer 시작 -->
<!-- Footer 끝 -->
</body>
</html>