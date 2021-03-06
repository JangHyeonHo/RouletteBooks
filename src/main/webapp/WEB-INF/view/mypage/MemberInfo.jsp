<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--제목 설정-->
<title>내 정보보기</title>

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
<link href="../css/MemberInfo_content.css" rel="stylesheet" type="text/css">
<link href="../css/mypageSide.css" rel="stylesheet" type="text/css">
<link href="../css/mypageHeader.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
    <div id="contents">
     		<!-- 마이페이지 사이드 시작 -->
     <jsp:include page="../mypageSide.jsp" />
			<!-- 마이페이지 사이드 끝 -->
			
 			<!-- 마이페이지 헤더 시작 -->
     <jsp:include page="../mypageHeader.jsp" />
			<!-- 마이페이지 헤더 끝 -->

    <form:form>
        <div id="memberBaseInfo">
            <div id="baseInfoTitle">
                기본정보보기
            </div>
        <div id = "baseInfoCon">
   
        <div class = "inputBox"><span class = "sub">아이디(이메일) :</span>${dto.mEmail }</div>
        <div class = "inputBox"><span class = "sub">닉네임 :</span>${dto.mNickname }</div>
        <div class = "inputBox"><span class = "sub">이름 :</span>${dto.mName }</div>
        <div class = "inputBox"><span class = "sub">생년월일 :</span>${dto.mBirthDate }</div>
        <div class = "inputBox"><span class = "sub">성별 :</span>${dto.mGender } </div>
        <div class = "inputBox"><span class = "sub">주소 :</span>${dto.mAddress }</div>
        <div class = "inputBox"><span class = "sub">핸드폰번호 :</span>${dto.mPhone }</div>
        <div class = "inputBox"><span class = "sub">계좌은행 :</span>${dto.mAccBank }</div>
        <div class = "inputBox"><span class = "sub">계좌번호 :</span>${dto.mAccNum }</div>
        <div class = "inputBox"><span class = "sub">보유캐쉬 :</span>${dto.mCash } 원</div>
        <div class = "inputBox"><span class = "sub">보유쿠폰 :</span>아직못함</div>
        <div class = "inputBox"><span class = "sub">총 결재액 :</span>이거 없는듯?</div>
        <div class = "inputBox"><span class = "sub">가입일 :</span>${dto.mCreDate }</div>

        <input type="button" class="btn" onclick="location.href='modify?mno=${loginInfo.mNo }'" value="수정">
        <input type="button" class="btn" onclick="location.href='main'" value="메인으로">
        </div>
        </div>
    </form:form>
        
        </div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>