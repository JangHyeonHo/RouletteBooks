<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>고객센터</title>

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
<link href="../css/body.css" rel="stylesheet" type="text/css">
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src="../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="../css/CustomerService_content.css" rel="stylesheet"
	type="text/css">
<link href="../css/customerSide.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

<c:if test="${empty loginInfo }">
<script>
alert("로그인이 필요합니다.")
location.href="../member/login"
</script>
</c:if>

</head>
<body>
	<!-- Header 시작 -->
	<jsp:include page="../Header.jsp" />
	<!-- Header 끝 -->
	<!-- Content 시작(내용 첨가) -->
	<div id="contents">

		<!-- 고객센터 사이드 시작 -->
		<jsp:include page="../customerSide.jsp" />
		<!-- 고객센터 사이드 끝 -->
		<div id="customTop">
			<div class="TopBox">
				<a href="../mypage/rentallist">
					<div class="BoxImage">
						<img src="../img/대여.PNG">
					</div>
					<div class="TopBoxTitle">대여 정보 확인하기</div>
					<div class="TopBoxCon">대여 정보를 바로 확인하실 수 있습니다.</div>
				</a>
			</div>
			<div class="TopBox">
				<a href="#">
					<div class="BoxImage">
						<img src="../img/cashInfo.jpg">
					</div>
					<div class="TopBoxTitle">충전내역 확인하기</div>
					<div class="TopBoxCon">캐쉬정보를 바로 확인하실 수 있습니다.</div>
				</a>
			</div>
			<div class="TopBox">
				<a href="../rental">
					<div class="BoxImage">
						<img src="../img/eBook.PNG">
					</div>
					<div class="TopBoxTitle">대여 하고싶은 e-book 정보 보러가기</div>
					<div class="TopBoxCon">다양한 e-book 을 즐기실 수 있습니다.</div>
				</a>
			</div>
			<div class="TopBox">
				<a href="../tradelist">
					<div class="BoxImage">
						<img src="../img/중고.PNG">
					</div>
					<div class="TopBoxTitle">거래(중고) 바로가기</div>
					<div class="TopBoxCon">원하는 도서(중고)를 구매하실 수 있습니다.</div>
				</a>
			</div>
			<div class="TopBox">
				<a href="../event">
					<div class="BoxImage">
						<img src="../img/이벤트.PNG">
					</div>
					<div class="TopBoxTitle">진행중인 이벤트 확인하기</div>
					<div class="TopBoxCon">다양한 이벤트와 당첨결과를 확인하실 수 있습니다.</div>
				</a>
			</div>
			<div class="TopBox">
				<a href="../mypage/myinfoconfirm">
					<div class="BoxImage">
						<img src="../img/회원정보.PNG">
					</div>
					<div class="TopBoxTitle">회원정보 바로가기</div>
					<div class="TopBoxCon">회원정보 확인/변경/탈퇴 등 개인정보를 관리하실 수 있습니다.</div>
				</a>
			</div>

		</div>
		<div id="customMid">

			<div class="customTitle">1:1 문의</div>
			<c:choose>
			<c:when test="${empty loginInfo }">
			<div id="customMidCon">
				로그인 후 이용 가능합니다.<br> Roulette Books 대한 모든 궁금증은 1:1 문의하기로 부담없이
				확인하세요.
				<button type="button" onclick="location.href='../member/login'">로그인</button>
				
			</div>
			</c:when>
			<c:otherwise>

			<div id="customMidCon">
			 <table id="inquiryTable">
            <colgroup>
                <col width="12%">
                <col width="18%">
                <col width="45%">
                <col width="20%">
                <col width="5%">
            </colgroup>
            <thead>
                <tr>
                    <th scope="col">접수번호</th>
                    <th scope="col">분류</th>
                    <th scope="col">제목</th>
                    <th scope="col">날짜</th>
                    <th scope="col"><span id="del"></span></th>
                </tr>
            </thead>
            <tbody>
            
        	<c:forEach items="${List }" var="list">	
                <tr>
                    <td>${list.csNo }</td>
                    <td>${list.csKind }</td>
                    <td id="Subj"><a href="<c:url value="/customerservice/detail=${list.csNo }"/>">배송이 안와요.</a><span class = "answer">${list.csSituation }</span></td>
                    <td>${list.csRegDate }</td>
                    <td><button><img src="../img/문의삭제로고.PNG"></button></td>
                </tr>       
            </c:forEach>
            	
            </tbody>
        </table>
        <div id = "plus"><a href = "myinquiry" id = "plus">[더보기]</a></div>
        
        </div>
			</c:otherwise>
			</c:choose>
		</div>
			
		<div id="customLow">
			<div class="customTitle">FAQ Top 10</div>
			<div class="FAQTop10">
				<ul>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">7</a></li>
					<li><a href="#">8</a></li>
					<li><a href="#">9</a></li>
					<li><a href="#">10</a></li>
				</ul>
			</div>
			<div class="FAQTop10">2</div>

		</div>


	</div>
	<!-- Content 끝 -->
	<!-- Footer 시작 -->
	<jsp:include page="../Footer.jsp" />
	<!-- Footer 끝 -->
</body>
</html>