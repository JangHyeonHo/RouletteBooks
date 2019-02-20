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
		계약 출판사 관리 시스템
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
	<link href="../../../css/body.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_header.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_footer.css" rel="stylesheet" type="text/css">

	<!--contents css설정(페이지에 따라 바뀌는 값)-->
	<link href="../../../css/BCStoreList_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

	<style>
		
	</style>
	<script>
	$(function () {
		var days = new Date();
		var YYMMSS = days.getFullYear().toString() + "-" +
		((days.getMonth() + 1) < 10 ? "0"+(days.getMonth() + 1) : (days.getMonth() + 1)) + "-" + 
		(days.getDate() < 10 ? "0" + days.getDate() : days.getDate());
		$("#regi_days").html("<input type = 'hidden' value = '" + YYMMSS + "' id = 'regi_day'>" + YYMMSS);
		
		$("#contract").on("click",function(){
			var name = $('[name="change"]:checked').val()
			location.href=("./contract?pubNo=" + name);
		});
	})

	</script>
</head>
<body>
	<jsp:include page="../mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<form>
			<h2 id="title">출판사 리스트 관리</h2>
				<table border="1px">
					<tr>
						<th class="ninetyfive">출판사명</th>
						<th class="ninetyfive">출판사 전화번호</th>
						<th class="seventyfive">발행자번호</th>
						<th class="seventyfive">대표자명</th>
						<th class="ninetyfive">출판사 등록일</th>
						<th class="seventyfive">계약 시작일</th>
						<th class="seventyfive">계약 종료일</th>
						<th class="ninetyfive">계약 금액</th>
						<th class="ninetyfive">로열티</th>
						<th class="ninetyfive">계약 도서 권수</th>
						<th class="ninetyfive">출판사 계약상태</th>
						<th class="check">변경사항</th>
					</tr>
					<c:forEach items="${PublisherList }" var="publisher">
					<tr>
						<th>${publisher.pubName }</th>
						<th>${publisher.pubPhone }</th>
						<th>${publisher.pubNo }</th>
						<th>${publisher.pubCeo }</th>
						<th>${publisher.pubCreDate }</th>
						<th>${publisher.cbContractDate }</th>
						<th>${publisher.cbExpiredDate }</th>
						<th>${publisher.cbMoney }￦</th>
						<th>${publisher.cbRoyalty }￦</th>
						<th>${publisher.allBook }권</th>
						<th>${publisher.cbStatus }</th>
						<th><input type = "radio" name = "change" value = "${publisher.pubNo }"></th>
					</tr>
					</c:forEach>
					<tr>
						<!-- 페이징 -->
						<td colspan="12">1 2 3 4 5 6 7 8</td>
					</tr>
				</table>
				<div id = "btnBox">
					<button>선택한 출판사 상세정보보기</button>
					<button type = "button" id = "contract">선택한 출판사와 계약하기</button>
					<button>선택한 출판사 삭제하기</button>
					<button type = "button" onClick="location.href='regist'">새로운 출판사 등록하기</button>
					<button type = "button" onClick="location.href='regist'">현재 계약 내역 확인하기</button>
				</div>
				<div id="searchBox">
					<select name="searchSet" id="search">
						<option value="mNum">출판사명으로 찾기</option>
						<option value="mName">출판사 전화번호로 찾기</option>
						<option value="mManager">출판사 등록일로 찾기</option>
						<option value="mDepartment">출판사 대표자명으로 찾기</option>
						<option value="mSalary">출판사 발행자번호로 찾기</option>
						<option value="mPhoneNum">출판사 계약 시작일로 찾기</option>
					</select>
					<input type="text" name="query" placeholder="**출판사" id="textLine">
					<input type="submit" value="찾기">
				</div>
		</form>
		<!-- 레이아웃 설정 -->
		</div>
	<jsp:include page="../mfooter.jsp"/>
</body>
</html>