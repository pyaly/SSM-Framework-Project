$(document).ready(function (){
	
		var id=1;
				$.ajax({
					type : "post",
					contentType : "application/x-www-form-urlencoded;charset=UTF-8",
					url : '/postDoctors/userController/selectUserById.do',
					async : false,
					data : {
						id:id
					},
					dataType : 'json',
					success : function(msg) {
						if(msg.result ==true){						
							alert(45465);
						}else{
							alert(msg.message);
						}
					},error: function(msg){
					    alert("网络超时！");
					}
				});
});
