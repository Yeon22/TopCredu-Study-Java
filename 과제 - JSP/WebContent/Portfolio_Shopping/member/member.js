function go_next(){
	if(document.formm.okon1[0].checked == true){
		document.formm.action = "ShoppingServlet?command=join_form";
		document.formm.submit();
	}else if(document.formm.okon1[1].checked == true){
		alert("약관에 동의하셔야만 다음단계로 이동하실 수 있습니다.\n약관에 동의하여 주시기 바랍니다.");
	}
}

function idcheck(){
	if(document.formm.id.value == ""){
		alert("아이디를 입력하여 주세요.");
		document.formm.id.focus();
		return;
	}
	
	var url = "ShoppingServlet?command=id_check_form&id=" + document.formm.id.value;
	window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=380, height=270");
}

function post_zip(){
	var url = "ShoppingServlet?command=find_zip_num";
	window.open(url, "_black_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=500, top=300, left=300");
}

function go_save(){
	if(document.formm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.formm.id.focus();
	}else if(document.formm.id.value != document.formm.reid.value){
		alert("중복확인을 먼저 확인해 주세요.");
		document.formm.id.focus();
	}else if(document.formm.pwd.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.formm.pwd.focus();
	}else if(document.formm.pwd.value != document.formm.pwdCheck.value){
		alert("비밀번호가 일치하지 않습니다.");
		document.formm.pwdCheck.focus();
	}else if(document.formm.name.value == ""){
		alert("이름을 입력해주세요.");
		document.formm.name.focus();
	}else if(document.formm.email.value == ""){
		alert("이메일을 입력해주세요.");
		document.formm.email.focus();
	}else{
		alert("회원가입이 정상적으로 완료되었습니다.");
		document.formm.action = "ShoppingServlet?command=join";
		document.formm.submit();
	}
}

function FindIdCheck(){
	if(document.formm.name1.value == ""){
		alert("이름을 입력해주세요.");
		document.formm.name1.focus();
	}else if(document.formm.email1.value == ""){
		alert("이메일을 입력해주세요.");
		document.formm.email1.focus();
	}else{
		var url = "ShoppingServlet?command=find_id&name=" + document.formm.name1.value + 
			"&email=" + document.formm.email1.value;
		window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=200");
	}
}

function FindPwdCheck(){
	if(document.formm.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.formm.id.focus();
	}else if(document.formm.name2.value == ""){
		alert("이름을 입력해주세요.");
		document.formm.name2.focus();
	}else if(document.formm.email2.value == ""){
		alert("이메일을 입력해주세요.");
		document.formm.email2.focus();
	}else{
		var url = "ShoppingServlet?command=find_pwd&id=" +document.formm.id.value + "&name=" + document.formm.name2.value + 
			"&email=" + document.formm.email2.value;
		window.open(url, "_blank_1", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=400, height=200");
	}
}
