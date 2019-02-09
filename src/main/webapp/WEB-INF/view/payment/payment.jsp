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
<title>결제</title>

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
<link href="../css/payment_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->
<script src = "../js/payment.js"></script> 

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
		<div id="payment_header">
			<div id="payment_basic_info_bar">
				<div id="payment_basic_info_name">상품명</div>
				<div id="payment_basic_info_paper">종이책 정가</div>
				<div id="payment_basic_info_rental_day">대여 일수</div>
				<div id="payment_basic_info_rental_price">대여 가격</div>
			</div>
			<div id="payment_detail">
				<div id="payment_detail_image"><img src="img/sample2.jpg"></div>
				<div id="payment_detail_name">생강빵생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵 생강빵  생강빵생강빵생강빵  아이</div>
				<div id="payment_detail_paper">15,000000원</div>
				<div id="payment_detail_rental_day">1 주일</div>
				<div id="payment_detail_rental_price">15000000000원</div>
			</div>
		</div> 
		<div id="payment_contents">
			<div id="payment_sum_price1">
				<div id="payment_sum_price_main">
					<span class="payment_name">총 상품금액</span>
					<p class="price_info"><strong>1500원</strong></p>
				</div>
				<div id="payment_minus_price">
					<span class="payment_name">할인 금액</span>
					<p class="price_info"><strong>0원</strong></p>
				</div>
				<div id="payment_bigo">정가 15,000 에서 1주일 대여가 1500원
					 대여할인 이벤트 0% 적용 </div>
				<div id="payment_coo"> 사용가능 쿠폰 1개
					<div><select>
						<option>적용하실 쿠폰을 선택해 주세요.</option>
						<option>대여 10% 할인쿠폰</option>
					</select>
				</div>
				</div>
			</div>
			<div id="payment_sum_price2">
				<div id="payment_last_price">
					<span class="payment_name">총 결제 금액</span>
					<p id="price_info_last"><strong>1500원</strong></p>
				</div>
			</div>
		</div>
		<div id="payment_footer">
			<div id="payment_pay_select">
				<div id="pay_select">
					<div class="pay_left_box">결제방식</div>
					<div class="pay_right_box">신용카드 <input type="radio" id="credit" name="pay_kind"> 무통장 입금 <input type="radio" id="emptyaccount" name="pay_kind"></div>
				<div id="pay_card_box">
					<div class="pay_left_box">카드사 선택</div>
					<div class="pay_right_box">
						<select>
							<option value="국민은행">국민은행</option>
							<option value="신한은행">신한은행</option>
							<option value="우리은행">우리은행</option>
							<option value="카카오뱅크">카카오뱅크</option>
						</select>
					</div>
					<div class="pay_left_box">카드 번호</div>
					<div class="pay_right_box">  <input type="text"  style="width: 30px" maxlength="4" id = "cardNum1">
												- <input type="text"  style="width: 30px" maxlength="4" id = "cardNum2">
												- <input type="text"  style="width: 30px" maxlength="4" id = "cardNum3">
												- <input type="password"  style="width: 30px" maxlength="4" id = "cardNum4"></div>
					<div class="pay_left_box">CVC</div>
					<div class="pay_right_box"><input type="password" style="width: 20px" maxlength="3" ></div>
					<div class="pay_left_box">카드 유효기간(월/년)</div>
					<div class="pay_right_box"><select>
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
					</select>
					<select id = "card_years">

					</select>
					</div>
					<div class="pay_left_box">카드 비밀번호</div>
					<div class="pay_right_box"><input type="password" style="width: 30px;" maxlength="2">●●</div>
				</div>
				<div id="pay_emptyaccount_box">
					<div class="pay_left_box">입금 은행</div>
					<div class="pay_right_box">
							<select>
									<option value="국민은행">국민은행</option>
									<option value="신한은행">신한은행</option>
									<option value="우리은행">우리은행</option>
									<option value="카카오뱅크">카카오뱅크</option>
							</select>
					</div>
					<div class="pay_left_box">입금자</div>
					<div class="pay_right_box"><input type="text" maxlength="3"></div>
					<div class="pay_left_box">무통장입금 안내</div>
					<div class="pay_right_box" id="pay_right_box_id">-정확한 주문 금액(원 단위까지) 입금 요망
							-주문 완료 후 7일 이내에 미입금시 주문 자동 취소
							-증권사 현금카드, 제휴카드 이체 불가
							-은행업무 시간이 아닌 경우 입금 확인이 지연될 수 있음
							  (토요일, 공휴일 등)
							-은행 수수료 부과 및 예약이체(불가) 주의
						    -해외송금 시 국민은행 가상계좌이용불가
					</div>
				</div>
					</div>
				<div id="pay_select_commit">
					<form action="#" method="post">
					<div id="commit_info"> <span style="font-size: 12px; color: #888; white-space:pre-line">주문하실 상품, 가격,할인정보 등을 확인하였으며, 
						구매에 동의하시겠습니까?</span></div>
					<div id="payment_agree" ><input name="payment_agree" type="checkbox"> <strong>동의합니다.</strong><span style="font-size: 12px;">(전자상거래법 제 8조 제2항)</span></div>
					<div id="commit_btn"><input type="image" src="img/pay.gif" name="submit"></div>
				</form>
					
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