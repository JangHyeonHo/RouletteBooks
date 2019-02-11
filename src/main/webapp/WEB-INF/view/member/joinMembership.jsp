<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>회원가입</title>

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
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src = "../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="../css/joinMember_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<script src = "../js/joinMembership.js"></script>

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<div id="SignInForm">
			<form action="" method="post">
				<h2>회원가입</h2>
				<div class="textBox">이메일(아이디)</div><input type="text" id = "email" name="id" placeholder="abcdefgh@gmail.com">
				<input type="button" id="emailFirm" value="중복확인">
				<div class="textBox">비밀번호</div><input type="password" name="password">
				<div class="textBox">비밀번호 확인</div><input type="password" name="passwordCon">
				<div class="textBox">닉네임</div><input type="text" name="nick">
				<input type="button" value="중복확인">
				<div class="textBox">이름</div><input type="text" name="name">
				<div class="textBox">생년월일</div>
				<select name="year" id="year">
				</select>년
				<select name="month" id = "month">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>월
				<select name="day" id="day">
				</select>일
				<div class="textBox">성별</div>
				<input type="radio" name="sex" value="남">남자
				<input type="radio" name="sex" value="여">여자

				<div class="textBox">주소 <input type="button" value="주소찾기"> </div>
				<input type="text" id="address" name="address">
				<input type="text" id="address1" name="address1" placeholder="상세주소입력">
				<div class="textBox">핸드폰 번호</div>
				<div id="phoneBox">
					<select name="phoneFirst" id="phoneFirst">
						<option value="010">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="018">018</option>
						<option value="019">019</option>
					</select>
					<input type="text" class = "phoneNum" name="phone2" maxlength="4" placeholder="1234">
					- <input type="text" class = "phoneNum" name="phone3" maxlength="4" placeholder="5678">
					<input type="button" value="인증번호 받기"></div>


				<div class="textBox">계좌정보(선택)
					<input type="checkbox" id="accountInfocall">
				</div>
				<div id="accountInfo" style = "display:none;">
					<select name="bankName" id = "bank">
						<option>은행선택</option>
						<option>우리</option>
					</select>
					<div class="textBox">계좌번호</div>
					<input type="text" id="accountNum" name="accountNum" placeholder="-빼고 작성해주세요.">
				</div>
				<input type="submit" value="가입">
				<input type="reset" value="재 작성">
			</form>
		</div>
	</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>