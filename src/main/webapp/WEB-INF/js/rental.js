$(function () {
    var mainNum = 1;
    var isSlideEnd = true;
    $("#retal_recommend_prev").on("click", function () {
        if(isSlideEnd){
            $(".rentel_recommend_list" + mainNum).hide("slide", { direction: "left" }, 300);
            isSlideEnd = false;
        }
        window.setTimeout(function(){
            if (mainNum == 1) {
            mainNum = 3;
            }
            mainNum -= 1;
            $(".rentel_recommend_list" + mainNum).delay(500).show("slide", { direction: "right" }, 300);
            isSlideEnd = true;
        },300)
            
        
        

    })
})


         
            


        
   
