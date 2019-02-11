<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
   <!-- HeaderTop -->
   <div id="headerTop">
      <ul id="headerMyForm">
         <li class="greetLogin" style="display: none;"><span id="nick">닉네임</span>
            님 방문을 환영합니다.</li>
         <li class="formBtn"><a href="/roulettebooks/rblogin">로그인</a></li>
         <li class="formBtn"><a href="#">로그아웃</a></li>
         <li class="formBtn"><a href="/roulettebooks/member/signup">회원가입</a></li>
         <li class="formBtn">
            <div id="myPageBtn">
               <a href="/roulettebooks/mypage/main">마이 페이지</a>
            </div>
            <div id="myPageList">
               <ul id="myPageForm" style="display: none;">
                  <li><a href="#">수정 및 탈퇴</a></li>
                  <li><a href="#">대여 내역 보기</a></li>
                  <li><a href="#">구매 / 판매 내역 보기</a></li>
                  <li><a href="#">찜목록(마이리스트) 보기</a></li>
               </ul>
            </div>
         </li>
      </ul>

   </div>
   <!-- HeaderMid -->
   <div id="headerMid">
      <div id="logoIcon">
         <a href="/roulettebooks/main"><img src="../img/logo.png" height="100%"></a>
      </div>
      <div id="searchBox">
         <form id="searchForm">
            <select id="search">
               <option>전체 검색</option>
               <option>기타</option>
            </select> <input type="text" id="query" placeholder="찾고자 하는 책 이름을 입력해주세요">
            <input type="submit" value="찾기" id="searchBtn">
         </form>
      </div>
   </div>
   <!-- HeaderBottom -->
   <div id="headerBottom">
      <ul id="headerNav">
         <li><a href="/roulettebooks/rental">도서 대여<span style="font-size: 12px;">(Ebook)</span></a></li>
         <li><a href="/roulettebooks/tradelist">중고 도서 거래</a></li>
         <li><a href="/roulettebooks/ranking/main">랭킹</a></li>
         <li><a href="/roulettebooks/event">이벤트</a></li>
         <li><a href="/roulettebooks/customerservice/main">고객센터</a></li>
         <li><a href="/roulettebooks/freeboardlist">자유 게시판</a></li>
      </ul>
   </div>
</header>