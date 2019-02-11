$(document).ready(function(){ 
    $('#select').click(function(){ 
        var state = $('.phoneFirst').css('display'); 
        var state1 =  $('.phoneNum').css('display'); 
        if(state && state1 == 'none'){  
            $('.phoneFirst').show(); 
            $('.phoneNum').show(); 
        }else{ 
            $('.phoneFirst').hide();   
            $('.phoneNum').hide(); 
        }
        
    });
  
});