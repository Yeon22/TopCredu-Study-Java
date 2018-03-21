package com.nonage.controller;

import com.nonage.controller.action.Action;
import com.nonage.controller.action.IndexAction;
import com.nonage.controller.action.ProductDetailAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	public ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+command);
		
		if(command.equals("index")) {
			action = new IndexAction();
		}else if(command.equals("product_detail")) {
			action = new ProductDetailAction();
		}
		
		return action;
	}
}
