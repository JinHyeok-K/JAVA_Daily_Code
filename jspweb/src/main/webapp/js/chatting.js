function gochatting(){
	//alert("abcd")
	let ninkname = $("#ninkname").val();
	let chatting = $("#chatting").val();
	$.ajax({
		url: "Chat" ,
		data: { "ninkname":ninkname , "chatting" : chatting  } ,
		success : function( result ){
			if( result == 1 ){
			 
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
	
			}
			else{ alert("댓글작성이 실패했습니다."); }
		}
	});
	
}

/*
setInterval("calMethod()",10000);  

function calMethod() {			

	$.ajax({
		url : "chat_receive",
		cache : false,

		

		success : function(data) {
			//alert(data);
		$("#엘리먼트아이디").html(data);

		}

	});

}

*/


$(function() {
   timer = setInterval( function () {
	$.ajax({
		url : "chat_receive",
		cache : false,
		success : function(data) {
			
		$("#chattingroom").html(data);

		}

	});
  }, 5000); // 밀리초 만큼 반복 실행 
});

