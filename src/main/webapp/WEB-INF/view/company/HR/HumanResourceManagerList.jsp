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
		인사팀 직원 관리 시스템
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
	<link href="../../css/HRManagerList_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<script src="../../js/HumanResourceManagerList.js"></script>

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
			<h2 id="title">Roulette Books 직원 관리 페이지</h2>
			<table border="1px">
				<tr>
					<th class="seventy">사원 번호</th>
					<th class="hundthirty">사원 사진</th>
					<th class="seventy">사원 이름</th>
					<th class="seventy">사원 직책</th>
					<th class="ninety">사원 부서</th>
					<th class="hundthirty">사원 전화번호</th>
					<th class="hundthirty">사원 급여</th>
					<th class="hundthirty">비고</th>
				</tr>
				<tr>
					<td>38485094</td>
					<td><img src="img/logo.png" width="125px" height="150px"></td>
					<td>장현호</td>
					<td>
						사장<br>
						<select name="position">
							<option value="사장">사장</option>
							<option value="부장">부장</option>
							<option value="과장">과장</option>
							<option value="대리">대리</option>
							<option value="사원">사원</option>
						</select>
						<br><a href="#">[직책변경]</a></td>
					<td>
						인사팀<br>
						<select name="department">
							<option value="인사팀">인사팀</option>
							<option value="총무팀">총무팀</option>
							<option value="영업팀">영업팀</option>
							<option value="전산팀">전산팀</option>
							<option value="마케팅팀">마케팅팀</option>
						</select>
						<br>
						<a href="#">[이동]</a>
					</td>
					<td>010-4141-8421</td>
					<td>5,430,000 ￦</td>
					<td>무</td>
				</tr>
				<tr>
					<!-- 페이징 -->
					<td colspan="8">1 2 3 4 5 6 7 8</td>
				</tr>
			</table>
			<div id="searchBox">
				<select name="searchSet" id = "search">
					<option value="mNum">사원 번호로 찾기</option>
					<option value="mName">사원 이름으로 찾기</option>
					<option value="mManager">사원 직책으로 찾기</option>
					<option value="mDepartment">사원 부서로 찾기</option>
					<option value="mSalary">사원 급여로 찾기</option>
					<option value="mPhoneNum">사원 전화번호로 찾기</option>
				</select>
				<input type="text" name="query" placeholder="38402948" id = "textLine">
				<input type="submit" value="찾기">
			</div>
		</form>
	</div>
	<jsp:include page="../mfooter.jsp"/>
</body>
</html>