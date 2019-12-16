package sonar.demo.controller;

import sonar.demo.service.DefaultPageService;

public class DefaultPageController {
	
	public void getDefaultPage() {
		DefaultPageService.getDefaultPage();
		System.out.print("dsddssd");
		String test = null;
		System.out.print(test.length());
		//goto:Statement1;
	}

}
