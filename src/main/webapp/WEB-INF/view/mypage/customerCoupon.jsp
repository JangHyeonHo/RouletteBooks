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
<title>쿠폰내역조회</title>

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
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
	<!-- Contents -->
	<div id="contents">
		<div id="customSide">
			<div id="customSide1">
				<div class="cusSideTitle">
					퀵 메뉴
				</div>
				<ul>
					<li><a href="#">주문 정보</a></li>
					<li><a href="#">배송 정보</a></li>
					<li><a href="#">중고구매/판매문의(FAQ)</a></li>
					<li><a href="#">쿠폰내역조회</a></li>
					<li><a href="#">개인정보수정</a></li>
					<li><a href="#">이벤트 당첨자 확인</a></li>
				</ul>

			</div>
			<div id="customSide2">
				<div class="cusSideTitle">
					FAQ
				</div>
				<ul>
					<li><a href="#">e-book</a></li>
					<li><a href="#">중고문의</a></li>
					<li><a href="#">결제문의</a></li>
					<li><a href="#">배송문의</a></li>
					<li><a href="#">회원관리</a></li>
				</ul>
			</div>
			<div id="customSide3">
				<div class="cusSideTitle">
					1:1 문의
				</div>
				<ul>
					<li><a href="#">내 문의글</a></li>
					<li><a href="#">1:1 문의하기</a></li>
				</ul>
			</div>
			<div id="customSide4">
				<div class="cusSideTitle">
					근무시간안내
				</div>
				24시간 쉬지 않습니다.<br> 24시간근무자 * 장현호 *
			</div>


		</div>


		<div id="customTop">
			<div id="coupon_header">
				<h2>쿠폰내역조회</h2>
				<div id="coupon_announce">
					<ul>
						<li>- 룰렛북스 이벤트에서 받은 쿠폰으로, 표기된 할인율만큼 대여할인 받으실 수 있습니다.</li>
						<li>- 이벤트 할인도서는 쿠폰적용 대상에 포함되지 않습니다.</li>
						<li>- 쿠폰 유효기간이 지나면 자동으로 목록에서 지워집니다. </li>
						<li>- 쿠폰에서 제시하는 사용가능 금액 이상 주문을 하셔야 해당 쿠폰을 사용하실 수 있습니다. </li>
						<li>- 쿠폰에서 별도의 적용상품을 제시하는 경우, 그 상품을 구입하지 않으시면 사용하실 수 없습니다.</li>
					</ul>
				</div>
			</div>
			<div id="coupon_contents">
				<div id="coupon_possible">
					<div id="coupon_use">
						<div id="mark">▶</div>
						<h4>사용 가능한 구폰</h4>
					</div>
					<div id="coupon_name">
						쿠폰명
					</div>
					<div id="coupon_info">
						쿠폰 내용
					</div>
					<div id="coupon_apply">
						할인율/금액
					</div>
					<div id="coupon_period">
						사용기간
					</div>
				</div>
				<div id="coupon_have">
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
					<div class="have_coupon_name">
						으아아으아아으아아
					</div>
					<div class="have_coupon_info">
						으아아
					</div>
					<div class="have_coupon_apply">
						으아아
					</div>
					<div class="have_coupon_period">
						으아아
					</div>
				</div>
			</div>
			<div id="coupon_footer">

			</div>
		</div>





	</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>