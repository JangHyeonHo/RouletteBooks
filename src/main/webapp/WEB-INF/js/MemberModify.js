    $(function(){
        $(".phoneNum").on("keyup",function(){
			 var numOnly = /^[0-9]+$/;
			 var putVal = $(".phoneNum").val();
			 console.log(putVal);
			 console.log(numOnly.test(putVal));
			 if(!numOnly.test(putVal)){
				 alert("숫자만 입력하세요.");
				 $(".phoneNum").val("");
			 }
		 });
		 $("#accountNum").on("keyup",function(){
			 var numberOnly = /^[0-9]+$/;
			 var putValue = $("#accountNum").val();
			 console.log(putValue);
			 console.log(numberOnly.test(putValue));
			 if(!numberOnly.test(putValue)){
				alert("형식에 맞게 입력하세요.");
				$("#accountNum").val("");
			 }
		 });

    })
