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
<title>샘플(변경하세요)</title>

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
	<link href="../css/mypageSide.css" rel="stylesheet" type="text/css">
	<link href="../css/mypageHeader.css" rel="stylesheet" type="text/css">
	<link href="../css/mypagedeliveryinfo_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">

<jsp:include page="../mypageSide.jsp" />

<jsp:include page="../mypageHeader.jsp" />


 

		<div id="orderinfo">
			<h3 style="border-bottom:1px solid black;">주문 및 배송정보</h3>
			<div id="orderinfo_header">
				<div id="order_announce">중고매장에서 회원으로 구매한 내역을 조회하실 수 있습니다.</div>
				<form action="#" method="GET">
					<div id="order_search">
						<div id="order_search_content">
							<select>
								<option value="2019">2019</option>
								<option value="2018">2018</option>
							</select>년
							<select>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>월
							이전

							<select>
								<option value="2019">2019</option>
								<option value="2018">2018</option>
							</select>년
							<select>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>월
							까지 <input type="submit" value="조회" id="order_search_btn">
						</div>
					</div>
				</form>
			</div>
			<div id="orderinfo_content">
				<div id="orderinfo_listbar">
					<div id="order_num">
						거래번호
					</div>


					<div id="order_content">
						거래 내용
					</div>
					<div id="order_pay">
						거래 금액
					</div>

					<div id="order_regdate">
						거래 일자
					</div>
					<div id="order_delinum">
						송장 번호
					</div>
					<div id="order_have">
						<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
							<!--시작-->
						<a href="#"><div class="have_order_num">
								으아아으아아으아아
							</div>
						</a>
						<div class="have_order_content">
							으아아
						</div>
						<div class="have_order_pay">
							으아아
						</div>
						<div class="have_order_regdate">
							으아아
						</div>
						<div class="have_order_delinum">
							으아아
						</div>
						<!--끝-->
	
					</div>
				</div>		
			</div>
			<div id="orderinfo_footer">
					- 중고매장에서 회원으로 구매완료한 내역입니다.
					- 거래번호를 클릭하시면 주문상세내역을 확인하실 수 있습니다. 
			</div>
		</div>
</body>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>