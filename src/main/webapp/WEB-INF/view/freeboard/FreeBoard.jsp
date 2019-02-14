<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*, dto.FreeBoard" %>
	<%List<FreeBoard> list = (List)request.getAttribute("Freeboardlist"); %> 
	
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>자유게시판</title>

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
<link href="css/FreeBoardList_content.css" rel="stylesheet"
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
		<div class="listheader">
			<div class="titlename">자유게시판</div>
			<div class="empty"></div>
			<div class="totalcount">총 162,121개</div>
			<form action="123" method="GET">
				<div class="selecttype">
					<select class="selectform"><option value="title">제목</option>
						<option value="title">작성자</option></select>
				</div>
				<div class="select">
					<input type="text" id="search1" placeholder="검색">
				</div>
				<button id="btnsearch" onclick="$"></button>
			</form>


		</div>

		<div class="freeboard">
			<div id="boardheader">
				<div class="tr">
					<div id="trno">번호</div>
					<div id="trsubject">제목</div>
					<div id="trwrite">작성자</div>
					<div id="trcount">조회수</div>
					<div id="trdate">날짜</div>
				</div>
			</div>
	
			<div id=write>
				
				<ul class="biglistwrite">
					
					<ul class="listtitle">
						<li class="listno"><%=list.get(1).getfNo() %></li>
						<li class="listsubject"><%=list.get(1).getfSubject() %></li>
						<li class="listwrite">권도완</li>
						<li class="listcount"></li>
						<li class=listdate><%=list.get(1).getfDate() %></li>
					</ul>
					
				</ul>
			</div>
			
	
				
			
			</div>
	
			<div id="pagingbox"></div>
			<div class="writego">
				<button onclick="location.href='freeboardwirte'">글작성</button>
			</div>
			<div class="pagingtotal">
				<ul>
					<li><a href="#">◀</a></li>
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
					<li><a href="#">▶</a></li>
				</ul>
			</div>

		</div>
	</div>
	<!-- Content 끝 -->
	<!-- Footer 시작 -->
	<jsp:include page="../Footer.jsp" />
	<!-- Footer 끝 -->
</body>
</html>