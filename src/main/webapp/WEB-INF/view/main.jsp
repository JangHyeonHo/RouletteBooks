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
<title>메인</title>

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
<link href="css/body.css" rel="stylesheet" type="text/css">
<link href="css/header.css" rel="stylesheet" type="text/css">
<link href="css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src = "../js/header.js"></script>

	<script>
		$(function() {
			$("#myPageBtn").on("mouseover",function(){
				$("#myPageForm").css("display","inline-block");
			})
			$("#myPageForm").on("mouseover",function(){
				$("#myPageForm").css("display","inline-block");
			});
			$("#myPageForm").on("mouseout",function(){
				$("#myPageForm").css("display","none");
			});
		})

	</script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->
<style>
	#contents{
	width : 1080px;
		height : 900px;
		margin : 0 auto;
	}
#sideManu{
	width : 180px;
	height : 1000px;
	background-color : hotpink;
	float: left;
}
#categoryBox{
	width : 180px;
	height : 600px;
	background-color : green;
}
#mainContents{
	width : 900px;
	height : 1000px;
	background-color : purple;
	float: left;
}
.MainList{
	width : 900px;
	height : 199px;
	border-bottom : 1px solid gray;
	background-color : saddlebrown;
}
#rankingList{
	width : 300px;
	height : 200px;
	background-color: chartreuse;
	float: left;
}
#eventList{
	width : 600px;
	height : 200px;
	background-color : red;
	float: left;
}
</style>

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="Header.jsp" />
<!-- Header 끝 -->
<!-- Contents -->
	<div id="contents">
		<!-- SideManu -->
		<div id="sideManu">
			<div id="categoryBox"></div>
		</div>
		<!-- Main -->
		<div id="mainContents">
			<div id="newRentalList" class="MainList"></div>
			<div id="newBuyList" class="MainList"></div>
			<div id="newSellList" class="MainList"></div>
			<div id="rankingList"></div>
			<div id="eventList"></div>
		</div>
	</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>