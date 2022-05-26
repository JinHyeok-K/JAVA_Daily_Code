
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

function filedelete( bno ){
	
	// HTML에서 JS 로 변수 이동[통신]
		// 1. 메소드 인수로 이동 
		// 2. 태그의 value 혹은 html 이동  [ $("#bno").val();]
	alert("파일만삭제");
	// 비동기통신 = 페이지 전환이 없는 상태 DB통신 
	// JQUERY라이브러리의 AJAX 사용 
	$.ajax({
		url : "file_delete", /*서블릿통신 */ 
		data : { "bno" : bno }, /* 통신 데이터 : { 변수명 : 값 , 변수명2 : 값  } */
		success : function( result ){
			if( result == "1" ){ 
				alert("첨부파일삭제성공 ");
				location.reload(); // 현재 페이지 새로고침
			}
			else { alert("첨부파일삭제실패[관리자에게문의]")}
		}
		
	});
}

function replywrite( bno ){
	let rcontent = $("#rcontent").val();
	$.ajax({
		url: "replywrite" ,
		data: { "bno":bno , "rcontent" : rcontent  } ,
		success : function( result ){
			if( result == 1 ){
				 alert("댓글작성 되었습니다."); // 성공 메시지 알림 
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
				 /* 해당 replytable 의 불러오기 = replytable */
			}
			else{ alert("댓글작성이 실패했습니다."); }
		}
	});
	
}

function rereplyview( rno , bno , mid ){ // 대댓글 입력창 표시 메소드 
	// ' '  or " "	: 문자처리 	// '문자열' + 변수 + '문자열'
/*	if( mid == null ){ // 로그인 안되어 있으면
		alert("로그인후 작성이 가능합니다."); return;
	} 
	// JS 작성 공간 에서는 HTML 작성 불가능 --> HTML 문자처리 
	*/
	$("#"+rno).html(
		'<div class="row">'+
			'<div class="col-md-10">'+
				'<textarea id="rrcontent" class="form-control" rows=3></textarea>'+
			'</div>'+
			'<div class="col-md-2">'+
				'<button class="form-control py-4 my-1" onclick="rereplywrite('+rno+','+bno+')">대댓글 등록</button>'+
			'</div>'+
		'</div>'
	);	
}
function rereplywrite( rno , bno ){ // 대댓글 쓰기 메소드 
	let rrcontent = $("#rrcontent").val();
	
	$.ajax({
		url : "rereplywrite" , 
		data : { "rno" : rno , "bno" : bno  , "rrcontent" : rrcontent} ,
		success : function( result ){
			if( result == 1 ){
				 alert("대댓글 작성 되었습니다."); // 성공 메시지 알림 
				 $("#rrcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("대댓글작성이 실패했습니다."); }
		}
	});
}


function replydelete( rno ){
	$.ajax({
		url : "replydelete" , 
		data : { "rno" : rno } , 
		success : function( result ){
			if( result == 1 ){
				alert("댓글 삭제 되었습니다.");
				$("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("삭제 실패(관리자에게 문의)"); } 
		}
	});
}

function replyjsupdate( rno,bno,content ){ // 댓글 수정
//let rcontent = $("#rcontent").val();
//function rereplywrite( rno , bno ){ // 대댓글 쓰기 메소드 
	
	$("#"+rno).html(
		'<div class="row">'+
			'<div class="col-md-10">'+
				'<input id="rrcontent" class="form-control" value="'+content+'" rows=3>'+
			'</div>'+
			'<div class="col-md-2">'+
			'<button class="form-control py-4 my-1" onclick="replyupdate('+rno+','+bno+')">수1111정</button>'+
			'</div>'+
		'</div>'
	 	
	);

}

function rereplyjsupdate( rno,bno,rindex, content ){ // 댓글 수정
//let rcontent = $("#rcontent").val();
//function rereplywrite( rno , bno ){ // 대댓글 쓰기 메소드 
	
	$("#"+rno).html(
		'<div class="row">'+
			'<div class="col-md-8">'+
				'<input id="rrrcontent" class="form-control" value="'+content+'" rows=3>'+
			'</div>'+
			'<div class="col-md-2">'+
			'<button class="form-control py-4 my-1" onclick="rereplyupdate('+rno+','+bno+','+rindex+')">수1정</button>'+
			'</div>'+
		'</div>'
	 	
	);

}






function replyupdate( rno , bno ){ // 대댓글 쓰기 메소드 
	let content = $("#rrcontent").val();
	$.ajax({
		url : "../board/replyupdate" , 
		data : { "rno" : rno , "bno" : bno  , "content" : content} ,
		success : function( result ){
			if( result == 1 ){
				 alert("댓글 수정 완료."); // 성공 메시지 알림 
				 $("#rcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("수정실패 아빠불러와."); }
		}
	});
}

function rereplyupdate( rno , bno , rindex ){ // 대댓글 수정 메소드 
	let content = $("#rrrcontent").val();
	
	$.ajax({
		
		url: "rereplyupdate",
		data: {"rno":rno , "bno":bno, "rindex":rindex,"content":content},
			
		success : function(result){
			if( result == 1 ){
				 alert("대댓글 수정."); // 성공 메시지 알림 
				 $("#rrrcontent").val(""); // 작성 input 공백으로 초기화 
				 $("#replytable").load( location.href+" #replytable"); // 특정 태그 새로고침
			}
			else{ alert("수정실패 아빠불러와."); }
		}
	})
	
		
		
		
}



function regist(){
	
	alert("비속어는 사용 할 수 없습니다.");
	
}
