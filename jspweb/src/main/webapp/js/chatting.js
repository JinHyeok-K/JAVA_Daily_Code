
 // 문서 열렸을때 실행 함수 무조건 실행
 $(document).ready( function(){
	 $('#summernote').summernote({
    	placeholder: '내용 입력',
    	tabsize: 2,
   	 	minHeight : 250 , // 최소 높이
   	 	maxHeight : null , // 최대 높이 
   	 	lang : 'ko-KR'	// 메뉴 한글 버전 
	  });
});


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
			alert(data);
		$("#엘리먼트아이디").html(data);

		}

	});
  }, 500); // 밀리초 만큼 반복 실행 
});

