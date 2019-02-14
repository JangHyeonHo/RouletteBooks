<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>중고거래글쓰기</title>

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
<link href="../css/tradeBoardWrite_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->
	<script src = "../js/tradeboardwrite.js"></script>
<c:if test="${empty loginInfo }">
<script>
alert("잘못된 접근 입니다.")
location.href="../main"
</script>
</c:if>
</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->

	<form:form method="post" enctype="multipart/form-data">
		<div id="contents">

			<div id="trade_board_header">
				<div id="trade_board_title">
					<input type="hidden" name="trade_board_nick_name" 
					 value="${loginInfo.mNo }">
					 <div id="trade_nick_name" class="trade_board_class" style="width: 200px; height: 25px;">작성자 : <span style="color:darkred"> ${loginInfo.mNickname }</span></div>
				
					<select id="trade_subject_head" name="trade_board_horsehead" class="trade_board_class" style="width:100px; height:30px;">
						<option>말머리선택</option>
						<option value="삽니다">삽니다.</option>
						<option value="팝니다">팝니다.</option>
					</select>
					<input type="text" id="trade_subject" class="trade_board_class" name="trade_board_subject" style="width: 800px; height: 25px;"
					 placeholder="제목을 입력해 주세요.">
				</div>

			</div>
			<div id="trade_board_contents">
				<div id="tarde_delivery_kind">
					<select class="trade_board_class" name="trade_method">
						<option>거래방법</option>
						<option value="택배거래">택배거래</option>
						<option vlaue="직거래">직거래</option>
					</select>
				</div>
				<div id="trade_book_genre">
					<select class="trade_board_class" name="trade_genre">
						<option value="도서장르선택">도서장르선택</option>
						<option value="문화/역사">문화/역사</option>
						<option value="유아/어린이/청소년">유아/어린이/청소년</option>
						<option value="참고서/자격증">참고서/자격증</option>
						<option value="자연과학/IT">자연과학/IT</option>
						<option value="예술/인물">예술/인물</option>
						<option value="여행/잡지/취미">여행/잡지/취미</option>
						<option value="사회/정치/경제/경영">사회/정치/경제/경영</option>
						<option value="만화/라이트노벨">만화/라이트노벨</option>
						<option value="기타">기타</option>
					</select>
				</div>

				<div id="trade_book_name">
					<input type="text" name="trade_book_name"class="trade_board_class" placeholder="도서명">
				</div>
				<div id="trade_book_publisher">
					<input type="text" name="trade_book_publisher" class="trade_board_class" placeholder="출판사명">
				</div>
				<div id="trade_book_price">
					<input type="number" step=1000 min=0 name="trade_book_price" class="trade_board_class" placeholder="희망 도서가격">
				</div>
				<div id="trade_book_status">
					<select class="trade_board_class" name="trade_book_status">
						<option>도서상태</option>
						<option value="A급">A급(찢어짐,구겨짐 없음)</option>
						<option value="B급">B급(찢어짐,구겨짐 중 하나 존재)</option>
						<option value="C급">C급(찢어짐,구겨짐 둘다 존재)</option>
						<option value="D급">D급(찢어짐,구겨짐 둘다 존재 하고 파본됨)</option>
					</select>
				</div>
				<div id="trade_book_image" class="trade_board_class">
					 
					<div id="files"> 
					<input type="file" name="trade_book_img" class="file" multiple="multiple" accept="image/*">
		
					
					
					</div>
					 
					 
					 <div id="image_announce">
					 ※이미지는 jpg,png,gif 확장자로 총 5장까지 업로드 가능합니다. 
					 ※도서 상태확인이 가능한 사진을 첨부해 주세요.</div>
				</div>
			</div>
			<div id="trade_board_footer">
				<div id="board_textarea">
				<textarea name="textarea" style="margin:0 20px; width:1035px; height:500px;" placeholder="책 구입시기, 구입가등 중고구매,판매에 필요한 상세정보를 기입해주세요."></textarea>
				</div>
				<div id="trade_board_btn">
					<input type="submit" value="등록" style="width:100px; height:50px; background: #4a57a8; border-color: #3c4790; color: #fff;">
					<input type="reset" value="취소" style="width:100px; height:50px; background: #4a57a8; border-color: #3c4790; color: #fff;" >
				</div>
			</div>


		</div>
	</form:form>>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>