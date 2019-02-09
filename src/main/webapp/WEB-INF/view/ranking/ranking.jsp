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
<title>랭킹</title>

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
<link href="css/ranking_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
 <div id="contents">
        <div id="rankTitle">
            <h1><a href="#">Ranking</a></h1>
        </div>
        <div class="rankSide">
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
            <div class="rankSideList">
                <h3>대분류1</h3>
                <li>소분류1</li>
            </div>
        </div>
        <div id="MainTop">
            <div id="MainBestTitle">
                <div id="TitleName">
                    이달의 추천도서
                </div>
                <div id="Daily">
                    <li><a href="#"> | 룰렛북스 베스트 |</a></li>
                    <li><a href="#">| 일별 |</a></li>
                    <li><a href="#">| 주별 |</a></li>
                    <li><a href="#">| 월별 |</a></li>
                </div>
            </div>
            <div id="rankBest">
                <div id = "rightBtn" class = "slideBtn"></div>
                <div id = "leftBtn" class = "slideBtn"></div>
                <ul>
                    <li>
                        <div class="leftTop">
                            <div class="BestTitle">
                                이 돼지새1끼는 왜 대단한가?
                            </div>
                            <div class="bookPic">
                                <a href="#"><img src="img/buybook2.jpg"></a>
                            </div>
                            <div class="bookPro">
                                <p class="bookTitle"><a href="#">대단한 돼지 에스더</a></p>
                                <p class="bookCon"> 저자 : 앙기모 </p>
                                <p class="bookPrice"> 12000원</p>
                                <p class="bookCon"> 뭔가 엄청난 돼지처럼 보이지만 그냥 밥만 축내는 리얼 현실판 돼지다. </p>
                                <p class="bookCon"><a href="#">회원 리뷰 ★★</a></p>
                            </div>
                        </div>
                        <div class="rightTop">
                            <div class="BestTitle">
                                200만권 판매 돌파한 도서!!
                            </div>
                            <div class="bookPic">
                                <a href="#"><img src="img/book4.jpg"></a>
                            </div>
                            <div class="bookPro">
                                <p class="bookTitle"><a href="#">신경을 끄는 기술</a></p>
                                <p class="bookCon"> 저자 : 이원학 </p>
                                <p class="bookPrice"> 10000원</p>
                                <p class="bookCon"> 이세상에서 신경끄고 살아가는 기술을 알려준다. </p>
                                <p class="bookCon"><a href="#">회원 리뷰 ★★★★</a></p>
                            </div>
                        </div>
                    </li>
                    <li>
                       
                    </li>
                </ul>

                <div id="bookSlide">

                </div>


            </div>
            <div id="MainLow">
                <div id="lowTitle">
                    ★ 구매자 * 판매자 월별랭킹 1위~5위(10명)에게 소정의 상품을 드립니다. ★
                </div>
                <div id="rankBuyer">
                    <div class="rankerTitle">
                        구매자 TOP 10
                    </div>
                    <div id="buyerRank">
                        <table>
                            <tr>
                                <th>번호</th>
                                <th>닉네임</th>
                                <th>성별</th>
                                <th>구매횟수</th>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>앙김모El</td>
                                <td>아메바</td>
                                <td>2019</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>갓성기삼</td>
                                <td>게이</td>
                                <td>180</td>
                            </tr>
                        </table>
                    </div>
                </div>
                <div id="rankSeller">
                    <div class="rankerTitle">
                        판매자 TOP 10
                    </div>
                    <div id="sellerRank">
                        <table>
                            <tr>
                                <th>번호</th>
                                <th>닉네임</th>
                                <th>성별</th>
                                <th>판매횟수</th>
                            </tr>

                            <tr>
                                <td>1</td>
                                <td>앙김모El</td>
                                <td>아메바</td>
                                <td>2019</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>갓성기삼</td>
                                <td>게이</td>
                                <td>180</td>
                            </tr>
                        </table>
                    </div>
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