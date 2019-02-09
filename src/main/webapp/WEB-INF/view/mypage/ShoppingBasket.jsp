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
<title>장바구니</title>

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
<link href="css/ShoppingBasket_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">

  <div class="basket_box">
			<h3>장바구니</h3><h1>장바구니 > 주문결제 > 주문완료</h1>
		</div>
		
		<div class="select_box">
			<a href="#">전체선택</a>ㅣ<a href="#">선택삭제</a>
		</div>
		
		<div class="basket_main_box">
			<div class="basket_main_box1">
				<div class="basket_main_check"><input type="checkbox"></div>
				<div class="basket_main_img"><img src="img/buybook4.jpg" /></div>
				<div class="basket_main_subject">책제목</div>
				<div class="basket_main_count">
					<input type="number" value="1" min="0">
				</div>
				<div class="basket_main_money">20,000원</div>
			</div>
			<div class="basket_main_box2">
				<div class="total_box">
					<div class="money_info">상품금액</div>
					<div class="money_info">20,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">-</div>
				<div class="total_box">
					<div class="money_info">할인금액</div>
					<div class="money_info">3,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">+</div>
				<div class="total_box">
					<div class="money_info">배송비</div>
					<div class="money_info">2,500원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">=</div>
				<div class="total_box">
					<div class="money_info">주문금액</div>
					<div class="money_info">50,000원</div>
				</div>
			</div>

			<div class="basket_main_box1">
				<div class="basket_main_check"><input type="checkbox"></div>
				<div class="basket_main_img"><img src="img/buybook4.jpg" /></div>
				<div class="basket_main_subject">책제목</div>
				<div class="basket_main_count">
					<input type="number" value="1" min="0">
				</div>
				<div class="basket_main_money">20,000원</div>
			</div>
			<div class="basket_main_box2">
				<div class="total_box">
					<div class="money_info">상품금액</div>
					<div class="money_info">20,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">-</div>
				<div class="total_box">
					<div class="money_info">할인금액</div>
					<div class="money_info">3,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">+</div>
				<div class="total_box">
					<div class="money_info">배송비</div>
					<div class="money_info">2,500원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">=</div>
				<div class="total_box">
					<div class="money_info">주문금액</div>
					<div class="money_info">50,000원</div>
				</div>
			</div>

			<div class="basket_main_box1">
				<div class="basket_main_check"><input type="checkbox"></div>
				<div class="basket_main_img"><img src="img/buybook4.jpg" /></div>
				<div class="basket_main_subject">책제목</div>
				<div class="basket_main_count">
					<input type="number" value="1" min="0">
				</div>
				<div class="basket_main_money">20,000원</div>
			</div>
			<div class="basket_main_box2">
				<div class="total_box">
					<div class="money_info">상품금액</div>
					<div class="money_info">20,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">-</div>
				<div class="total_box">
					<div class="money_info">할인금액</div>
					<div class="money_info">3,000원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">+</div>
				<div class="total_box">
					<div class="money_info">배송비</div>
					<div class="money_info">2,500원</div>
				</div>
				<div class="total_box" style="font-size: 50px;">=</div>
				<div class="total_box">
					<div class="money_info">주문금액</div>
					<div class="money_info">50,000원</div>
				</div>
			</div>
		</div>


		
		<div class="coin_box">
			<div class="coin_info"><ul><li style="height: 5px;">전체합계</li></ul></div>
			<div class="coin_info">
				<ul>
					<li style="border-top: 1px solid">상품수<span>1개</span></li>
					<li>상품금액<span>20,000원</span></li>
					<li>할인금액<span>5,500원</span></li>
					<li style="border-bottom: 1px solid">배송비<span>2,500원</span></li>
				</ul>
			</div>
			<div class="coin_info">전체주문금액
				<div class="total_coin_money">55,000원</div>
			</div>
			<div class="coin_info"><button>주문하기</button></div>
		</div>


</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>