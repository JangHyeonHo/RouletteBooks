<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*,dto.TBoard"  %>
	<% List <TBoard> list =(List)request.getAttribute("tboardlist"); %>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>구매판매게시판</title>

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
 <link href="css/Trade_content.css" rel="stylesheet" type="text/css">
 <link href="css/category.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<script src = "js/category.js"></script> 

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
<div id="sidebar">
			<jsp:include page="../category.jsp" />

		</div>
		<div id="mainContent">
			<!--중고 도서 게시판-->
			<div id="mainbuy">
				<div id = "bestPeople">우수 판매/구매 회원 판매중인 책</div>
				<a href="tradedetail"><div class="tradebox1">
					<div class=best_people_img><img src="img/book1.jpg"></div>
					<div class=best_people_book_name>책걷기</div>
				</div></a>
				<a href="tradedetail"><div class="tradebox1">
					<div class=best_people_img><img src="img/book2.jpg"></div>
					<div class=best_people_book_name>오버라는남자</div>
				</div></a>
				<a href="tradedetail"><div class="tradebox1">
					<div class=best_people_img><img src="img/book3.jpg"></div>
					<div class=best_people_book_name>인생은 수리가 됩니다</div>
				</div></a>
				<a href="tradedetail"><div class="tradebox1">
					<div class=best_people_img><img src="img/book4.jpg"></div>
					<div class=best_people_book_name>신경끄기의기술</div>
				</div></a>
			</div>

			<div id="tradelist">
				<div id="tradeContents">
					<div id=tradeContentsNo>번호</div>
					<div id="tradeContentsImg">메인사진</div>
					<div id="tradeContentsInfo">내용</div>
					<div id="tradeContentsPrice">가격</div>
				</div>
				<c:forEach items="${ tboardlist}" var="tlist">
				<div class="tradewrite">
					<a href=trade/detail?tnum=${tlist.tNum }"><div class="tradebookinfo">
						<div class="buyno">${tlist.tNum }</div>
						<div class="picture"><img src="<c:url value = "trade/uploadImage/${tlist.tBookStoreImgName }" />"></div>
						<div class="idsellbuy">
							<div class="idinfo">닉네임: ${tlist.tNickName }</div>
							<div class="sell">${tlist.tKind }</div>
						</div>
					</div></a>
					<div class="tradetitle">
						<a href="trade/detail?tnum=${tlist.tNum }""><div class="tradesubject">${tlist.tSubject }</div></a>
						<div class="tradeinfo">${tlist.tContent }</div>
						<div class="uploaddate">${tlist.tRegDate }</div>
					
					
					</div>
					<div class="tradepricebox"><strong>${ tlist.tPrice}원</strong></div>
					<div class="tradewaiting">${tlist.tSituation}</div>
					<div class="bookscore">${tlist.tBookStatus}</div>
				</div>
				</c:forEach>
				
				
			</div>
					<div class="listwrite"><button onclick="location='trade/boardwrite'">글 작성</button></div>
					
					<div class="Paging"><c:forEach begin="${page.startPage }" end="${page.endPage }" step="1" var="i"><a href="?page=${i }">${i }</a>　</c:forEach></div>
					
					</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>