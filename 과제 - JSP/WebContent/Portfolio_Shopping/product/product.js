function quantityCheck(){
	if(document.formm.quantity.value <= 0){
		document.formm.quantity.value = 1;
	}
}

function go_cart(){
	if(document.formm.quantity.value == ""){
		alert("수량을 입력하여 주세요.");
		document.formm.quantity.focus();
	}else{
		document.formm.action = "ShoppingServlet?command=cart_insert";
		document.formm.submit();
	}
}

function go_order(){
	alert("My Page로 이동합니다.\n주문을 원하실 경우 장바구니에 담은 후 주문하기를 눌러주시기 바랍니다.");
	document.formm.action = "ShoppingServlet?command=mypage";
	document.formm.submit();
}
