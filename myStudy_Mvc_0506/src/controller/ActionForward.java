package controller;

public class ActionForward {
	
	private String url;  // 이동경로
	private boolean method; // 이동방식
	
	public ActionForward(String url, boolean method) {
		this.url = url;
		this.method = method;
	}

	public String getUrl() {
		return url;
	}
	
	public boolean isMethod() {
		return method;
	}
	
	
	

}
