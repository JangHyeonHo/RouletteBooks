<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>대여</title>

<!-- 기본 설정  => 여기서부터 -->
<meta name="viewport"
	content="width = device-width, initial-scale = 1.0, maximum-scale = 1.0 minimum-scale = 1.0">
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
<script src="js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<link href="css/rental_content.css" rel="stylesheet" type="text/css">
<link href="css/category.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->
<script src="js/rental.js"></script>
<script src="js/category.js"></script>

</head>
<body>
	<!-- Header 시작 -->
	<jsp:include page="../Header.jsp" />
	<!-- Header 끝 -->
	<!-- Content 시작(내용 첨가) -->
	<div id="contents">
		<!--사이드바-->
		<div id="sidebar">
			<!--카테코리-->
	<jsp:include page="../category.jsp" />
			<!-- 베스트셀러
			<div id="rental_best_seller">
				<h3 id="rental_best_seller_title">베스트 셀러</h3>
				<div><img src="img/sample.png"></div>

			</div> -->
		</div>
		<!--메인콘텐츠-->
		<div id="main_content">
			<!--추천도서-->
			<div id="rental_recommend">
				<div id="rental_recommend_content">
					<div id="rental_recommend_title">추 천 도 서</div>
					<a id="retal_recommend_prev"><img src="img/btn_prev.gif"
						alt="이전"></a>
					<!--슬라이드 1번-->
					<ul>
						<!--이미지 사이즈 200x300-->
						<li class="rentel_recommend_list1 as">
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
						</li>
						<!--슬라이드 2번-->
						<li class="rentel_recommend_list2 as">
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>
							<div class="rental_recommend_image">
								<img src="img/sample.png">
							</div>

						</li>
					</ul>
					<a id="retal_recommend_next"><img src="img/btn_next.gif"
						alt="다음"></a>


				</div>
			</div>
			<!--도서 카테코리 적어-->
			<div id="rental_new_book">
				<div id="rental_new_book_detail">
					<br>
					<h1 style="text-align: center">신간 도서</h1>
				</div>
			</div>
			<!--대여 리스트-->
			<!--도서 목록 사이즈 200x270 -->
		 
			<div id="rental_list">
				<c:forEach items="${list }" var="ren">
				<ul id="listul">
					<li>

						<div class="rental_list_li">
							<a href="rental/detail"><img src="<c:url value = "book/uploadImage/${ren.image}" />"><br>
							</a>
							<p id="rental_list_info">${ren.bname } 저 /  ${ren.pname }출판</p>
							<span id="rental_list_grade"> ★★★★★ </span>
							<p>
								<strong>${ren.bpublisherprice }원</strong>
							</p>
							</div>
					</li>				
				</ul>
				</c:forEach> 
				</div>
				
				
				<div id="page">
					<div id="page_count">
						<img src="img/page.jpg">
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