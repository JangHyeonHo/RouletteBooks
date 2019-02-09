
    $(window).scroll(function(){
        if($(window).scrollTop() <= $("header").height()){
            $("#rental_category").css("position","relative");
        } else{
            $("#rental_category").css("position","fixed");
            $("#rental_category").css("top",0);
        }
        
    });
    