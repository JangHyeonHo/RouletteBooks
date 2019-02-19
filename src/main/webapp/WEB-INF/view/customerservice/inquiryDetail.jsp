<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, dto.*" %>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>내 문의내역</title>

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
<link href="../css/MyInquiryDetail_content.css" rel="stylesheet" type="text/css">
<link href="../css/customerSide.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->



</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
    <!-- Contents -->
    <div id="contents">
     		<!-- 고객센터 사이드 시작 -->
     <jsp:include page="../customerSide.jsp" />
			<!-- 고객센터 사이드 끝 -->


        <!-- 메인 상단 -->

        <div id="mainTitle">
            내 문의내역
        </div>
        <div id = "detailCon">
       <div id = "subTitle">
	       <div class ="subLeft">
	       Q
	       </div>
	       <div class = "subKind">
	       ${dto.csKind }
	       </div>
	       <div class = "subSubject">
	       ${dto.csSubject }
	       </div>
       </div>
       
       <div id = "subCon">
     	${dto.csContent }      
       </div>
       
       <div id = "answer">
           <div class ="subLeft">
	       	A
	       </div>
	       <div class = "subKind">
	       ${dto.csKind }
	       </div>
	       <div class = "subSubject">
	       [${dto.csSubject }아아아아아아아아아아아앙아아아]아아아아
	       </div>
	       <div id = "answerCon">
	       [여기에 내용을 쓰세요]
	       </div>
	       <div id ="score">
	       	답변 만족도 :
	       	<input type="radio" value="1" name = "csscore">매우불만족
	       	<input type="radio" value="2" name = "csscore">불만족
	       	<input type="radio" value="3" name = "csscore">보통
	       	<input type="radio" value="4" name = "csscore">만족
	       	<input type="radio" value="5" name = "csscore">매우만족
	       </div>
      	<div id = "date">
      		답변 작성일 : 2018.08.08
      	</div>
       
       </div>
       	<a href = "myinquiry"> <div id = "backList">
       		◀◀목록으로
       		</div></a>
       
       	</div>
       

 
       
    </div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>