


$("#incontent").focus(); // 스크립트가 실행 될 때 입력창에 커서 두기


let websocket =null; //js 웹 소켓 변수
start(); // 웹 소켓 실행


// 엔터 입력했을 때 이벤트
function enterkey(mid){    
	if( window.event.keyCode == 13 ){  
		if( mid == 'null' ){
			alert("로그인후 채팅입력이 가능합니다."); return;
		}
		send( mid ); // 메시지 전송 
	} 
}
// 전송 버튼을 눌렀을 때 이벤트
function sendbtn(mid){
		if(mid=='null'){
			alert("로그인 후 채팅 가능"); return;
		}
		send(mid) // 메세지 전송
}

/* 채팅 소켓 실행 */ 

function start(){
	// 자바 스크립트 에서 사용되는 웹 소켓 클래스( ws : URL ) -> (ws ://IP번호:Port번호/프로젝트명/서버소켓이름)
	let mid = $("#mid").val();
	websocket = new WebSocket("ws://localhost:8080/jspweb/chatting/"+mid); //
	websocket.onopen = function(e){ onOpen(e) };
	websocket.onclose =function(e){onClose(e)};
	websocket.onmessage = function(e){onmessage(e)};
	websocket.onerror = function(e){onerror(e)};	
}

function onOpen(){
	alert("서버소켓으로 뛰어들어왔슴다 : "+e) ;
	
}

function onclose(){
	alert("챗방 바이 : "+e );
	
	
}

function onerror(){
	alert(" 서버소켓 에러났따이 : " +e );
	
	
}
function onmessage(e){
//	alert("메세지 받음" +e+"내용물 :" + e.data);
	// e : 메소드 이벤트 실행정보가 담겨있는 객체
		// e.data : 메시지 내용이 담겨있는 필드 
	let msg = JSON.parse( e.data );	 // 문자열 -> json
	
	if(msg["type"] != "1"){ // 메시지 이면
		
		let html = "";
		for(let i =0 ; i<msg.length;i++){
			html +=
		
					'<div class="row p-2">'+
						
						'<div class="col-sm-4">'+
							'<img alt="" src="../img/카톡프로필1.PNG" class="rounded-circle" width="100%">'+ 
						'</div>'+	
						
						'<div class="col-sm-8">'+
							'<div class="member_name"> '+msg[i]["mid"]+' </div>'+
							'<div class="btnbox">'+
								'<span> 귓말 </span>'+
								'<span> 친추 </span>'+
							'</div>'+
						'</div>	'+
						
					'</div>';
			}
			$("#enterlist").html(html);
		
	}else{// 접속자 명단
		
		
		/////
		let from = msg["from"];	// json 키를 통한 value 호출
		let content = msg["content"];	// json 키를 통한 value 호출
		let img = msg["img"];	// json 키를 통한 value 호출
		let date = msg["date"];	// json 키를 통한 value 호출
		
		let html = $("#contentbox").html();	// 기존 html 가져오기
		if( from == $("#mid").val() ){ // 현재 로그인된 아이디와 보낸사람이 같으면
			// 내가 보냈을때 
			html +=
					'<div class="secontent my-3">'+
						'<span class="date"> '+date+' </span>'+
						'<span class="content"> '+content+' </span>'+
					'</div>';
		}else{
			// 다른 사람이 보냈을때 
			html +=	// 기존 html 추가 
				'<div class="row g-0 my-3"> '+
						'<div class="col-sm-1 mx-2">'+
							'<img alt="" src="../img/'+img+';" class="rounded-circle" width="100%" >'+
						'</div>'+
						'<div class="col-sm-9">'+
						'	<div class="recontent">	 '+
								'<div class="member_name"> '+from+' </div>'+
								'<span class="content"> '+content+' </span>'+
								'<span class="date"> '+date+' </span>'+
							'</div>'+
						'</div>'+
					'</div>';
		}
		
		$("#contentbox").html( html ); // 추가된 html 넣어주기
		// 스크롤 하단으로 내리기
		$("#contentbox").scrollTop($("#contentbox")[0].scrollHeight);
		
	} 
	
	
	
	
}

function send(mid){
	//alert("메세지 날림");
	let content =$("#incontent").val();
	// json 형식으로 통신
	let msg = { // js 객체화  // 객체명 = {  속성명(key) : 값(value) , 속성명(key) : 값(value)   }
		type :"1",			// 문자 전송, 접속자 명
		from : mid , 		// 보내는사람 명 
		content : content, 		// 채팅내용
		img : "카톡프로필1.PNG" ,		// 프로필
		date : new Date().toLocaleTimeString() // 채팅 보낸 시간
	}

	// json 통신할때 json모양의 문자열 변환
		// JSON -> 문자열  :  JSON.stringify
		// 문자열 -> JSON  :  JSON.parse( ) 
	
	websocket.send(  JSON.stringify(msg)  ); // json -> 문자열
	$("#incontent").val(""); // 전송후 입력창 초기화
	$("#incontent").focus();	// 전송후 포커스(커서)
	
	
	
}



































/*
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

/*
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

*/
