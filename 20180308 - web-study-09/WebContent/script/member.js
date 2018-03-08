function loginCheck(){
	if(document.frm.userid.value == ""){
		alert("아이디를 입력해주세요.");
		document.frm.userid.focus();
		return false;
	}else if(document.frm.pwd.value == ""){
		alert("암호를 입력해주세요.");
		document.frm.pwd.focus();
		return false;
	}else{
		return true;
	}
}