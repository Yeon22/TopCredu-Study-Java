package Portfolio.Shopping.controller;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.controller.action.CartDeleteAction;
import Portfolio.Shopping.controller.action.CartInsertAction;
import Portfolio.Shopping.controller.action.CartListAction;
import Portfolio.Shopping.controller.action.CategoryAction;
import Portfolio.Shopping.controller.action.ContractAction;
import Portfolio.Shopping.controller.action.FindIdAction;
import Portfolio.Shopping.controller.action.FindIdPwdFormAction;
import Portfolio.Shopping.controller.action.FindPwdAction;
import Portfolio.Shopping.controller.action.FindZipNumAction;
import Portfolio.Shopping.controller.action.IdCheckFormAction;
import Portfolio.Shopping.controller.action.IndexAction;
import Portfolio.Shopping.controller.action.JoinAction;
import Portfolio.Shopping.controller.action.JoinFormAction;
import Portfolio.Shopping.controller.action.LoginAction;
import Portfolio.Shopping.controller.action.LoginFormAction;
import Portfolio.Shopping.controller.action.LogoutAction;
import Portfolio.Shopping.controller.action.MyPageAction;
import Portfolio.Shopping.controller.action.OrderAllAction;
import Portfolio.Shopping.controller.action.OrderDetailAction;
import Portfolio.Shopping.controller.action.OrderInsertAction;
import Portfolio.Shopping.controller.action.OrderListAction;
import Portfolio.Shopping.controller.action.ProductDetailAction;
import Portfolio.Shopping.controller.action.QnaListAction;
import Portfolio.Shopping.controller.action.QnaViewAction;
import Portfolio.Shopping.controller.action.QnaWriteAction;
import Portfolio.Shopping.controller.action.QnaWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : " + command);
		
		if(command.equals("index")) {
			action = new IndexAction();
		} else if(command.equals("product_detail")) {
			action = new ProductDetailAction();
		} else if(command.equals("category")) {
			action = new CategoryAction();
		} else if(command.equals("login_form")) {
			action = new LoginFormAction();
		} else if(command.equals("login")) {
			action = new LoginAction();
		} else if(command.equals("find_id_pwd_form")) {
			action = new FindIdPwdFormAction();
		} else if(command.equals("find_id")) {
			action = new FindIdAction();
		} else if(command.equals("find_pwd")) {
			action = new FindPwdAction();
		} else if(command.equals("logout")) {
			action = new LogoutAction();
		} else if(command.equals("contract")) {
			action = new ContractAction();
		} else if(command.equals("join_form")) {
			action = new JoinFormAction();
		} else if(command.equals("id_check_form")) {
			action = new IdCheckFormAction();
		} else if(command.equals("find_zip_num")) {
			action = new FindZipNumAction();
		} else if(command.equals("join")) {
			action = new JoinAction();
		} else if(command.equals("cart_list")) {
			action = new CartListAction();
		} else if(command.equals("cart_insert")) {
			action = new CartInsertAction();
		} else if(command.equals("cart_delete")) {
			action = new CartDeleteAction();
		} else if(command.equals("mypage")) {
			action = new MyPageAction();
		} else if(command.equals("order_list")) {
			action = new OrderListAction();
		} else if(command.equals("order_detail")) {
			action = new OrderDetailAction();
		} else if(command.equals("order_insert")) {
			action = new OrderInsertAction();
		} else if(command.equals("order_all")) {
			action = new OrderAllAction();
		} else if(command.equals("qna_list")) {
			action = new QnaListAction();
		} else if(command.equals("qna_view")) {
			action = new QnaViewAction();
		} else if(command.equals("qna_write_form")) {
			action = new QnaWriteFormAction();
		} else if(command.equals("qna_write")) {
			action = new QnaWriteAction();
		}
		
		return action;
	}
}
