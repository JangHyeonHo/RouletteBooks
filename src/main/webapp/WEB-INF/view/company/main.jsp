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
	<title>
		사원 메인페이지
	</title>
	<!-- 기본 설정 -->
	<meta name="viewport" content="width = device-width, initial-scale = 1.0, 
	maximum-scale = 1.0 minimum-scale = 1.0">
	<!-- font 설정 -->
	<link href="https://fonts.googleapis.com/css?family=Do+Hyeon" rel="stylesheet">
	<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">
	<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->
	<!--Jquery설정-->
	<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	 crossorigin="anonymous"></script>

	<!--css 설정(기본값)-->
	<link href="../css/body.css" rel="stylesheet" type="text/css">
	<link href="../css/com_header.css" rel="stylesheet" type="text/css">
	<link href="../css/com_footer.css" rel="stylesheet" type="text/css">

	<!--contents css설정(페이지에 따라 바뀌는 값)-->
	<link href="../css/comMain_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<!-- <script src="js/페이지명.js"></script> -->
	<c:if test="${empty managerInfo }">
	<script>
		location.href="login"
	</script>
	</c:if>
</head>
<body>
	<jsp:include page="mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<!-- 각 부서별 업무설정 -->
		<!-- 인사팀 박스 -->
		<form>
			<div id="HumanResourceDepartMent" class="DptBox">
				<div class="DptName">인사팀</div>
				<div class="DptUrl"><a href="hr/memberlist">일반회원 리스트 관리</a></div>
				<div class="DptUrl"><a href="hr/managerlist">관리자회원 리스트 관리</a></div>
				<div class="DptNotice">인사팀 공지사항 <span style="display:none;"><a href="#">[수정]</a></span></div>
				<div class="DptNoticeContent">인사팀 담당자 x입니다.
					인사팀 공지사항 수정은 어떻게 합니까?
					그러게여...어떻게 해야하냐.
				</div>
				<div class="NoticeHidden" style="display:none;">
					<textarea name="HRNotice" cols="100" rows="3">인사팀 담당자 x입니다.
						인사팀 공지사항 수정은 어떻게 합니까?
						그러게여...어떻게 해야하냐.</textarea>
					<div class="updateBtn"><a href="#">[수정완료]</a></div>
				</div>
			</div>
			<!-- 총무팀 박스 -->
			<div id="GeneralManagementDepartMent" class="DptBox">
				<div class="DptName">총무팀</div>
				<div class="DptUrl"><a href="#">전체 회계 관리 / 실적 분석</a></div>
				<div class="DptUrl"><a href="#">고객 환불 요청 처리 및 완료 거래 입금 처리 밑 확인</a></div>
				<div class="DptNotice">총무팀 공지사항 <span style="display:none;"><a href="#">[수정]</a></span></div>
				<div class="DptNoticeContent">공지내용</div>
				<div class="NoticeHidden" style="display:none;">
					<textarea name="GMNotice" cols="100" rows="3">공지내용</textarea>
					<div class="updateBtn"><a href="#">[수정완료]</a></div>
				</div>
			</div>
			<!-- 영업팀 박스 -->
			<div id="SalesDepartMent" class="DptBox">
				<div class="DptName">영업팀</div>
				<div class="DptUrl"><a href="sales/publisher/list">계약 출판사 등록 관리</a></div>
				<div class="DptUrl"><a href="sales/book/list">출판사 도서 등록 관리</a></div>
				<div class="DptNotice">영업팀 공지사항 <span style="display:none;"><a href="#">[수정]</a></span></div>
				<div class="DptNoticeContent">공지내용</div>
				<div class="NoticeHidden" style="display:none;">
					<textarea name="SalesNotice" cols="100" rows="3">공지내용</textarea>
					<div class="updateBtn"><a href="#">[수정완료]</a></div>
				</div>
			</div>
			<!-- 전산팀 박스 -->
			<div id="ITComputerDepartMent" class="DptBox">
				<div class="DptName">전산팀</div>
				<div class="DptUrl"><a href="#">서버 관리 이력 결재</a></div>
				<div class="DptUrl"><a href="#">일반 게시판 및 판/구매 게시판 관리</a></div>
				<div class="DptNotice">전산팀 공지사항 <span style="display:none;"><a href="#">[수정]</a></span></div>
				<div class="DptNoticeContent">공지내용</div>
				<div class="NoticeHidden" style="display:none;">
					<textarea name="ITCNotice" cols="100" rows="3">공지내용</textarea>
					<div class="updateBtn"><a href="#">[수정완료]</a></div>
				</div>
			</div>
			<!-- 마케팅팀 박스 -->
			<div id="MarketingDepartMent" class="DptBox">
				<div class="DptName">마케팅팀</div>
				<div class="DptUrl"><a href="#">이벤트 도서 관리</a></div>
				<div class="DptUrl"><a href="#">고객센터 문의 / 답변</a></div>
				<div class="DptNotice">마케팅팀 공지사항 <span style="display:none;"><a href="#">[수정]</a></span></div>
				<div class="DptNoticeContent">공지내용</div>
				<div class="NoticeHidden" style="display:none;">
					<textarea name="MDNotice" cols="100" rows="3">공지내용</textarea>
					<div class="updateBtn"><a href="#">[수정완료]</a></div>
				</div>
			</div>
		</form>
	</div>
	<jsp:include page="mfooter.jsp"/>
</body>
</html>