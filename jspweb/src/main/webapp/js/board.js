
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

 function filedelete(bno){
		// HTML 에서 JS 로 변수 이동
			// 1. 메소드 인수로 이동
			// 2. 태그의 value 혹은 HTML 이동
		
		
		$.ajax({
				url : "../file_delete" , // 보내는 위치 [ 서블릿 경로 ]
				data : { "bno" : bno } , // 보내는 데이터  { "변수명" : 값 }
				success : function( result ){ // 통신 성공 했을경우 (  result = 받은 값 변수 )
					if(result=="1"){
						alert("첨부파일을 삭제 합니다.")
						location.reload(); // 현재 페이지를 새로고침
					}else{
						alft("첨부파일 삭제 실패[아빠불러와]")
					}
						
					
				}
			});
		
		
	}

