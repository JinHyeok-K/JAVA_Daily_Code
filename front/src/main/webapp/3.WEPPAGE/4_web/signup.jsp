<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="header.jsp" %>
	<br><br><br><br><br><br>
	<div class="container  ">
		<div class="row ">
		<!-- 좌측 -->
		<div class= "col-md-6  ">
			<div>
				<p>회원가입 및 정상적인 서비스 이용을 위해 아래약관을 읽어보시고,<br>
				동의 여부를 결정해 주세요</p>
				
				<p>필수 약관을 동의 하셔야 회원가입이 가능합니다.</p>
				
				<div>
					<div>
						<div class="row ">
							<div class="col-md-8 text-left" style="border-top: solid 1px gray;">
							<br>
							<h4>회원가입 약관 동의<span style="color: red;">*</span></h4> 
							<textarea rows="10" cols="60" readonly="readonly" > 제 1장 총칙
							
 제 1 조(목적)
본 약관은 국가공간정보포털 웹사이트(이하 "국가공간정보포털")가 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 회원과 국가공간정보포털의 권리, 의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다.
제 2 조(약관의 효력과 변경)
								
 1. 국가공간정보포털은 이용자가 본 약관 내용에 동의하는 경우, 국가공간정보포털의 서비스 제공 행위 및 회원의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.
 2. 국가공간정보포털은 약관을 개정할 경우, 적용일자 및 개정사유를 명시하여 현행약관과 함께 국가공간정보포털의 초기화면에 그 적용일 7일 이전부터 적용 전일까지 공지합니다. 단, 회원에 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 국가공간정보포털은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 회원이 알기 쉽도록 표시합니다.
 3. 변경된 약관은 국가공간정보포털 홈페이지에 공지하거나 e-mail을 통해 회원에게 공지하며, 약관의 부칙에 명시된 날부터 그 효력이 발생됩니다. 회원이 변경된 약관에 동의하지 않는 경우, 회원은 본인의 회원등록을 취소(회원탈퇴)할 수 있으며, 변경된 약관의 효력 발생일로부터 7일 이내에 거부의사를 표시하지 아니하고 서비스를 계속 사용할 경우는 약관 변경에 대한 동의로 간주됩니다.
								

							</textarea>
							<div class="form-check">
								<input type="checkbox" class="form-check-input" > 회원가입 약관 동의 합니다.
							</div>
							<br>
							<div class="col-md-8 text-left" style="border-top: solid 1px gray;">
							<br>
							<h4> 개인정보처리방침<span style="color: red;">*</span></h4> 
							<textarea rows="10" cols="60" readonly="readonly" > 가. 개인정보의 수집 및 이용 목적
① 국가공간정보포털은 다음의 목적을 위하여 개인정보를 처리합니다. 처리하고 있는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며, 이용 목적이 변경되는 경우에는 개인정보 보호법 제18조에 따라 별도의 동의를 받는 등 필요한 조치를 이행할 예정입니다.
1. 국가공간정보포털 서비스 제공을 위한 회원관리
1) 공간정보 다운로드, 오픈API 신청 및 활용 등 포털 서비스 제공과 서비스 부정이용 방지를 목적으로 개인정보를
   처리합니다.

나. 정보주체와 법정대리인의 권리ㆍ의무 및 행사방법
① 정보주체(만 14세 미만인 경우에는 법정대리인을 말함)는 언제든지 개인정보 열람·정정·삭제·처리정지 요구 등의 권리를 행사할 수 있습니다.
② 제1항에 따른 권리 행사는 개인정보보호법 시행규칙 별지 제8호 서식에 따라 작성 후 서면, 전자우편 등을 통하여 하실 수 있으며, 기관은 이에 대해 지체 없이 조치하겠습니다.
③ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다. 이 경우 개인정보 보호법 시행규칙 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.
							</textarea>
							</div>
							
							<div class="form-check">
								<input type="checkbox" class="form-check-input" > 개인정보처리방침 동의 합니다.
							</div>
							
							</div>	
						</div>
					</div>
				</div>
				
				
			</div>
		</div>
		
		<!-- 우측 -->
		
		<div class= "col-md-6 ">
			<form action="">
			<div class="row my-3">
				
					<input type="text" style="height: 50px;"  placeholder="아이디를 입력하세요." placeholder=""  maxlength="50">
			
			</div>
			
			<div class="row my-3">
			
					<input type="password" style="height: 50px;" placeholder="비밀번호를 입력하세요.*" maxlength="50">
				
			</div>
			
			<div class="row my-3">
				
					<input type="password" style="height: 50px;" placeholder="비밀번호를 한번 더  입력하세요.*" maxlength="50">
			
			</div>
			<div class="row my-3">
				
					<input type="text" style="height: 50px;"  placeholder="이름을 입력하세요.*" maxlength="50">
				
			</div>
			
			<div class="row text-center" >
				
					<span><input type="radio" class="form-check-input" name="sex">남자
					<input type="radio" class="form-check-input" name="sex"> 여자</span> 
					
				
			</div>
			
			<div class="row my-3">
				 
					<input type="text"  style="height: 50px;" placeholder="연락처를 입력하세요.*" maxlength="50">
				
			</div>
			
			<div class="row my-3">
				
					<input type="text" style="height: 50px;" placeholder="이메일을 입력하세요.*" maxlength="50">
			
			</div>
			
			<div class="row my-3">
			
					<input type="text"  style="height: 50px;" placeholder="나이를 입력하세요.*" maxlength="50">
			<br>
			</div>
			
			
				<div class="row my-3" >
					<div class="col-md-3">
						주소<span style="color: red;">*</span>
					</div>
					<div class="col-md-6">
						<input type="text" class="form-control"  style="height: 50px;" placeholder="우편번호" >
					<br>	
					</div>
					<div class="col-md-3">
						<button class="form-control"  style="height: 50px;"> 우편번호 찾기</button>
					<br>	
					</div>
					
					<div class="col-md-6 offset-3">
						<input type="text" class="form-control" style="height: 50px;" placeholder="도로명 주소" >
					<br>	
					</div>
					
					<div class="col-md-3">
						<input type="text" class="form-control" style="height: 50px;" placeholder="지번 주소" >
					<br>	
					</div>
					
					<div class="col-md-9 offset-3 ">
						<input type="text" class="form-control" style="height: 50px;" placeholder="상세 주소" >
						
					</div>
				</div>	
				<div >
					<button type="submit"  class="form-control" style="height: 50px;">회원가입</button>
				</div>
				</form>
			</div>
			
		</div>
		</div>
	

	
	<br><br><br><br><br><br>
	<%@include file="footer.jsp" %>
</body>
</html>