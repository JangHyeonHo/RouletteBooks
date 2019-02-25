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
<title>대여 상세정보</title>

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
<link href="../css/rentalDetail_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
        <!-- 레이아웃 설정 -->
        <!--헤더(책 이미지 가격정보 구매 버튼 등-->
        <div id="rental_detail_header">
            <!--책 이미지 사이즈 250x370-->
            <div id="rental_book_image">
                <img src="../img/sample2.jpg">
                <div id="rental_book_preview">
                    <button id="rental_book_preview_btn">E-Book미리보기</button>
                </div>
            </div>

            <div id="rental_book_subject">생강빵 아이</div>
            <div id="rental_book_subInfo"><span>유승재 저 / 유승채 출판 / </span><span>1999년 1월 1일</span><span>/ 판매량:0</span></div>
            <br>

            <div id="infoLeftBox">
                <div class="price"><span style="display: inline-block; position: relative; top:-5px;">정가</span><span
                        style="font-size:30px; display: inline-block; margin-left : 10px; text-decoration: 1px solid black line-through; ">200,000
                        원</span></div>
                <div class="price"><span style="display: inline-block; position: relative; top:-5px;">대여가</span><span
                        style="font-size:30px; color : red; font-weight: bold; display: inline-block; margin-left : 10px;">300
                        원</span></div>
                <div id="alertText">다운로드 받는 디지털상품이며,프린트가 불가합니다.</div>
            </div>

            <div id="rental_book_btn">
                <div id="selling">판매중</div>
                <div id="rentalDays">대여 기간
                    <select>
                        <option value="1주일">1주일</option>
                        <option value="2주일">2주일</option>
                        <option value="3주일">3주일</option>
                        <option value="1개월">1개월</option>
                        <option value="무제한">무제한</option>
                    </select>
                </div>
                <div class="btnList">
                    <button id="wish_list_btn">위시 리스트에 넣기</button>
                </div>
                <div class="btnList">
                    <button id="basket_btn" onclick="location.href='../shoppingbasket'" >장바구니 담기</button>
                </div>
                <div class="btnList">
                    <button id="sell_btn">바로 구매</button>
                </div>

            </div>
        </div>

        <!--컨텐츠 책소개 목차-->
        <div id="rental_detail_content">
            <div id="rental_detail_basicinfo">
                <div id="rental_detail_basicinfo_list">
                    <img src="img/st_info_item.gif">
                    <table>
                        <tr>
                            <td class="col1">출간일</td>
                            <td class="col2" colspan="2">1999년 1월 1일</td>
                            <td class="col2"></td>
                        </tr>
                        <tr>
                            <td class="col1">페이지수</td>
                            <td class="col2" colspan="2">370p</td>
                            <td class="col2"></td>
                        </tr>
                        <tr>
                            <td class="col1">이용안내</td>
                            <td class="col2" colspan="2">배송 없이 구매 후 바로 읽기<br> TTS 불가능 <br> 저작권 보호를 위해 인쇄 기능 제공 안함</td>
                            <td class="col2"></td>
                        </tr>
                        <tr>
                            <td class="col1">지원기기</td>
                            <td class="col2" colspan="2">아이뽕/갤륵시</td>
                            <td class="col2"></td>
                        </tr>
                        <tr>
                            <td class="col1" id="col22">파일/용량</td>
                            <td class="col2" colspan="2" id="col21">M.PDF | 33MB</td>
                            <td class="col2" id="col22"></td>
                        </tr>
                    </table>
                </div>
            </div>
            <div id="rental_detail_main_info">
                <div id="rental_detaiol_main_list">
                    <!--책소개-->
                    <div class="book_data_title"><img src="../img/bd_t05.gif"></div>
                    <div id="book_contents">
                        동시대 가장 주목받는 SF 환상문학 작가 켄 리우의 대표 단편 선집. 권위의 휴고 상, 네뷸러 상, 세계환상문학상을 40년만에 첫 동시 수상한 대표작 「종이 동물원」을
                        비롯하여 SF에서부터 환상문학, 하드보일드, 대체 역사, 전기(傳奇)소설에 이르기까지 켄 리우의 작품 세계를 한눈에 볼 수 있는 작품집이다.

                        표제작 「종이 동물원」은 어린시절, 선물 포장지를 사용해 종이 동물을 만들고 생명을 불어넣어주던 중국인 어머니와 그 아들에 관한 이야기로, 짧지만 가슴 찡한 감동으로
                        단숨에 켄 리우를 베스트셀러 작가 반열에 올린 작품이다.

                        또한 중국계 미국인인 저자의 시선에서 바라본 동북아시아의 역사적 굵직한 사건들을 SF 환상문학 장르에 녹여낸 작품들도 대거 수록되어, 국내 독자들의 정서적 공감대를 끌어낼
                        여러 단편소설을 만날 수 있다. 이 외에도 장르적 재미와 완성도를 모두 갖춘 수작들이 수록되어 있다.

                        총 14편의 중단편 소설로 구성된 &lt;종이 동물원&gt;은 2017년 권위의 로커스 상 최우수 선집상을 수상하였다. 켄 리우는 이 외에도 2015년 중국 SF 작가로는
                        처음으로 휴고 상을 수상한 류츠신의 &lt;삼체&gt;를 영어로 번역하기도 하는 등 동양과 서양의 SF 교류 역할을 하고 있다.
                    </div>
                    <!--책 목차-->
                    <div class="book_data_title"><img src="../img/bd_t06.gif"></div>
                    <div id="book_table_contents">
                        머리말 7
                        종이 동물원 11
                        천생연분 35
                        즐거운 사냥을 하길 75
                        상태 변화 111
                        파자점술사 137
                        고급 지적 생물종의 책 만들기 습성 193
                        시뮬라크럼 207
                        레귤러 225
                        상급 독자를 위한 비교 인지 그림책 307
                        파(波) 331
                        모노노아와레 371
                        태평양 횡단 터널 약사(略史) 403
                        송사와 원숭이 왕 431
                        역사에 종지부를 찍은 사람들 ⓘ 동북아시아 현대사에 관한 다큐멘터리 471
                        옮긴이의 말 561
                    </div>
                    <!--저자 ,역자 소개 -->
                    <div id="book_writer_info">
                        <div class="book_data_title"><img src="../img/writer.gif"></div>
                        <div id="book_writer_name">
                            저자 소개 : 유승재
                        </div>
                        <div id="book_writer_contents">
                            Kaya Keiichi,かや けいいち,加谷 珪一
                            도호쿠대학교 공학부 원자핵공학과를 졸업했다. 《닛케이 BP》사에 입사하여 기자로 활동했다.
                            그 뒤 노무라증권그룹의 투자 펀드 운용 회사로 이직하여 기업 평가와 투자 업무를 진행했으며, 독립한 뒤에는 중앙 부처와 국책 금융기관 등에 컨설팅을 해주었다.
                            현재 경제, 금융, 비즈니스, IT 등 다양한 분야에 걸쳐서 집필 활동을 하고 있으며, 《뉴스위크 일본판》(전자), 《현대비즈니스》 등 수많은 매체에 글을 연재하고
                            있다.
                            그는 초부유층 고객의 재무를 상담해주기도 하지만 그 자신이 억 단위의 자산을 운용하는 개인 투자가이기도 하다.
                            저서로는 『신부유층의 연구-일본경제를 바꾸는 새로운 구조』 『AI 시대에 살아남는 기업, 도태되는 기업』 『포스트 아베노믹스 시대에 돈을 증가시키는 새로운 방법』
                            『교양으로 익혀야 할 전쟁과 경제의 본질』 『부자의 교과서』 『돈은 역사로 벌어라』 등이 있다.
                        </div>
                    </div>
                    <div id="book_writer_translator">
                        역자 소개 : 유승재
                    </div>
                    <div id="book_wirter_translator_contents">
                        한국외국어대학교 사학과, 일본 다이토분카대학 일본어과를 졸업하고 동 대학원 일본어학 석사 과정을 수료했다.
                        현재 전문번역가로 활동하고 있으며, 옮긴 책으로는 『흐름이 보이는 세계사 경제 공부』
                        『하버드 실천 수업』 『인생이 바뀌는 말습관』 『심리 조작의 비밀』 『독서력』 『주거 인테리어 해부도감』 『세계 최고의 MBA는 무엇을 가르치는가』 『16배속 공부법』
                        『돈을 낳는 법칙』 등이 있다.
                    </div>
                </div>
            </div>
        </div>
        <!--한줄평-->
        <div id="rental_detail_footer">
            <form action="#" method="get">
                <div id="rental_appraisal">
                    <div id="rental_appraisal_title">한줄평(0개)</div>
                    <div id="rental_appraisal_contents">
                        <div id="appraisal_grade"> 평점
                            <select style="height:30px">
                                <option value="★★★★★">★★★★★</option>
                                <option value="★★★★☆">★★★★☆</option>
                                <option value="★★★☆☆">★★★☆☆</option>
                                <option value="★★☆☆☆">★★☆☆☆</option>
                                <option value="★☆☆☆☆">★☆☆☆☆</option>
                            </select>
                        </div>
                        <div id="appraisal_textbox">
                            <textarea name="appraisal_text" style="width: 900px; height: 50px;" maxlength="100"></textarea>
                        </div>
                        <div id="appraisal_conditions" >한글기준 100자까지 작성.</div>
                        <div id="appraisal_btn">
                            <input type="submit" value="등록">
                        </div>
                    </div>
                </div>
            </form>
            <div id="appraisal_detail_btn"> 
                
                <button>최신순</button> <button>추천순</button> 
            </div>
            <div id="appraisal_detail_contents">
                <ul>
                    <li><strong>야 이책 넘모 재밌다</strong>
                        <p class="appraisal_wirter_info">★★★★★ 유승재 | 2019-1-21 | <a href="#">추천0</a> </p>
                    </li>
                    <li><strong>야 이책 넘모 재밌다</strong>
                        <p class="appraisal_wirter_info">★★★★★ 유승재 | 2019-1-21 | <a href="#">추천0</a> </p>
                    </li>
                    <li><strong>야 이책 넘모 재밌다</strong>
                        <p class="appraisal_wirter_info">★★★★★ 유승재 | 2019-1-21 | <a href="#">추천0</a> </p>
                    </li>
                    <li><strong>야 이책 넘모 재밌다</strong>
                        <p class="appraisal_wirter_info">★★★★★ 유승재 | 2019-1-21 | <a href="#">추천0</a> </p>
                    </li>
                    <li><strong>야 이책 넘모 재밌다</strong>
                        <p class="appraisal_wirter_info">★★★★★ 유승재 | 2019-1-21 | <a href="#">추천0</a> </p>
                    </li>
                </ul>
                <div id="appraisal_prev_btn"><button>◀</button> 1 | 2 | 3 <button>▶</button></div>   

            </div>

                <div id="rental_quick_list"><a href="rental">목록보기</a></div>
        </div>

    </div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>