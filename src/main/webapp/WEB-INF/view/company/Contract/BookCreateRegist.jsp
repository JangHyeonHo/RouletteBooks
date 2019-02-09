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
	<title>
		출판사 등록하기
	</title>
	<!-- 기본 설정 -->
	<meta name="viewport" content="width = device-width, initial-scale = 1.0, 
	maximum-scale = 1.0 minimum-scale = 1.0">
	<!-- font 설정 -->
	<link href="https://fonts.googleapis.com/css?family=Do+Hyeon" rel="stylesheet">
	<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">
	<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->
	<!--Jquery설정-->
	<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	 crossorigin="anonymous"></script>

	<!--css 설정(기본값)-->
	<link href="../../../css/body.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_header.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_footer.css" rel="stylesheet" type="text/css">

	<!--contents css설정(페이지에 따라 바뀌는 값)-->
	<link href="../../../css/BookCreateRegist_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

	<style>
		
	</style>
	<script>
	$(function () {
		var days = new Date();
		var YYMMSS = days.getFullYear().toString() + "-" +
		((days.getMonth() + 1) < 10 ? "0"+(days.getMonth() + 1) : (days.getMonth() + 1)) + "-" + 
		(days.getDate() < 10 ? "0" + days.getDate() : days.getDate());
		$("#regi_days").html("<input type = 'hidden' value = '" + YYMMSS + "' id = 'regi_day'>" + YYMMSS);
	})

	</script>
</head>
<body>
	<jsp:include page="../mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<div id="formWriting">
			<form>
				<h2 id="title">새로운 출판사 등록</h2>
				<div class="textBox">출판사명</div>
				<input type="text" name="ReName"> <span style=" font-family: 'Noto Sans KR', sans-serif;">출판사</span>
				<div class="textBox">출판사 전화번호</div>
				<div class="formBox">
					<select name="phone1">
						<option value="02">02</option>
						<option value="031">031</option>
						<option value="032">032</option>
						<option value="033">033</option>
						<option value="041">041</option>
						<option value="042">042</option>
						<option value="043">043</option>
						<option value="044">044</option>
						<option value="051">051</option>
						<option value="052">052</option>
						<option value="053">053</option>
						<option value="054">054</option>
						<option value="055">055</option>
						<option value="061">061</option>
						<option value="062">062</option>
						<option value="063">063</option>
						<option value="064">064</option>
						<option value="010">010</option>
					</select>
					 - <input type="text" name="Phone2" maxlength="4"> - <input type="text" name="Phone3" maxlength="4"> </div>
				<div class="textBox">출판사 발행자번호</div>
				<input type="text" name="pNum">
				<div class="textBox">출판사 대표자명</div>
				<input type="text" name="pNum">
				<div class="textBox">출판사 등록일</div>
				<div class="formBox" id="regi_days"></div>
				<div id = "btnBox"><input type="submit" value="등록하기"><input type="button" value="등록 후 계약 등록 하기"><input type = "reset" value = "다시 작성하기"></div>
			</form>
		</div>
		<!-- 레이아웃 설정 -->
	</div>
	<jsp:include page="../mfooter.jsp"/>
</body>
</html>