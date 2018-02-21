function check(){
	if(document.project_20180221.id.value == ""){
		alert("아이디를 입력해주세요.");
		document.project_20180221.id.focus();
		return false;
	}else if(document.project_20180221.pw.value == ""){
		alert("패스워드를 입력해주세요.");
		document.project_20180221.pw.focus();
		return false;
	}else if(document.project_20180221.name.value == ""){
		alert("이름을 입력해주세요.");
		document.project_20180221.name.focus();
		return false;
	}else if(document.project_20180221.age.value == ""){
		alert("나이를 입력해주세요.");
		document.project_20180221.age.focus();
		return false;
	}else if(isNaN(document.project_20180221.age.value)){
		alert("숫자를 입력해주세요.");
		document.project_20180221.age.focus();
		return false;
	}else if(document.project_20180221.addr.value == ""){
		alert("주소를 입력해주세요.");
		document.project_20180221.addr.focus();
		return false;
	}else{
		return true;
	}
}