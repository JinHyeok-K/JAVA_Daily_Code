/* -------- 카테고리 버튼 눌렀을때 함수(이벤트) ------- */


function categorybtn(){
	// 특정태그의 HTML 넣기 
	$("#categoryinput").html(
		'<div class="row">'+
		'<div class="col-md-5">'+'<input class="form-control" type="text" id="cname">'+'</div>'+
		'<div class="col-md-5">'+'<button class="form-control" onclick="categoryadd()" type="button">등록</button>'+'</div>'+
		'</div>'
	)
}
/* -----------------------------------------*/
/* -------- 카테고리 등록 눌렀을때 함수(이벤트) ------- */
function categoryadd(){
	let cname = $("#cname").val();		/* 해당 입력값 가져오기 */ 
	$.ajax({							/* 비동기 통신 */
		url : "categoryadd" , 			/* 서블릿 URL 매핑 */
		data : { "cname" : cname } ,	/* 보내는 데이터 : 카테고리명 */
		success : function( result ){	/* 통신 성공시 받는 데이터 */
			if( result == 1 ){  
				alert("카테고리추가"); 
				$("#categoryinput").html(" ");
				getcategory();
			}
			else{ alert("카테고리실패"); }
		}
	});
}
/* -------- -------------------------- ------- */

$( function category(){ 	// $( 함수(){ 실행코드 }); : js 열람시 실행되는 함수 
	getcategory();
});


/* --------  카테고리 호출 -------------------------- ------- */
//$(함수(){실행코드});  : js 열람시 실행되는 함수

function getcategory(){
	$.ajax({ 
		url : "getcategory" , 
		success : function( re ){
			$("#categorybox").html(re);
		}
	});
};

/* --------  form 전송 = multipart -------------------------- ------- */

function productadd(){


	var form = $("#addform")[0]; // 폼 태그 id 호출 [0]번째 인덱스 호출 
	var formData = new FormData(form); // js 지원하는  FormData 클래스를 이용한 form 태그 객체화
    
// ajax 기본적으로 문자열 전송한다. 인코딩 URL 타입 : application/x-www-form-urlencoded
	$.ajax({
		
		url : "productadd",
		type : 'post', /* type : 1.GET(기본타입) 2.POST(첨부파일 사용시,보안용) */
		data : formData,
		
		contentType : false, // 전송 시 문자열 타입 X		 
		// 전송 시 내용물 타입 : URL 
		// String 방식 : https://gall.dcinside.com/mgallery/board/view/?id=pathofexile
		// 첨부파일은 String으로 변환하여 인코딩 X
		// contentType : true : URL 인코딩 타입 문자열 O [기본타입]
		// contentType : false : URL 인코딩 타입 문자열 X
		processData : false, // 전송 시 문자열 전송 X
		// html 에서 enctype="multipart/form-data" 사용하려면
		// ajax 에서 contentType: false, processData : false 
		
		success : function(re){
			if( re == 1){
				alert(" 등록이 되었습니다. "); 
				form.reset(); 	/* form안에 적혀있는 내용 지우기 */
			}else{
				alert(" 아빠불러와 ");
			}
		}
		
	});
	
}

/* -------- -------------------------- ------- */


/********* 첨부파일이 변경되면 특정태그에 첨부파일 이미지 표시 *******/
/* js : 객체지향 언어 */
$("#pimg").change( function( e ) { 
	/* 클라이언트가 업로드시 업로드파일의 경로 알기 */
	let reader = new FileReader();	/* 파일 읽어오는 클래스 */
	reader.readAsDataURL( e.target.files[0] ); /* readAsDataURL( 파일 ); 해당 파일 경로 찾기 */
	reader.onload = function( e ){	/* 찾은 파일의 경로 실행 -> 데이터 읽어오기 */
		$("#preview").attr( "src" , e.target.result );
	}
});
	/* 
		$("#pimg").val() 사용시 -> 경로를 알수 없다.
			C:\fakepath\18233_103_1.jpg
		-클라이언트가 사진을 업로드시
			js가 클라이언트의 경로를 알수가 없다
	*/
	/* e : change 된 객체 */
	/* e.target :  객체.target() -> html 태그 */
	/* e.target.files[0] : 객체내 파일 */
	
/* -------- --------------------------- */












