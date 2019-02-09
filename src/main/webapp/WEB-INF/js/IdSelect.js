$(document).ready(function(){ 
    $('#select').click(function(){ 
        var state = $('.phoneok').css('display'); 
        if(state == 'none'){  
            $('.phoneok').show(); 
        }else{ 
            $('.phoneok').hide();         
        }
    });
});