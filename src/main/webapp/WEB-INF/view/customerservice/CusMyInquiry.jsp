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
<link href="../css/CusMyInquiry_content.css" rel="stylesheet" type="text/css">
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
    <!-- Contents -->
    <div id="contents">
     		<!-- 고객센터 사이드 시작 -->
     <jsp:include page="../customerSide.jsp" />
			<!-- 고객센터 사이드 끝 -->


        <!-- 메인 상단 -->

        <div id="mainTitle">
            내 문의내역
        </div>
        <c:if test="${!empty List }">
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
                    <td class="Subj">
                    <a href="<c:url value="/customerservice/detail=${list.csNo }"/>">${list.csSubject }</a>
                    <span class = "answer">${list.csSituation }</span></td>
                    <td>${list.csRegDate }</td>
                    <td><button class = "deleteBtn" value = "${list.csNo }"><img src="../img/문의삭제로고.PNG"></button></td>
                </tr>
            </c:forEach>

            </tbody>
        </table>
<script> 
$(function(){
	$('.deleteBtn').click(function(){
		if(confirm("삭제 후 복구할 수 없습니다.정말로 삭제하시겠습니까?")){
			self.location.href = "./delete?listcsNo=" + $(this).val();
		}
	});
});
        
        
</script>
        <div id = "pasingNum">
        	<span class = "pagebtn">이전</span>
        	<em>1</em>
        	<span class = "pagebtn">다음</span>
        </div> 
        </c:if>
    </div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>