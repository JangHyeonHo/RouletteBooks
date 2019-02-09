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
<title>대여내역</title>

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
<link href="css/rantalList_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
	<div id="contents">
        <!-- 마이페이지 왼쪽사이드 -->
        <div id="MyPageSide">
				<!-- 등급 -->
				<div id="MyPageSideFirst">
					<div id="MyPageSideTitle1">
						회원등급
					</div>
					<div id="rating">
						<img src="img/등급-골드.PNG">
					</div>
					<div id="rating1">
						골드
					</div>
				</div>
				<!-- 회원정보 -->
				<div id="MyPageSideSecond">
					<div class="MyPageSideTitle">
						회원정보
					</div>
					<div id="sideInfo">
						<ul>
							<li><a href="#">기본정보보기</a></li>
							<li><a href="#">거래내역</a></li>
							<li><a href="#">대여내역</a></li>
							<li><a href="#">충전내역</a></li>
							<li><a href="#">위시리스트</a></li>
							<li><a href="#">장바구니</a></li>
							<li><a href="#">회원등급정보</a></li>
						</ul>
					</div>
				</div>
				<!-- 배송관리 -->
				<div id="MyPageSideThird">
					<div class="MyPageSideTitle">
						배송관리
					</div>
					<div id="delivery">
						<ul>
							<li><a href="#">주문 및 배송정보</a></li>
							<li><a href="#">배송지 관리</a></li>
							<li></li>
							<li></li>
						</ul>
					</div>
				</div>
				<!-- 남는곳 -->
				<div id="MyPageSideFour">
					<div class="MyPageSideTitle">
						빈공간
					</div>
					<div id="bb">
						빈공간
					</div>
				</div>
	
			</div>
                <!-- 대여내역 헤더 -->
                <div id = "rantalListHeader">
                   <div id = "DetailTop">
							<div id = "TopSubj">
								<div id = "MyheadLogo">
									<img src="img/마이페이지로고.PNG">
								</div>
							</div>
							<div id = "cash">
								<a href = "#">
								<div class = "ccTop">
									캐쉬 ▶
								</div>
								<div class = "ccLogo">
									<img src="img/캐시로고.PNG">
								</div>
								<div class = "ccLow">
									<span>2000000</span>원
								</div>
								</a>
							</div>
							
							<div id = "coupon">
								<a href = "#">
								<div class = "ccTop">
									쿠폰 ▶
								</div>
								<div class = "ccLogo">
									<img src="img/쿠폰로고.PNG">
								</div>
								<div class = "ccLow">
									<span>12</span>장
								</div>
								</a>
							</div>
				</div>    
			</div>
			  <!-- 헤더 끝 -->


			<div id = "rantalMain">
				<div id = "mainTitle">
					<div id = "title1">
						대여내역
					</div>
					<!-- 오른쪽 셀렉트 -->
					<div id = "title2">
						<select class = "selec">
							<option value = "1">최근 대여내역</option>
							<option value = "2">대여중</option>
						</select>
					</div>
				</div>
			
				<div id = "period">
					<div id = "periodTitle">
						기간별 조회
					</div>
					<div id = "period1">
						<ul>
							<li><a href = "#">15일</a></li>
							<li><a href = "#">1개월</a></li>
							<li><a href = "#">3개월</a></li>
							<li><a href = "#">6개월</a></li>
							<li><a href = "#">1년</a></li>
							<li><a href = "#">3년</a></li>
						</ul>
					</div>
					<div id = "period2">
						비어있음
					</div>
				</div>
				<div id = "dataTable">
					<div id = "tableMenu">
						<div id = "taNum">
							번호
						</div>
						<div id = "taCont">
							상품정보
						</div>
						<div id = "tastat">
							상태
						</div>
						<div id = "taStartDate">
							대여 시작일
						</div>
						<div id ="taEndDate">
							대여 종료일
						</div>
					</div>
					<div id = "tableList">
						<div class = "tableList1">
							<div class = "listNum">
								1
							</div>
							<div class = "listCont">
							<a href = "#">팜팜파파파파팜맢맢맢맢맢맢맢맢맢맢맢맢맢맘</a>
							</div>
							<div class = "liststat">
								기간만료
							</div>
							<div class = "listStrDate">
								2018.12.12
							</div>
							<div class = "istEndDate">
								2019.1.12
							</div>
						</div>
						대여내역이 없습니다.
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