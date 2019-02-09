$(function(){
			var regExp = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/; 
			$("#submitBtn").on("click",function(){
				if($("#lemail").val()==""){
					alert("이메일을 입력해 주세요!");
					event.preventDefault();
				}else { 
   				if(!regExp.test($("#lemail").val())) { 
					alert("이메일 형식에 맞게 작성해주세요."); 
					$("#lemail").focus(); 
					return false; 
					} 
				}

				if($("#lpassword").val()==""){
					alert("비밀번호를 입력해 주세요!");
					event.preventDefault();
				}
				




			})
		})