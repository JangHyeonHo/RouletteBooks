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
<title>문의하기</title>

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
<link href="../css/inquiryWriter_content.css" rel="stylesheet" type="text/css">
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

    <div id="contents">
    
     		<!-- 고객센터 사이드 시작 -->
     <jsp:include page="../customerSide.jsp" />
			<!-- 고객센터 사이드 끝 -->
        <!-- 메인 상단 -->

        <div id="mainTitle">
            <div id = "Title">
            문의하기
            </div>
            <div id ="mainTitleSide">
                    <ul>
                        <li>-<span class="ess">(필수)</span> 항목은 반드시 입력해주셔야 문의 접수가 가능합니다.</li>
                        <li>- 적어주신 정보는 문의처리를 위한 용도로만 이용됩니다.</li>
                        <li>- 비속어 , 성희롱 발언은 자제해주시길 바랍니다.</li>
                    </ul>
            </div>
        </div>
    <form:form action=""  method="post" >
        <div class = "conBox">
                <div class ="label">답변 받을 이메일<span class = "ess">(필수)</span></div>
            <div class = "inputBox">
            <input type="text" class = "tBox" id = "emailid" name="emailid">@<input type="text" class = "tBox" id = "emailpath" name="emailpath">
            </div>
        </div>
        <div class = "conBox">
                <div class ="label">문의 분류<span class = "ess">(필수)</span></div>
            <div class = "inputBox">
                <select name="kind" class = "tBox" name="kind">
					<option value="구매/판매">구매/판매</option>
					<option value="대여">대여</option>
					<option value="결제/취소">결제/취소</option>
					<option value="이벤트">이벤트</option>
                    <option value="회원정보">회원정보</option>
					<option value="기타">기타</option>
                </select>
            </div>    
        </div>
        <div class = "conBox">
                <div class ="label">제목<span class = "ess">(필수)</span></div>
            <div class = "inputBox">
                <input type="text" class = "tBox" id="subject" name = "subject">
            </div>    
        </div>
        <div id = "conBox">
                <div class ="label">내용<span class = "ess">(필수)</span></div>
            <div class = "inputBox">
            <textarea id="content" name = "content"></textarea>
            </div>
        </div>

        <div id = "infoagree">
            <div id = "agreeTitle">
                개인정보 수집●이용에 대한 안내
            </div>
            <div id = "agreeCon">
                <p class="al_text">문의 접수와 처리, 회신을 위한 최소한의 개인정보입니다. 동의를 필요로 합니다.</p>
                <div id = "agreeCheck">
                <input type="checkbox" id = "mailAgree" name="mailAgree" value="동의">
                <label>이메일 정보 수집 동의<span class="ess">(필수)</span></label>
                <input type="button" value="전문보기">
                </div>
                <div id = "infoAgreeCon">
                    <p class = "al_text"><h4>이메일 주소 수집 동의 (필수)</h4>
                            [1:1 문의하기]를 이용하여 고객상담을 하는 경우 다음과 같은 개인정보를 수집하고 있습니다.<br>
                            <br>
                            1) 개인정보 수집 및 이용 목적<br>
                            회원서비스 이용에 따른 본인확인, 불만 및 오류 해결 등 민원처리 결과 회신<br>
                            2) 수집하는 개인정보 항목<br>
                            필수 항목 : 이메일 주소<br>
                            3) 보유 및 이용 기간<br>
                            불만 및 오류 해결 등 문의 처리 후 3년</p>
                </div>
            </div>
        </div>
        
        <input type="submit" id = "btn" value="문의하기">
    </form:form>
    </div>

</body>
</html>