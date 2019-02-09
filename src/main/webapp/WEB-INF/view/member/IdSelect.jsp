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
<title>아이디찾기</title>

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
<script src = "js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="css/IdSelect_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<script src = "js/IdSelect.js"></script>

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<div class="title"><a href="#"><img src="img/logo1.png"></a></div>
		<div class=id_body_box>
			<div class="titlesubject"><h2>아이디찾기</h2></div>
			<div class="minibox1">
				
			

				<div class=title_select>
					<div class="title_box">
						<img src="img/member_status_img3.jpg">
						<h2>아이디를 찾기위한</h2>
					<h3><span>본인 확인 방법</span>을 선택해 주세요.</h3>
					</div>
				</div>
			
				<div class="minibox2">
					<div class="title_select1">
					<div class="box2">
						<input type="radio" id="select" />휴대폰 인증 <br>
						<input type="text" class="phoneok" style="width: 70px" >
						<input type="text" class="phoneok" style="width: 70px" >
						<input type="text" class="phoneok"  style="width: 70px">
						<h4>가입된 휴대폰으로 본인 확인을 진행 합니다.</h4>
					</div>
					<div class="box2">
						<input type="radio" >질문과 답변 인증
						<h4>가입된 질문 및 답변으로  본인 확인을 진행 합니다.</h4>
					</div>
					<div class="box2_1">
						<span>· 비밀번호를 찾으시나요?</span>
						<button>비밀 번호 찾기</button>
					</div>
					<div class="box2_2"><a href="#"><button>확인하기</button></a></div>
				</div>
			</div>	

			</div>
		</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>