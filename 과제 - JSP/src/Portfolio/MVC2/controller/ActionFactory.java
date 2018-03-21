package Portfolio.MVC2.controller;

import Portfolio.MVC2.controller.action.Action;

public class ActionFactory{
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
		
		return action;
	}
}
