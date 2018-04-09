function NumFormat(t){ //원 단위 , 찍어주기
	s = t.value;
	s = s.replace(/\D/g,'');
	l = s.length - 3;
	
	while(l > 0){
		s = s.substr(0,l) + ',' + s.substr(l);
		l -= 3;
	}
	t.value= s;
	
	return t;
}

function go_ab(){ // 판매가-원가=순매출을 replace해서 계산해 준다.
	var theForm = document.frm;
	var a = theForm.price2.value.replace(/,/g, '');
	var b = theForm.price1.value.replace(/,/g, '');
	var ab = parseInt(a) - parseInt(b);
	theForm.price3.value = ab;
}

function go_save(){
	var theForm = document.frm;

	if (theForm.kind.value == '') {
		alert('상품분류를 선택하세요.');
		theForm.kind.focus();
	} else if (theForm.name.value == '') {
		alert('상품명을 입력해주세요.');
		theForm.name.focus();
	} else if (theForm.price1.value == '') {
		alert('원가를 입력해주세요.');
		theForm.price1.focus();
	} else if (theForm.price2.value == '') {
		alert('판매가를 입력해주세요.');
		theForm.price2.focus();
	} else if (theForm.content.value == '') {
		alert('상품에 대한 상세 설명을 입력해주세요.');
		theForm.content.focus();
	} else if (theForm.image.value == '') {
		alert('상품이미지들 등록해주세요.');
		theForm.image.focus();
	} else {
		theForm.encoding = "multipart/form-data";
		theForm.price1.value = removeComma(theForm.price1);
		theForm.price2.value = removeComma(theForm.price2);
		theForm.price3.value = removeComma(theForm.price3);

		theForm.action = "ShoppingServlet?command=admin_product_write";
		theForm.submit();
	}
}

function removeComma(input){ // ,을 빼고 값을 다시 넣어준다.
	return input.value.replace(/,/gi, "");
}

function go_mov(){
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_list";
	theForm.submit();
}

function go_search() {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_list";
	theForm.submit();
}

function order_search() {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_order_list";
	theForm.submit();
}

function go_total() {
	var theForm = document.frm;
	theForm.key.value = "";
	theForm.action = "ShoppingServlet?command=admin_product_list";
	theForm.submit();
}

function go_detail(tpage, pseq) {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_detail&tpage=" + tpage + "&pseq=" + pseq;
	theForm.submit();
}

function go_wrt() {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_write_form";
	theForm.submit();
}

function go_list(tpage) {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_list&tpage=" + tpage;
	theForm.submit();
}

function go_mod(tpage, pseq) {
	var theForm = document.frm;
	theForm.action = "ShoppingServlet?command=admin_product_update_form&tpage=" + tpage+"&pseq="+pseq;
	theForm.submit();
}

function go_mod_mov(tpage, pseq) {
	var theForm = document.frm;
	theForm.action = 'ShoppingServlet?command=admin_product_detail&tpage=' + tpage + "&pseq=" + pseq;
	theForm.submit();
}

function go_mod_save(tpage, pseq) {
	var theForm = document.frm;

	if (theForm.kind.value == '') {
		alert('상품분류를 선택하세요');
		theForm.kind.focus();
	} else if (theForm.name.value == '') {
		alert('상품명을 입력해주세요.');
		theForm.name.focus();
	} else if (theForm.price1.value == '') {
		alert('원가를 입력해주세요.');
		theForm.price1.focus();
	} else if (theForm.price2.value == '') {
		alert('판매가를 입력해주세요.');
		theForm.price2.focus();
	} else if (theForm.content.value == '') {
		alert('상품에 대한 상세 설명을 입력해주세요.');
		theForm.content.focus();
	}else {
		if (confirm('수정하시겠습니까?')) {
			if (theForm.useyn.checked == true) {
				theForm.useyn.value = "y";
			}
			if(theForm.bestyn.checked == true) {
				theForm.bestyn.value = "y";
			}
			
			theForm.encoding = "multipart/form-data";
			theForm.price1.value = removeComma(theForm.price1);
			theForm.price2.value = removeComma(theForm.price2);
			theForm.price3.value = removeComma(theForm.price3);		
			
			theForm.action = "ShoppingServlet?command=admin_product_update";
			theForm.submit();
		}
	}
}
