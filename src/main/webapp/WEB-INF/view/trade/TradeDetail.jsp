<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>구매판매 상세페이지</title>

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
<link href="css/TradeDetail_content.css" rel="stylesheet"
	type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
	<!-- Header 시작 -->
	<jsp:include page="../Header.jsp" />
	<!-- Header 끝 -->
	<!-- Content 시작(내용 첨가) -->

	<div id="contents">
		<div class="total_info">
			<!--메인사진 1장-->
			<div class="total_img">
				<div class="total_main_img">
					<img src="<c:url value = "trade/uploadImage/${detail.tBookImage }" />">
				</div>
			</div>
			<!--제목,가격,수량,책상태,날짜-->
			<div class="total_detail">
				<div class="detail_box">
					<div id="detail_trade" class="tableBox">
						<div class="leftText">닉네임</div>
						<div class="rightText">${detail.tNickName }</div>
					</div>
					<div id="detail_no" class="tableBox">
						<div class="leftText">거래번호</div>
						<div class="rightText">${detail.tNum }</div>
					</div>
					<div id="detail_transaction" class="tableBox">
						<div class="leftText">거래 방법</div>
						<div class="rightText">${detail.tMethod }</div>
					</div>

					<div id="detail_classification" class="tableBox">
						<div class="leftText">거래명</div>
						<div class="rightText">[${detail.tKind}]${detail.tSubject }</div>
					</div>
					<div id="detail_bookname" class="tableBox">
						<div class="leftText">도서명</div>
						<div class="rightText">${detail.tBookName }</div>
					</div>
					<div id="detail_genre" class="tableBox">
						<div class="leftText">도서장르</div>
						<div class="rightText">${detail.tBookGenre }</div>
					</div>
					<div id="detail_publisher" class="tableBox">
						<div class="leftText">출판사</div>
						<div class="rightText">${detail.tPublicher }</div>
					</div>
					<div id="detail_condition" class="tableBox">
						<div class="leftText">도서 상태</div>
						<div class="rightText">${detail.tBookStatus }</div>
					</div>
					<div id="detail_price" class="tableBox">
						<div class="leftText">도서 가격</div>
						<div class="rightText">${detail.tPrice }원</div>
					</div>

					<div id="detail_currentsituation" class="tableBox">
						<div class="leftText">거래 현황</div>
						<div class="rightText">${detail.tSituation }</div>
					</div>
					<div id="detail_graded" class="tableBox">
						<div class="leftText">등급</div>
						<div class="rightText">${detail.tMemberGrade }</div>
					</div>
					<div id="detail_user_phone" class="tableBox">
						<div class="leftText">회원 전화번호</div>
						<div class="rightText">${detail.tMemberPhone }</div>
					</div>
					<div id="detail_user_email" class="tableBox">
						<div class="leftText">회원 이메일</div>
						<div class="rightText">${detail.tMemberEmail }</div>
					</div>

					<div id="detail_date" class="tableBox">
						<div class="leftText">업로드일</div>
						<div class="rightText">${detail.tRegDate }</div>

					</div>

				</div>
			</div>
		</div>

		<!--추가사진 및 게시글 내용 작성-->
		<div id="moreinformation">
			<strong>상세정보</strong>
		</div>
		<div class="detail_info">
			
			<div class="detail_img">
			<c:forEach items="${detail.tBookImageSub }" var="image">
			<img src="<c:url value = "trade/uploadImage/${image }" />">
			</c:forEach>
			</div>
		
			<div class="detailwrite">${detail.tContent }</div>
		</div>
		<div class="last_box">
			<button>구매하기</button>
			<button><a href=trade/modify?tnum=${detail.tNum }>글수정</a></button>
			<button>글삭제</button>
			<button>목록으로</button>
		</div>

	</div>

	<!-- Content 끝 -->
	<!-- Footer 시작 -->
	<jsp:include page="../Footer.jsp" />
	<!-- Footer 끝 -->
</body>
</html>