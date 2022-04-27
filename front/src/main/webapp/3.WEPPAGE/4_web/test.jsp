

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
	<!-- 부트 스트랩 css 포함 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<!-- 사용자가 정의한 css 포함 -->
	<link href="css/main.css" rel="stylesheet">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
	<div class="fixed-top bg-white">
		<div class="container ">
			<div class="py-3">
			<!-- 
					p : 안쪽여백
					m : 바깥여백
					py : 위아래 안쪽
					my : 위아래 바같쪽
			 -->
				<div class="row">
					<div class="col-md-4 offset-4 text-center">
												<!-- 부트스트랩 : 텍스트 가운데 정렬 -->
						<a href="main.jsp" class="header_logo">로고</a>
					</div>
					<div class="col-md-4 d-flex justify-content-end">
						<ul class="nav ">
							<li> <a href="#">로그인 | </a></li>
							<li> <a href="#">회원가입 | </a></li>
							<li> <a href="#">장-바구니 </a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="navbar navbar-expand-md navbar-light bg-white">
			<!-- 메뉴 펼치기 버튼 -->
				<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navcl">
					<span class="navbar-toggler-icon"> </span>
				</button>
				
				<div class="collapse navbar-collapse" id="navcl">
					<ul class="navbar-nav col-md-12 justify-content-between">
												<!-- 부트스트랩 : 자동 간격 배치 -->
						<li class="nav-item"><a href="#" class="nav-link">베스트 상품</a></li>
						<li class="nav-item"><a href="#" class="nav-link">슈트</a></li>
						<li class="nav-item"><a href="#" class="nav-link">아우터</a></li>
						<li class="nav-item"><a href="#" class="nav-link">상의</a></li>
						<li class="nav-item"><a href="#" class="nav-link">니트</a></li>
						<li class="nav-item"><a href="#" class="nav-link">셔츠</a></li>
						<li class="nav-item"><a href="#" class="nav-link">바지</a></li>
						<li class="nav-item"><a href="#" class="nav-link">신발</a></li>
						<li class="nav-item"><a href="#" class="nav-link">악세사리</a></li>
						<li class="nav-item"><a href="#" class="nav-link">스타일</a></li>
						<li class="nav-item"><a href="#" class="nav-link">리뷰</a></li>
						<li class="nav-item"><a href="boardList.jsp" class="nav-link">호갱센터</a></li>
						<li class="nav-item"><a href="#" class="nav-link"><i class="fas fa-search"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	
	
	<!-- 부트 스트랩 js 포함 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
	<br><br><br><br><br><br><br><br>
	
	<div class="container">
		<h3 class="text-center"> 회원가입 </h3>
		<div class="titleLine" > </div>
		<br><br>
		<div class="row">
		<div class="col-md-6">
			<div style="border-bottom: solid 2px #eeeeee;border-top: solid 2px #eeeeee; margin:0 auto;
			padding: 5px;">
				<h5> 회원가입 및 정상적인 서비스 이용을 위해 아래 약관 읽어보시고, <br> 동의 여부를 결정하세요 </h5>
				<h5 style="color: gray"> 필수약관을 동의하셔야 회원가입가능  </h5>
			</div>
			<div style="font-size: 30px; margin-top: 10px ;">
				<span >회원가입 약관동의</span> <span style="color: red">*</span>
			</div>
			<div >
				<textarea rows="8" cols="" class="form-control" readonly="readonly" style="resize: none;">제 1장 총칙

제 1 조(목적)

본 약관은 국가공간정보포털 웹사이트(이하 "국가공간정보포털")가 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 회원과 국가공간정보포털의 권리, 의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다.

제 2 조(약관의 효력과 변경)

1. 국가공간정보포털은 이용자가 본 약관 내용에 동의하는 경우, 국가공간정보포털의 서비스 제공 행위 및 회원의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.
2. 국가공간정보포털은 약관을 개정할 경우, 적용일자 및 개정사유를 명시하여 현행약관과 함께 국가공간정보포털의 초기화면에 그 적용일 7일 이전부터 적용 전일까지 공지합니다. 단, 회원에 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 국가공간정보포털은 개정 전 내용과 개정 후 내용을 명확하게 비교하여 회원이 알기 쉽도록 표시합니다.
3. 변경된 약관은 국가공간정보포털 홈페이지에 공지하거나 e-mail을 통해 회원에게 공지하며, 약관의 부칙에 명시된 날부터 그 효력이 발생됩니다. 회원이 변경된 약관에 동의하지 않는 경우, 회원은 본인의 회원등록을 취소(회원탈퇴)할 수 있으며, 변경된 약관의 효력 발생일로부터 7일 이내에 거부의사를 표시하지 아니하고 서비스를 계속 사용할 경우는 약관 변경에 대한 동의로 간주됩니다.</textarea>
			</div>
			<div> 
				<div style="margin-top: 10px; margin-left: 5px;">
					<input type="checkbox" class="form-check-input" style="margin-right: 10px;">
					 회원가입 약관 동의 합니다.
				</div>
			</div>
			
			<div style="border-bottom: solid 2px #eeeeee; width: 100%; margin: 0 auto;
			padding: 20px;">
			</div>
			<div style="font-size: 30px; margin-top: 10px;">
				<span >개인정보 처리방침</span> <span style="color: red">*</span>
			</div>
			<div>
				<textarea rows="8" cols="" class="form-control" readonly="readonly" style="resize: none;">가. 개인정보의 수집 및 이용 목적
① 국가공간정보포털은 다음의 목적을 위하여 개인정보를 처리합니다. 처리하고 있는 개인정보는 다음의 목적 이외의 용도로는 이용되지 않으며, 이용 목적이 변경되는 경우에는 개인정보 보호법 제18조에 따라 별도의 동의를 받는 등 필요한 조치를 이행할 예정입니다.
1. 국가공간정보포털 서비스 제공을 위한 회원관리
1) 공간정보 다운로드, 오픈API 신청 및 활용 등 포털 서비스 제공과 서비스 부정이용 방지를 목적으로 개인정보를
   처리합니다.

나. 정보주체와 법정대리인의 권리ㆍ의무 및 행사방법
① 정보주체(만 14세 미만인 경우에는 법정대리인을 말함)는 언제든지 개인정보 열람·정정·삭제·처리정지 요구 등의 권리를 행사할 수 있습니다.
② 제1항에 따른 권리 행사는 개인정보보호법 시행규칙 별지 제8호 서식에 따라 작성 후 서면, 전자우편 등을 통하여 하실 수 있으며, 기관은 이에 대해 지체 없이 조치하겠습니다.
③ 제1항에 따른 권리 행사는 정보주체의 법정대리인이나 위임을 받은 자 등 대리인을 통하여 하실 수 있습니다. 이 경우 개인정보 보호법 시행규칙 별지 제11호 서식에 따른 위임장을 제출하셔야 합니다.
④ 개인정보 열람 및 처리정지 요구는 개인정보 보호법 제35조 제5항, 제37조 제2항에 의하여 정보주체의 권리가 제한 될 수 있습니다.
⑤ 개인정보의 정정 및 삭제 요구는 다른 법령에서 그 개인정보가 수집 대상으로 명시되어 있는 경우에는 그 삭제를 요구할 수 없습니다.
⑥ 정보주체 권리에 따른 열람의 요구, 정정ㆍ삭제의 요구, 처리정지의 요구 시 열람 등 요구를 한 자가 본인이거나 정당한 대리인인지를 확인합니다.

다. 수집하는 개인정보의 항목
① 국가공간정보포털 회원정보(필수): 이름, 이메일(아이디), 비밀번호

라. 개인정보의 보유 및 이용기간
① 국가공간정보포털은 법령에 따른 개인정보 보유ㆍ이용기간 또는 정보주체로부터 개인정보를 수집 시에 동의 받은 개인정보 보유ㆍ이용기간 내에서 개인정보를 처리ㆍ보유합니다.
1. 국가공간정보포털 회원정보</textarea>
			</div>
			<div> 
				<div style="margin-top: 10px; margin-left: 5px;">
					<input type="checkbox" class="form-check-input" style="margin-right: 10px;">
					 개인정보 처리방침 동의 합니다.
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<form action="">
				<div class="">
					<input type="text" style="height: 50px;" placeholder="아이디를 입력하세요*" class="form-control" >
				</div>
				<div class="my-3">
					<input type="password" style="height: 50px;" placeholder="비밀번호를 입력하세요.*" class="form-control">
				</div>
				<div class="my-3">
					<input type="text" style="height: 50px;" placeholder="한번더 비밀번호를 입력하세요.*" class="form-control">
				</div>
				<div class="my-3">
					<input type="text" style="height: 50px;" placeholder="이름을 입력하세요.*" class="form-control">
				</div>
				<div class="text-center my-3">
					<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"> 남자
	 				<input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1"> 여자
				</div>
				<div class="my-3">
					<input type="text" style="height: 50px;" placeholder="연락처를 입력하세요.*" class="form-control">
				</div>
				<div class="my-3">
					<input type="text" style="height: 50px;" placeholder="이메일을 입력하세요.*" class="form-control">
				</div>
				<div class="my-3">
					<input type="text" style="height: 50px;" placeholder="나이를 입력하세요.*" class="form-control">
				</div>
				<div class="my-3"">
					<div class="row my-3">
						<div class="col-md-4">
							주소<span style="color: red">*</span>
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="우편번호" class="form-control">
						</div>
						<div class="col-md-4">
							<a href="#"> <button class="form-control">우편번호 찾기</button> </a>
						</div>
					</div>
					<div class="row my-3">
						<div class="col-md-4 offset-4">
							<input type="text" placeholder="도로명주소" class="form-control">
						</div>
						<div class="col-md-4">
							<input type="text" placeholder="지번 주소" class="form-control">
						</div>
					</div>
					<div class="row my-3">
						<div class="col-md-8 offset-4">
							<input type="text" placeholder="상세주소" class="form-control" >
						</div>
					</div>
				</div>
				<div class="my-3">
					<button type="submit" class="form-control" style="height: 50px;">회원가입</button>
				</div>
			</form>
		</div>
		</div>
	</div>
	
	<br><br><br><br><br><br><br><br>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

</head>
<body>

	<br>
	<div class="bg-dark text-white">
		<div class="container p-5">
			<div class="row">
				<div class="col-md-4">
					<h3>CUSTOMER SERVICE</h3>
					<p>
					COMPANY N-LINE OWNER LEE JUNGMIN
					
					서울 종로구 율곡로22나길 20-3, 5층 (충신동, 매봉빌딩)
					</p>
				</div>
				<div class="col-md-4">
					<h3> Bank Info</h3>
					<p>반품 배송비 전용 입금계좌
	
						기업 111-111111-11-111
						
						신한 111-111-111111
						
						국민 111111-11-11111
						
						예금주 (주)엔라인
					</p>
				</div>
				<div class="col-md-4">
					<a href="#"> <i class="fab fa-instagram fa-3x"></i> </a>
					<a href="#"> <i class="fab fa-twitter fa-3x"></i> </a>
					<a href="#"> <i class="fab fa-facebook fa-3x"></i> </a>
					<a href="#"> <i class="fab fa-github fa-3x"></i> </a>
					<a href="#"> <i class="fab fa-google fa-3x"></i> </a>
				</div>
			</div>
		</div>
	</div>
	
	
</body>
</html>
	

</body>
</html>