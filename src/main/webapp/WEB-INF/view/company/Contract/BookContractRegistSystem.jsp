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
	<title>
		출판사 계약 등록
	</title>
	<!-- 기본 설정 -->
	<meta name="viewport" content="width = device-width, initial-scale = 1.0, 
	maximum-scale = 1.0 minimum-scale = 1.0">
	<!-- font 설정 -->
	<link href="https://fonts.googleapis.com/css?family=Do+Hyeon" rel="stylesheet">
	<!-- css 적용 : font-family: 'Do Hyeon', sans-serif; -->
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR" rel="stylesheet">
	<!-- css 적용 : font-family: 'Noto Sans KR', sans-serif; -->
	<!--Jquery설정-->
	<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	 crossorigin="anonymous"></script>
	 <script
  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
  crossorigin="anonymous"></script>

	<!--css 설정(기본값)-->
	<link href="../../../css/body.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_header.css" rel="stylesheet" type="text/css">
	<link href="../../../css/com_footer.css" rel="stylesheet" type="text/css">

	<!--contents css설정(페이지에 따라 바뀌는 값)-->
	<link href="../../../css/ContractRegiSys_content.css" rel="stylesheet" type="text/css">
	<!--contents js설정(페이지에 따라 바뀌는 값)-->
	<!-- <script src="../../js/HumanResourceManagerList.js"></script> -->

	<style>
		.deleteBook{
			color : blue;
		}
		.deleteBook:hover{
			color : black;
		}
	</style>
	<script>
		$(function () {
			//현재 날짜의 년을 받음
			var thisYears = new Date().getFullYear();
			var nextYears = "";
			var nextDays = "";
			var nextMonths = "";
			//현재 날로부터 -1년씩 감소해서 <option>을 만듬
			for (var i = 0; i < 30; i++) {
				nextYears += "<option value=" + (thisYears + i) + ">" + (thisYears + i) + "</option>"
			}
			//1일부터 31일까지 1씩 올려서 <option>날짜를 만듬
			for (var i = 1; i <= 31; i++) {
				var zeroSum = i < 10 ? "0" + i : i;
				nextDays += "<option value=" + i + ">" + zeroSum + "</option>"
			}
			for (var i = 1; i <= 12; i++) {
				var zeroSum = i < 10 ? "0" + i : i;
				nextMonths += "<option value=" + i + ">" + zeroSum + "</option>"
			}
			//year박스와 day박스에 넣어줌
			$(".years").html(nextYears);
			$(".months").html(nextMonths);
			$(".days").html(nextDays);

			//month를 change->바꿨을 때 즉 month박스의 값을 바꿨을 때 실행함
			$("#creMonths").on("change", function () {
				var monthval = $(this).val();
				var daysStack;
				var changeDays = "";
				console.log(monthval);
				switch (monthval) {
					case "1":
					case "3":
					case "5":
					case "7":
					case "8":
					case "10":
					case "12":
						daysStack = 31;
						break;
					case "2":
						daysStack = 29;
						break;
					default:
						daysStack = 30;
						break;
				}
				for (var i = 1; i <= daysStack; i++) {
					var zeroSum = i < 10 ? "0" + i : i;
					changeDays += "<option value=" + i + ">" + zeroSum + "</option>"
				}
				$("#creDays").html(changeDays);
			})
			$("#endMonths").on("change", function () {
				var monthval = $(this).val();
				var daysStack;
				var changeDays = "";
				console.log(monthval);
				switch (monthval) {
					case "1":
					case "3":
					case "5":
					case "7":
					case "8":
					case "10":
					case "12":
						daysStack = 31;
						break;
					case "2":
						daysStack = 29;
						break;
					default:
						daysStack = 30;
						break;
				}
				for (var i = 1; i <= daysStack; i++) {
					var zeroSum = i < 10 ? "0" + i : i;
					changeDays += "<option value=" + i + ">" + zeroSum + "</option>"
				}
				$("#endDays").html(changeDays);
				
			})
			$("#bookSign").on("click",function(){
				$("#bookHideBox").toggle("scale",{direction : "both", origin : ["bottom", "right"]},300);
			});
			
			$("#close").on("click",function(){
				$("#bookName").val("");
				$("#bookPrice").val("");
				$("#contractPrice").val("");
				$("#bookHideBox").hide("scale",{direction : "both", origin : ["bottom", "right"]},300);
			});
			
			$("#bookRegist").on("click",function(){
				if($("#bookName").val().length == 0){
					alert("책 이름을 입력해 주세요");
					return false;
				}
				if($("#bookPrice").val() == 0){
					alert("도서 정가액을 입력해 주세요");
					return false;
				}
				if($("#contractPrice").val() == 0){
					alert("도서 계약 금액을 입력해 주세요");
					return false;
				}
				
				alert("가등록 완료");
				var number = $('.bookNum').last().html();
				console.log(number);
				if(!number){
					number = 0;
				}
				number++;
				var AppText = "<tr><td class = 'bookNum'>"+number+"</td><input type = 'hidden' name = 'bookNumber' value = '"+number+"'><td>"
				+$("#bookName").val()+"<input type = 'hidden' name = 'bookName' value = '"+$("#bookName").val()+"'></td><td>"
				+$("#bookPrice").val()+"￦<input type = 'hidden' name = 'bookPrice' value = '"+$("#bookPrice").val()+"'></td><td><span class = 'contPrice'>"
				+$("#contractPrice").val()+"</span>￦<input type = 'hidden' name = 'contractPrice' value = '"+$("#contractPrice").val()+"'></td><td><input type = 'checkbox' class = 'deletecheck' value = '"+number+"'></td></tr>"
				$("#allPrice").before(AppText);
				var AllMoney = $('.contPrice').get();
				/* console.log(AllMoney[0]); */
				var TotalMoney = 0;
				for(var i = 0; i < AllMoney.length; i++){
					TotalMoney+=Number(AllMoney[i].innerHTML);
				}
				$("#totalMoney").html(TotalMoney);
				$("#bookName").val("");
				$("#bookPrice").val("");
				$("#contractPrice").val("");
				
				
			});
			$("#del_book_btn").on("click",function(){
				var checkedValue = $(".deletecheck:checked").get();
				for(var i = 0; i < checkedValue.length ; i++){
					var checkedbookNum = $(".bookNum").get();
					/* console.log(checkedValue[i].value); */
					for(var j = 0; j<checkedbookNum.length; j++){
						/* console.log(checkedbookNum[j].innerHTML); */
						if(checkedValue[i].value==checkedbookNum[j].innerHTML){
							$(".bookNum").get(j).closest('tr').remove();
						}
						
					}
					
				}
				var AllMoney = $('.contPrice').get();
				var TotalMoney = 0;
				for(var i = 0; i < AllMoney.length; i++){
					TotalMoney+=Number(AllMoney[i].innerHTML);
				}
				$("#totalMoney").html(TotalMoney);
				
				
			})

		});

	</script>
</head>
<body>
	<jsp:include page="../mheader.jsp"/>
	<!-- Contents -->
	<div id="contents">
		<div id="formWriting">
			<form:form>
				<h2 id="title">출판사 계약 등록</h2>
				<div class="textBox">계약 번호</div>
				<div class="valueBox"><input type="hidden" name = "consNum" value="${contractDetail.cbNum }">${contractDetail.cbNum }</div>
				<div class="textBox">출판사명</div>
				<div class="valueBox"><input type="hidden" name = "consName" value="${contractDetail.pubNo }">${contractDetail.pubName }</div>
				<div class="textBox">계약 체결일</div>
				<c:if test="${empty contractDetail.cbContractDate }">
				<div class="daysformBox">
					<select class="years" name="consYears">

					</select>년
					<select class="months" name="consMonths" id="creMonths">

					</select>월
					<select class="days" name="consDays" id="creDays">

					</select>일
				</div>
				<div class="textBox">계약 종료일</div>
				<div class="daysformBox">
					<select class="years" name="expYears">

					</select>년
					<select class="months" name="expMonths" id="endMonths">

					</select>월
					<select class="days" name="expDays" id="endDays">

					</select>일
				</div>
				</c:if>
				<div class="textBox">계약 도서 목록</div>
				<div id="tableBox">
					<table border="1px" id = "booktable">
						<tr>
							<th>
								번호
							</th>
							<th>
								도서명
							</th>
							<th>
								도서 정가
							</th>
							<th>
								계약 금액
							</th>
							<th  style = "width : 50px">취소</th>
						</tr>
						<tr id = "allPrice">
							<th colspan="3">총 계약 금액</th>
							<td colspan="1"><span id = "totalMoney">0</span>￦</td>
							<td colspan="1"><button type = "button" id = "del_book_btn">취소</button></td>
						</tr>
					</table>
					<div id = "bookHideBox" style="display:none;">
						<h3>도서 가등록</h3>
							<div class = "popUpBox"><span>도서명</span><input type = "text" id = "bookName"></div>
							<div class = "popUpBox"><span>정가</span><input type = "number" step = "100" id = "bookPrice" min="0" >￦</div>
							<div class = "popUpBox"><span>계약 금액</span><input type = "number" step = "1000" id = "contractPrice" min="0" >￦</div>
							<div class = "btnBox"><input type = "button" value = "도서 가등록" id = "bookRegist"><input type = "button" value = "닫기" id = "close"></div>
						</div>
				</div>
				<input type="button" value="계약할 도서 가등록하기" id = "bookSign">
				<div class="alertBox">※현재 선택하신 도서는 가 등록 상태입니다.<br>사이트에 제대로 등록하시려면 별도의 등록 절차를 걸치세요</div>
				<div class="textBox">로열티</div>
				<input type="number" name="royalty" min="0" step="1000" value = "${contractDetail.cbRoyalty }">￦
				<div class="btnBox"><input type="submit" value="계약하기"><input type="reset" value="다시 작성하기"></div>
			</form:form>
		</div>
		<!-- 레이아웃 설정 -->
	</div>
	<jsp:include page="../mfooter.jsp"/>
</body>
</html>