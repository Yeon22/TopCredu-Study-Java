function movieCheck(){
	if(document.frm.name.value.length == 0){
		alert("영화 제목을 입력해주세요.");
		frm.name.focus();
		return false;
	}else if(document.frm.supervisor.value.length == 0){
		alert("감독명을 입력해주세요.");
		frm.supervisor.focus();
		return false;
	}else if(document.frm.actor.value.length == 0){
		alert("출연배우명을 입력해주세요.");
		frm.actor.focus();
		return false;
	}else{
		return true;
	}
}