
// jquery(제이쿼리) : js 프레임워크
	// $ : 제이쿼리
	

// $(function() { 실행문 ; } ) : 문서 실행 시 무조건 실행되는 함수	
	// js 식			id불러오기  .getElementById( id 명 )
	// jquery 식		id불러오기   $("#id명")
		//  keyup ( ) : 해당 id 에 키보드가 눌렸을 때 [ 입력 되었을 때 ]
	
	
$(function(){ // 문서가 열리면 하기 코드가 실행
	
	// 아이디 체크
	$("#mid").keyup( function(){ // mid 가 입력 될 때 마다 해당 함수 실행
		
		// 1. HTML 태그 내 값 가져오기
	let mid=document.getElementById("mid").value;
	// 2. HTML 태그id 가져오기
	let idcheck = document.getElementById("idcheck");
	
	// 정규 표현식 : 특정한 규칙을 가지는 문자열의 집합 언어
	let idj = /^[a-zA-Z0-9]{5,15}$/; // 한글을 제외한 영문+숫자 5~15 사이의 문자열 
		
		
		//  /^ : 정규 표현식 시작
		//  $/ : 정규 표현식 끝
		//  [a-z] : 소문자 찾음
		//  [A-Z] : 대문자 찾음
		//  [0-9] : 숫자 찾음
		//  {최소길이, 최대길이}: 문자 최소 길이~ 최대 길이 까지만 입력
			// 정규표현식.test( 변수 ) : 해당 변수가 정규표현식에 동일하면 true
			//							다르면 false
	if ( idj.test(mid)){ // 정규 표현식과 같으면
		// 아이디 중복체크
			// 비 동기식 통신 [ 목적 : 페이지 전환 없이 java(controll) 통신 ]
		// $.ajax({속성=속성값, 속성=속성값})// jquery 에서 제공해주는 메소드
		$.ajax({
			url : "../idcheck" , // 통신할 경로(서블릿파일 통신)=> 해당 서블릿의 경로
			data : {"mid":mid} , // 통신 할 때 보내는 데이터 => 해당 경로로 보내는 데이터
			success : function(result){ // 통신 성공 후 반환)받는 데이터 => 해당 경로에서 받은 데이터
		//		alert("java통신");
					// 받은 데이터 확인
			//	alert("java에서 받은 데이터 : " +result);
				if(result==1){
					idcheck.innerHTML="사용중인 아이디"
				}else{
					idcheck.innerHTML="사용가능 아이디"
				}
			}
		}); // ajax end
		
		idcheck.innerHTML = "가능! ";
		
	}else{
		
		idcheck.innerHTML = "영문, 숫자 포함 5~15 길이로 해 줏메";
		
	}	
		
		
	} );


	// 비밀번호 체크
	
	$("#mpassword").keyup(function(){ // 비밀번호를 입력 할 때마다   
	// let mpassword = document.getElementById("mpassword").value; // #1 js식
	let mpassword = $("#mpassword").val(); // #2 jquery 식    #1=#2 과 동일 함   
	let mpasswordcheck = $("#mpasswordcheck").val();
	
	let passwordj = /^[a-zA-z0-9]{5,15}$/;
	
	if (passwordj.test(mpassword)){ // 정규표현식 같으면
		
		if(mpassword != mpasswordcheck){
		// 비밀번호와 비밀번호 체크와 다르면
			// equals(x)         //  !=( o )
		$("#passwordcheck").html("패스워드가 서로 다릇메.")
		
		}else{
			$("#passwordcheck").html("사용 가능 합메.")
			
		}
		
	}else{ // 정규 표현식이 다르면
		$("#passwordcheck").html("영소문자 5~15사이로 입력합메.")
	
	}
	})
	
	
	$("#mpasswordcheck").keyup(function(){ // 비밀번호를 입력 할 때마다   
	// let mpassword = document.getElementById("mpassword").value; // #1 js식
	let mpassword = $("#mpassword").val(); // #2 jquery 식    #1=#2 과 동일 함   
	let mpasswordcheck = $("#mpasswordcheck").val();
	
	let passwordj = /^[a-zA-z0-9]{5,15}$/;
	
	if (passwordj.test(mpasswordcheck)){ // 정규표현식 같으면
		
		if(mpassword != mpasswordcheck){
		// 비밀번호와 비밀번호 체크와 다르면
			// equals(x)         //  !=( o )
		$("#passwordcheck").html("패스워드가 서로 다릇메.")
		
		}else{
			$("#passwordcheck").html("사용 가능 합메.")
			
		}
		
	}else{ // 정규 표현식이 다르면
		$("#passwordcheck").html("영소문자 5~15사이로 입력합메.")
	}
	
}); //(key up end)

	// 이름 체크
	$("#mname").keyup(function(){
		
		let mname = $("#mname").val(); // 해당 id 데이터 가져오기
		let namej= /^[가-힣]{2,10}$/ // 한글만 2~10 정규 표현식
		if(namej.test(mname)){
			$("#namecheck").html("가능!")
		
		}else{
			$("#namecheck").html("힇 2~10사이만 가능!")
	
		}
		
	});
	
	// 전화번호 체크
	$("#mphone").keyup(function(){
		
		let mphone = $("#mphone").val();
		let phonej = /^010-([0-9]{4})-([0-9]{4})$/
		if(phonej.test(mphone)){
			$("#phonecheck").html("가능");
		
		}else{
			$("#phonecheck").html("010-0000-0000 처럼 쓰라");
			
		}
	})
	
	// 이메일 체크
	$("#memail").keyup(function(){
		
		let memail = $("#memail").val();
		let emailj = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i
		if(emailj.test(memail)){
			$("#emailcheck").html("가능");
			let check_email = 1;
		}else{
			$("#emailcheck").html("XXX@XXX.com 처럼 쓰라");
			let check_email = 0;
		}
	})
			
	if( $("#passwordcheck").html==("사용 가능 합메.") &&
		$("#emailcheck").html==("가능")&&
		$("#phonecheck").html==("가능")&&
		$("#namecheck").html==("가능!")&&
		$("#idcheck").html==("사용가능 아이디")){
			alert("건웅");
		}	
			
/*
	if ($("#phonecheck").html==("가능")&&
		$("#emailcheck").html==("가능")&&
		$("#namecheck").html==("가능!")&&
		$("#passwordcheck").html==("사용 가능 합메.")&&
		$("#idcheck").html==( "가능! ")){
			alert("건웅");
	//address1!=null &&address2!=null && address3!=null &&address4!=null &&address5!=null )
	}			
			
	*/		
		
			
			
}) // 문서 열리면 해당 코드 종료 (keyup end)


// 다음 api js
function find_address() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('address1').value = data.zonecode;
                document.getElementById("address2").value = roadAddr;
                document.getElementById("address3").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("address5").value = extraRoadAddr;
                } else {
                    document.getElementById("address5").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }








