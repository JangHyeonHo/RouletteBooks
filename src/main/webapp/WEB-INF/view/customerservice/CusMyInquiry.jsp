<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 자기가 쓸거 알아서 주석풀고 사용하기 [순서대로 form설정, spring기능 사용, c태그 사용] -->
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
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
        <!-- 레이아웃 설정 -->
        <div id="customSide">
            <div id="customSide1">
                <div class="cusSideTitle">
                    퀵 메뉴
                </div>
                <ul>
                    <li><a href="#">주문 정보</a></li>
                    <li><a href="#">배송 정보</a></li>
                    <li><a href="#">중고구매/판매문의(FAQ)</a></li>
                    <li><a href="#">쿠폰내역조회</a></li>
                    <li><a href="#">개인정보수정</a></li>
                    <li><a href="#">이벤트 당첨자 확인</a></li>
                </ul>

            </div>
            <div id="customSide2">
                <div class="cusSideTitle">
                    FAQ
                </div>
                <ul>
                    <li><a href="#">e-book</a></li>
                    <li><a href="#">중고문의</a></li>
                    <li><a href="#">결제문의</a></li>
                    <li><a href="#">배송문의</a></li>
                    <li><a href="#">회원관리</a></li>
                </ul>
            </div>
            <div id="customSide3">
                <div class="cusSideTitle">
                    1:1 문의
                </div>
                <ul>
                    <li><a href="#">내 문의글</a></li>
                    <li><a href="#">1:1 문의하기</a></li>
                </ul>
            </div>
            <div id="customSide4">
                <div class="cusSideTitle">
                    근무시간안내
                </div>
                24시간 쉬지 않습니다.<br> 24시간근무자 * 장현호 *
            </div>


        </div>
        <!-- 메인 상단 -->

        <div id="mainTitle">
            내 문의내역
        </div>
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
                    <th scope="col"><span id="del">삭제</span></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>배송</td>
                    <td id="Subj"><a href="#">배송이 안와요.</a><em>[대기중]</em></td>
                    <td>2019.02.02</td>
                    <td><button><img src="../img/문의삭제로고.PNG"></button></td>
                </tr>
            </tbody>
        </table>
    </div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>