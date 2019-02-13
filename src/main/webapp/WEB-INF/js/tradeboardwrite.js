$(function(){



	$(".file").on("change",function(){
		console.log($(this).get(0).files.length);
		if($(this).get(0).files.length > 5 ){
			alert("이미지는 총 5개만 등록가능 합니다.");
			$(this).val("");
		}
		for(var i=0 ; i<$(this).get(0).files.length; i++){
		var fileName = $(this).get(0).files[i].name;
		
		fileName = fileName.substring($(this).get(0).files[i].name.lastIndexOf("."))
		console.log(fileName);
		
		if(fileName.toLowerCase() != ".jpg" && fileName.toLowerCase() != ".png" && fileName.toLowerCase() != ".gif"){
			alert("이미지의 확장자는 jpg png gif만 등록 가능합니다");
			$(this).val("");
			return false;
		}
		
		}
			


	})



})