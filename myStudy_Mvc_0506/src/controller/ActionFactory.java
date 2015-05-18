package controller;

import java.io.FileInputStream;
import java.util.Properties;

import action.Action;

//// 깃허브 테스트용 주석
public class ActionFactory {
	private static ActionFactory af;
	private Properties prop;
	
	
	public ActionFactory() {
		prop = new Properties();
	}

	public synchronized static ActionFactory getAf(){
		if(af == null) af = new ActionFactory();
		return af;
	}
	
	
	
	public Action getAction(String cmd){
		Action action = null;
		
		try {
			prop.load(new FileInputStream("C:\\kosta97\\webapp\\service\\workspace\\myStudy_Mvc_0506\\src\\controller\\actionInfo"));
			String rpath = prop.getProperty(cmd);
			
			if(rpath == null){
				rpath = "index";
			}
			Class<Action> handlerClass = (Class<Action>) Class.forName(rpath);
			action = handlerClass.newInstance();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return action;
		
	}

}
