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
<title>구마판매 상세페이지</title>

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
<link href="../css/TransactionDetail_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<div class="total_info">
				<!--메인사진 1장-->
				<div class="total_img">
					<div class="total_main_img"><img src="img/buybook3.jpg"></div>
				</div>
				<!--제목,가격,수량,책상태,날짜-->
				<div class="total_detail">
					<div class="detail_box">
						<div id="detail_no" class="tableBox">
							<div class="leftText">거래번호</div>
							<div class="rightText">1</div>
						</div>
	
						<div id="detail_classification" class="tableBox">
							<div class="leftText">현황</div>
							<div class="rightText">삽니다</div>
						</div>
	
						<div id="detail_genre" class="tableBox">
							<div class="leftText">카테고리</div>
							<div class="rightText">공포물</div>
						</div>
	
						<div id="detail_trade" class="tableBox">
							<div class="leftText">닉네임</div>
							<div class="rightText">경기도쓰레빠</div>
						</div>
	
	
	
						<div id="detail_publisher" class="tableBox">
							<div class="leftText">출판사</div>
							<div class="rightText">삼성</div>
						</div>
	
	
						<div id="detail_bookname" class="tableBox">
							<div class="leftText">도서명</div>
							<div class="rightText">파친코</div>
						</div>
	
	
						<div id="detail_date" class="tableBox">
							<div class="leftText">업로드일</div>
							<div class="rightText">2018.01.04</div>
	
						</div>
	
	
						<div id="detail_price" class="tableBox">
							<div class="leftText">가격</div>
							<div class="rightText">20,000원</div>
						</div>
						<div id="detail_condition" class="tableBox">
							<div class="leftText">도서상태</div>
							<div class="rightText">???</div>
						</div>
						<div id="detail_transaction" class="tableBox">
							<div class="leftText">거래방법</div>
							<div class="rightText">택배거래/직거래</div>
						</div>
						<div id="detail_currentsituation" class="tableBox">
							<div class="leftText">거래시작일</div>
							<div class="rightText">2019-02-01</div>
						</div>
					
	
	
	
					</div>
				</div>
			</div>
		

		<div class="transaction_content">
			<div class="total_user_info">
				<div class="seller_user">판매자</div>
				<div class="buyer_user">구매자</div>
			</div>
			<div class="seller_info">
				<div id="seller_name" class="info_tableBox">이름</div>
				<div id="seller_name_value" class="info_value">호날두</div>

				<div id="seller_name" class="info_tableBox addr_box1">주소</div>
				<div id="seller_name_value" class="info_value addr_box2">서울시 영등포구 카페동 213-12321211112222222s1</div>


				<div id="seller_number" class="info_tableBox">연락처</div>
				<div id="seller_number_value" class="info_value">010-1234-1234</div>
				<div id="seller_email" class="info_tableBox">이메일</div>
				<div id="seller_email_value" class="info_value">abc@never.com</div>
				<div id="seller_grade" class="info_tableBox">등급</div>
				<div id="seller_grade_value" class="info_value">다이아몬드</div>
			</div>

			<div class="buyer_info">
				<div id="buyer_name" class="info_tableBox">이름</div>
				<div id="buyer_name_value" class="info_value">메시</div>

				<div id="seller_name" class="info_tableBox addr_box1">주소</div>
				<div id="seller_name_value" class="info_value addr_box2">부산광역시 강서구 녹산산단382로14번가길 10~29번지(송정동)</div>

				<div id="buyer_number" class="info_tableBox">연락처</div>
				<div id="buyer_number_value" class="info_value">010-1234-1234</div>
				<div id="buyer_email" class="info_tableBox">이메일</div>
				<div id="buyer_email_value" class="info_value">abc@naver.com</div>
				<div id="buyer_grade" class="info_tableBox">등급</div>
				<div id="buyer_grade_value" class="info_value">골드</div>
			</div>

			<div class="transaction_notice">
				<h3>Tip</h3>
				<ol>
					<li>1. 상대방의 연락처가 다를 경우 거래를 중지 하시고 고객센터를 통해 문의 해 주시기 바랍니다.</li>
					<li>2. 거래시에는 가능하면 전화통화를 유지 하시기 바랍니다.</li>
					<li>3. 반드시 물품을 확인하기 바랍니다.</li>
				</ol>



			</div>
		</div>

		<div class="transaction_footer">
			<div class="delivery_company">
				<div class="company_title">택배회사</div>
				<div class="company_value">우체국택배</div>
			</div>

			<div class="delivery_box_date">
					<div class="delivery_date">송장등록일</div>
					<div class="delivery_date_value">2019-02-01</div>
			</div>





			<div class="delivery_number">
				<div class="delivery_title">송장번호</div>
				<div class="delivery_value">232132135423154</div>
			</div>


			<div class="deal_box">
				<div class="deal_img"><img src="img/transaction1.jpg"></div>
				<div class="deal_info">
					<h4>현재 상대방과 <span style="color: red">거래</span> 중 입니다.</h4>
				</div>
			</div>

			<div class="deal_lastbox">
				<div class="buyer_sell_box"><button>구매하기</button></div>
				<div class="listback"><button>목록으로</button></div>
			</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>