$(function(){
    //카드 연수 자동완성(현재 년기준으로 10년 단위)
    var thisYears = new Date().getFullYear();
    console.log(thisYears);
    var nextYears = "";
    for(var i = 0; i < 10; i++){
        nextYears += "<option value="+ (thisYears+i).toString().substr(2) +">" + (thisYears+i).toString().substr(2) + "</option>"
    }
    console.log(nextYears);
    $("#card_years").html(nextYears);

    $("#cardNum1").on("keyup",function(){
        if($(this).val().length == 4){
            $("#cardNum2").focus();
        }
    })
    $("#cardNum2").on("keyup",function(){
        if($(this).val().length == 4){
            $("#cardNum3").focus();
        }
    })
    $("#cardNum3").on("keyup",function(){
        if($(this).val().length == 4){
            $("#cardNum4").focus();
        }
    })


    $("#credit").on("click",function(){
        $("#pay_card_box").css("display","inline");
            $("#pay_emptyaccount_box").css("display","none");
        
    });


    $("#emptyaccount").on("click",function(){
        $("#pay_emptyaccount_box").css("display","inline");	
            $("#pay_card_box").css("display","none");			
    });

})