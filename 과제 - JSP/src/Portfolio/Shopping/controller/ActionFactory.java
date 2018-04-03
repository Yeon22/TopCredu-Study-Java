package Portfolio.Shopping.controller;

import Portfolio.Shopping.controller.action.Action;
import Portfolio.Shopping.controller.action.IndexAction;
import Portfolio.Shopping.controller.action.LoginFormAction;
import Portfolio.Shopping.controller.action.ProductDetailAction;

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
		} else if(command.equals("login_form")) {
			action = new LoginFormAction();
		}
		
		return action;
	}
}
