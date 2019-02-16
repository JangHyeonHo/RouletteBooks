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
<title>이벤트</title>

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
<link href="css/event_content.css" rel="stylesheet" type="text/css">
<!-- contents js설정(직접 만든 js를 여기에 올려주세요)  주석 치우고 js/이름만 바꾸면 됨.js  -->
<!-- <script src = "js/sample.js"></script> -->
   <script type="text/javascript" src="js/Winwheel.js"></script>
   <script src="http://cdnjs.cloudflare.com/ajax/libs/gsap/latest/TweenMax.min.js"></script>

</head>
<body>
<!-- Header 시작 -->
<jsp:include page="../Header.jsp" />
<!-- Header 끝 -->
<!-- Content 시작(내용 첨가) -->
<div id = "contents">
	<!-- 레이아웃 설정 -->
		<div id="event_roulette">
			<div id="envet_roulette_header">
				<h1>룰렛 이벤트 !</h1>
			</div>
			<div id="event_roulette_contents">
				<div id="roulette_image">
				      <div align="center">
           
            <table cellpadding="0" cellspacing="0" border="0">
                <tr>
                    
                        
                    
                    <td width="438" height="582" class="the_wheel" align="center" valign="center">
                        <canvas id="canvas" width="434" height="434">
                            <p style="{color: white}" align="center">Sorry, your browser doesn't support canvas. Please try another.</p>
                            
                        </canvas>
                     
                    </td>
                </tr>
            </table>
            <div class="power_controls">
                       

                
            </div>
        </div>
        <script>
            // Create new wheel object specifying the parameters at creation time.
            let theWheel = new Winwheel({
                'numSegments'  : 8,     // Specify number of segments.
                'outerRadius'  : 212,   // Set outer radius so wheel fits inside the background.
                'textFontSize' : 28,    // Set font size as desired.
                'segments'     :        // Define segments including colour and text.
                [
                   {'fillStyle' : '#eae56f', 'text' : '당첨'},
                   {'fillStyle' : '#89f26e', 'text' : '꽝'},
                   {'fillStyle' : '#7de6ef', 'text' : '당첨'},
                   {'fillStyle' : '#e7706f', 'text' : '꽝'},
                   {'fillStyle' : '#eae56f', 'text' : '당첨'},
                   {'fillStyle' : '#89f26e', 'text' : '꽝'},
                   {'fillStyle' : '#7de6ef', 'text' : '당첨'},
                   {'fillStyle' : '#e7706f', 'text' : '꽝'}
                ],
                'animation' :           // Specify the animation to use.
                {
                    'type'     : 'spinToStop',
                    'duration' : 5,     // Duration in seconds.
                    'spins'    : 8,     // Number of complete spins.
                    'callbackFinished' : alertPrize
                }
            });

            // Vars used by the code in this page to do power controls.
            let wheelPower    = 0;
            let wheelSpinning = false;

            // -------------------------------------------------------
            // Function to handle the onClick on the power buttons.
            // -------------------------------------------------------
            function powerSelected(powerLevel)
            {
                // Ensure that power can't be changed while wheel is spinning.
                if (wheelSpinning == false) {
                    // Reset all to grey incase this is not the first time the user has selected the power.
                    document.getElementById('pw1').className = "";
                    document.getElementById('pw2').className = "";
                    document.getElementById('pw3').className = "";

                    // Now light up all cells below-and-including the one selected by changing the class.
                    if (powerLevel >= 1) {
                        document.getElementById('pw1').className = "pw1";
                    }

                    if (powerLevel >= 2) {
                        document.getElementById('pw2').className = "pw2";
                    }

                    if (powerLevel >= 3) {
                        document.getElementById('pw3').className = "pw3";
                    }

                    // Set wheelPower var used when spin button is clicked.
                    wheelPower = powerLevel;

                    // Light up the spin button by changing it's source image and adding a clickable class to it.
                    document.getElementById('spin_button').src = "spin_on.png";
                    document.getElementById('spin_button').className = "clickable";
                }
            }

            // -------------------------------------------------------
            // Click handler for spin button.
            // -------------------------------------------------------
            function startSpin()
            {
                // Ensure that spinning can't be clicked again while already running.
                if (wheelSpinning == false) {
                    // Based on the power level selected adjust the number of spins for the wheel, the more times is has
                    // to rotate with the duration of the animation the quicker the wheel spins.
                    if (wheelPower == 1) {
                        theWheel.animation.spins = 3;
                    } else if (wheelPower == 2) {
                        theWheel.animation.spins = 8;
                    } else if (wheelPower == 3) {
                        theWheel.animation.spins = 15;
                    }

                    // Disable the spin button so can't click again while wheel is spinning.
                    /* document.getElementById('spin_button').src       = "spin_off.png"; */
                  

                    // Begin the spin animation by calling startAnimation on the wheel object.
                    theWheel.startAnimation();

                    // Set to true so that power can't be changed and spin button re-enabled during
                    // the current animation. The user will have to reset before spinning again.
                    wheelSpinning = true;
                }
            }

         

            // -------------------------------------------------------
            // Called when the spin animation has finished by the callback feature of the wheel because I specified callback in the parameters
            // note the indicated segment is passed in as a parmeter as 99% of the time you will want to know this to inform the user of their prize.
            // -------------------------------------------------------
            function alertPrize(indicatedSegment)
            {
                // Do basic alert of the segment text. You would probably want to do something more interesting with this information.
                alert(indicatedSegment.text);
                location.href="/roulettebooks/event";
            }
        </script>
				
				
				
				
				
				
				</div>
				<div id="roulette_chance_announce">유승재님 실버등급 남은횟수 : 3</div>
				<div id="roulette_btn"><button id="spin_button" class="roulette_btn_style" onClick="startSpin();">돌려 돌려 돌림판</button>
				</div>
			</div>
		</div>
		<div id="event_discount">
			<div id="event_discount_contents">
				<div id="event_discount_contents_header">
					<h3>이달의 할인도서</h3>
				</div>
				<div id="event_discount_contents_content">
					<!--할인도서 이미지-->
					<ul>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>
						<li>
							<div class="event_books"><img src="img/sample2.jpg">
								<div class="event_books_info">생각빵 아이 대여가 10%할인!
									대여가 1400원
								</div>
							</div>

						</li>





					</ul>
				</div>

				<div id="event_discount_contents_footer">
					해당 이벤트도서는 당사의 사정에따라 변경될수 있습니다.
				</div>
			</div>
		</div>
		<div id="event_footer">
			<div><button>◀</button>
				1 | 2 | 3
				<button>▶</button></div>
		</div>
</div>
<!-- Content 끝 -->
<!-- Footer 시작 -->
<jsp:include page="../Footer.jsp" />
<!-- Footer 끝 -->
</body>
</html>