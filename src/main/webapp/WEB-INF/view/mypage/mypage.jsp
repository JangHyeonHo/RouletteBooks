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
<title>마이페이지</title>

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
<link href="../css/body.css" rel="stylesheet" type="text/css">
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/footer.css" rel="stylesheet" type="text/css">

<!-- js 설정(기본값) -->
<script src="../js/header.js"></script>

<!-- 여기까지 노터치(변경하거나 추가하지 마시오) -->

<!-- contents css설정(직접 만든 css를 여기에 올려주세요) 주석 치우고 css/이름만 바꾸면 됨.css -->
<link href="../css/MyPage_content.css" rel="stylesheet" type="text/css">
<link href="../css/mypageSide.css" rel="stylesheet" type="text/css">
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
    		<!-- 마이페이지 사이드 시작 -->
     <jsp:include page="../mypageSide.jsp" />
			<!-- 마이페이지 사이드 끝 -->
			
        <!-- 마이페이지 메인 -->
        <div id="MyPageMain">
            <!-- 기본정보 -->
            <div id="MyPageFirst">
                <div class="MainPageTitle">
                    기본정보
                    <button type="button" class="plus" onclick="location.href='myinfoconfirm'">더보기</button>
                </div>
                <div id="myInfo">
                    <div id="myInfo1">
                        <ul>
                            <li class="mainText"><span class = "sub">아이디 :</span> 먹이를찾아헤매는하예나</li>
                            <li class="mainText"><span class = "sub">핸드폰 번호 :</span> 010-2244-4468</li>
                            <li class="mainText"><span class = "sub">주소 :</span> 사랑시 고백구 행복동 하하호 호 </li>
                        </ul>
                    </div>
                    <div id="myInfo2">
                        <ul>
                            <li class="mainText"><span class = "sub">보유 캐쉬 : </span> 200원</li>
                            <li class="mainText"><span class = "sub">보유 쿠폰 : </span> 4장</li>
                            <li class="mainText"><span class = "sub">등록 계좌 : </span> 계좌정보가 없습니다.</li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- 계좌정보 -->
            <div id="MyPageSecond">
                <div class="MainPageTitle">
                    거래정보
                    <button class="plus" onclick="location.href='ordersearch'">더보기</button>
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
                    <button type="button" class="plus" onclick="location.href='../customerservice/myinquiry'">더보기</button>
                </div>
              
                <div id="question">
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
                    <td id="Subj"><a href="<c:url value="/customerservice/detail=${list.csNo }"/>">배송이 안와요.</a><span class = "answer">${list.csSituation }</span></td>
                    <td>${list.csRegDate }</td>
                    <td><button><img src="../img/문의삭제로고.PNG"></button></td>
                </tr>
            </c:forEach>
            </tbody>
            
        </table>
        </div>
            </div>
            <!-- 대여목록 -->
            <div id="MyPageThird">
                <div id="MainPageTitle1">
                    대여목록
                <button type="button" class="plus" onclick="location.href='rentallist'">더보기</button>
                </div>
                <div id="rantalList">
                    <div class="ranList">
                        <ul>
                            <li><a href="#"><img src="../img/book4.jpg"></a></li>
                            <li><a href="#"><img src="../img/book2.jpg"></a></li>
                            <li><a href="#"><img src="../img/buybook2.jpg"></a></li>
                            <li><a href="#"><img src="../img/buybook4.jpg"></a></li>
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