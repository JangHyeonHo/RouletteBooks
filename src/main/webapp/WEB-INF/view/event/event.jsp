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
<title>이벤트</title>

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
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<link href="css/event_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
	<!-- 레이아웃 설정 -->
		<div id="event_roulette">
			<div id="envet_roulette_header">
				<h1>룰렛 이벤트 !</h1>
			</div>
			<div id="event_roulette_contents">
				<div id="roulette_image"><img src="img/rouletteBg.png"></div>
				<div id="roulette_chance_announce">유승재님 실버등급 남은횟수 : 3</div>
				<div id="roulette_btn"><button id="roulette_btn_style">돌려 돌려 돌림판</button></div>
			</div>
		</div>
		<div id="event_discount">
			<div id="event_discount_contents">
				<div id="event_discount_contents_header">
					<h3>이달의 할인도서</h3>
				</div>
				<div id="event_discount_contents_content">
					<!--할인도서 이미지-->
					<ul>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>





					</ul>
				</div>

				<div id="event_discount_contents_footer">
					해당 이벤트도서는 당사의 사정에따라 변경될수 있습니다.
				</div>
			</div>
		</div>
		<div id="event_footer">
			<div><button>◀</button>
				1 | 2 | 3
				<button>▶</button></div>
		</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>