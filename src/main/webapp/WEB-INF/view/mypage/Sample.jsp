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
<title>마이페이지</title>

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
<!-- <link href="css/sample.css" rel="stylesheet" type="text/css"> -->
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">

   <!-- 마이페이지 왼쪽사이드 -->
        <div id="MyPageSide">
            <!-- 등급 -->
            <div id="MyPageSideFirst">
                <div id="MyPageSideTitle1">
                    회원등급
                </div>
                <div id="rating">
                    <img src="img/등급-골드.PNG">
                </div>
                <div id="rating1">
                    골드
                </div>
            </div>
            <!-- 회원정보 -->
            <div id="MyPageSideSecond">
                <div class="MyPageSideTitle">
                    회원정보
                </div>
                <div id="sideInfo">
                    <ul>
                        <li><a href="#">기본정보보기</a></li>
                        <li><a href="#">거래내역</a></li>
                        <li><a href="#">대여내역</a></li>
                        <li><a href="#">충전내역</a></li>
                        <li><a href="#">위시리스트</a></li>
                        <li><a href="#">장바구니</a></li>
                        <li><a href="#">회원등급정보</a></li>
                    </ul>
                </div>
            </div>
            <!-- 배송관리 -->
            <div id="MyPageSideThird">
                <div class="MyPageSideTitle">
                    배송관리
                </div>
                <div id="delivery">
                    <ul>
                        <li><a href="#">주문 및 배송정보</a></li>
                        <li><a href="#">배송지 관리</a></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>
            </div>
            <!-- 남는곳 -->
            <div id="MyPageSideFour">
                <div class="MyPageSideTitle">
                    빈공간
                </div>
                <div id="bb">
                    빈공간
                </div>
            </div>

        </div>


        <!-- 마이페이지 메인 -->
        <div id="MyPageMain">
            <!-- 기본정보 -->
            <div id="MyPageFirst">
                <div class="MainPageTitle">
                    기본정보
                    <button type="button" class="plus" onclick="location.href='#'">더보기</button>
                </div>
                <div id="myInfo">
                    <div id="myInfo1">
                        <ul>
                            <li class="mainText"><span>아이디 :</span> 먹이를찾아헤매는하예나</li>
                            <li class="mainText"><span>핸드폰 번호 :</span> 010-2244-4468</li>
                            <li class="mainText"><span>주소 :</span> 사랑시 고백구 행복동 하하호 호 </li>
                        </ul>
                    </div>
                    <div id="myInfo2">
                        <ul>
                            <li class="mainText"><span>보유 캐쉬 : </span> 200원</li>
                            <li class="mainText"><span>보유 쿠폰 : </span> 4장</li>
                            <li class="mainText"><span>등록 계좌 : </span> 계좌정보가 없습니다.</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- 계좌정보 -->
            <div id="MyPageSecond">
                <div class="MainPageTitle">
                    거래정보
                    <button class="plus" onclick="location.href='#'">더보기</button>
                </div>
                <div id="dealInfo">
                    <div id="buyInfo">
                        <div class="dealTitle">
                            구매중인 상품
                        </div>
                        <div id ="buyInfoCon">
                            <div class = "infoConTop">
                                거래정보
                                <div class = "infoConTop1">
                                    상태
                                </div>
                            </div>
                            <div class = "infoCon">
                                <div class = "infoCon1">
                                    <a href="#">샤샷갸사삿삽니다이것저것삽니다리우스가또 ?</a>
                                </div>
                                <div class = "infoCon2">배송중</div>
                            </div>
                        </div>
                    </div>
                    <div id="sellInfo">
                        <div class="dealTitle">
                            판매중인 상품
                        </div>
                        <div id = "sellInfoCon">
                            <div class = "infoConTop">
                                거래정보
                                <div class = "infoConTop1">
                                    상태
                                </div>

                            </div>
                            <div class = "infoCon">
                                <div class = "infoCon1">
                                <a href="#">ㅍ맢맢맢마ㅏㅍ맢마피ㅏ파ㅏ팦팜팜파맘팜</a>
                                </div>
                                <div class = "infoCon2">판매중</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- 1:1 문의 -->
            <div id="MyPageFour">
                <div class="MainPageTitle">
                    1:1문의
                    <button type="button" class="plus" onclick="location.href='#'">더보기</button>
                </div>
                <div id="question">
                    <span>로그인</span> 후 이용 가능합니다.<br>
                    Roulette Books 대한 모든 궁금증은 1:1 문의하기로 부담없이 확인하세요.
                    <button type="button" id="questLog" onclick="location.href='#'">로그인</button>
                </div>
            </div>
            <!-- 대여목록 -->
            <div id="MyPageThird">
                <div id="MainPageTitle1">
                    대여목록
                <button type="button" class="plus" onclick="location.href='#'">더보기</button>
                </div>
                <div id="rantalList">
                    <div class="ranList">
                        <ul>
                            <li><a href="#"><img src="img/book4.jpg"></a></li>
                            <li><a href="#"><img src="img/book2.jpg"></a></li>
                            <li><a href="#"><img src="img/buybook2.jpg"></a></li>
                            <li><a href="#"><img src="img/buybook4.jpg"></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>


</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>