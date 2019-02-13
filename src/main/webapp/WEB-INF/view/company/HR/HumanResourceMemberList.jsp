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
		인사팀 일반 회원 리스트 관리 시스템
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
	<link href="../../css/body.css" rel="stylesheet" type="text/css">
	<link href="../../css/com_header.css" rel="stylesheet" type="text/css">
	<link href="../../css/com_footer.css" rel="stylesheet" type="text/css">

	<!--contents css설정(페이지에 따라 바뀌는 값)-->
	<link href="../../css/HRMemberList_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<script src="../../js/HumanResourceMemberList.js"></script>

	<style>
		
	</style>
	<c:if test="${empty managerInfo }">
	<script>
		location.href="../login"
	</script>
	</c:if>
</head>
<body>
	<jsp:include page="../mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<!-- 레이아웃 설정 -->
		<form>
			<h2 id="title">Roulette Books 회원 관리 페이지</h2>
			<table border="1px">
				<tr>
					<th class="seventy">회원 번호</th>
					<th class="hundthirty">회원 아이디<br>(이메일)</th>
					<th class="fourty">이름</th>
					<th class="seventy">닉네임</th>
					<th class="fourty">성별</th>
					<th class="seventy">가입 일자</th>
					<!-- 수정 가능(회원 등급) 불량 회원에 대한 제재 필요 -->
					<th class="seventy">회원 등급</th>
					<th class="ninety">보유 캐쉬</th>
					<th class="ninety">결제 총액</th>
					<!-- 앞자리 4개 뒷자리 4개 중간 x -->
					<th class="hundthirty">계좌 번호</th>
					<!-- 010-앞자리-별4개 -->
					<th class="ninety">핸드폰 번호</th>
					<th class="fourty">비고</th>
				</tr>
				<c:forEach items="${memberList}" var="member">
				<tr>
					<td>${member.mNo } </td>
					<td>${member.mEmail }</td>
					<td>${member.mName }</td>
					<td>${member.mNickname }</td>
					<td>${member.mGender }</td>
					<td>${member.mCreDate }</td>
					<td>${member.mGrade }</td>
					<td>${member.mCash } ￦</td>
					<td>1,100,000 ￦</td>
					<td>${member.mAccNum }</td>
					<td>${member.mPhone }</td>
					<!-- 정지 혹은 해제를 둬서 정지인 유저는 해제하게, 정지 안된 유저는 정지시키게 둠. -->
					<td><a href="#">[정지]</a><br><a href="#">[해제]</a></td>

				</tr>
				</c:forEach>
				<tr>
					<!-- 페이징 -->
					<td colspan="12">1 2 3 4 5 6 7 8</td>
				</tr>
			</table>
			<div id="searchBox">
				<select name="searchSet" id="search">
					<option value="memail">이메일(아이디)로 찾기</option>
					<option value="mname">이름으로 찾기</option>
					<option value="mnickname">닉네임으로 찾기</option>
					<option value="mgender">성별로 찾기</option>
					<option value="mcre_date">가입일자로 찾기</option>
					<option value="mgrade">회원등급으로 찾기</option>
					<option value="mcash">보유 캐쉬으로 찾기</option>
					<option value="hogu">결제 금액으로 찾기</option>
					<option value="mphone">핸드폰 번호로 찾기</option>
				</select>
				<input type="text" name="query" placeholder="example@roulette.com" id="textLine">
				<input type="submit" value="찾기">
			</div>
		</form>
	</div>
	<jsp:include page="../mfooter.jsp"/>
</body>
</html>