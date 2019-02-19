<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>사원 로그인</title>

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
	<link href="../css/comLogin_content.css" rel="stylesheet" type="text/css">

	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<!-- <script src="../js/comSignIn.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<div id = "loginBox">
			<form:form>
			<div id = "loginHeaderBox"><h3>Roulette Books<p style="padding-top:6px;">사원Login</p></h3></div>
			<div id = "loginIdBox"><div class = "TextBox">사원번호</div><form:input path="comId"/></div>
			<div id = "loginPwBox"><div class = "TextBox">사원 비밀번호</div><form:password path="comPw"/></div>
			<div><form:errors path="comId" cssStyle="color:red; display : inline-block; font-size : 13px; margin-left: 145px" /><form:errors path="comPw" cssStyle="color:red; display : inline-block; font-size : 13px; margin-left: 145px"/></div>
			<div id = "loginBtnBox"><input type = "submit" value="로그인">
			<input type = "button" value="사원등록" onclick="location.href='signup'"></div>
			</form:form>
		</div>
	</div>
<!-- Footer 시작 -->
<!-- Footer 끝 -->
</body>
</html>