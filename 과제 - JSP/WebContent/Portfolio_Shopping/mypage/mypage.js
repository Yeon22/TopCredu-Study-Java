function go_cart_delete(){
	var count = 0;
	
	if(document.formm.cseq.length == undefined){
		if(document.formm.cseq.checked == true){
			count++;
		}
	}
	
	for(var i = 0; i < document.formm.cseq.length; i++){
		if(document.formm.cseq[i].checked == true){
			count++;
		}
	}
	
	if(count == 0){
		alert("삭제할 항목을 선택해 주세요.");
	}else{
		document.formm.action = "ShoppingServlet?command=cart_delete";
		document.formm.submit();
	}
}

function go_order_insert(){
	if(document.formm.cseq.checked == false){
		alert("주문하실 상품을 선택하여 주시기 바랍니다.");
	}else{
		document.formm.action = "ShoppingServlet?command=order_insert";
		document.formm.submit();
	}
}