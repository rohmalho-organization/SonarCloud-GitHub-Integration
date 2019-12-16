package sonar.demo.controller;

import sonar.demo.service.DefaultPageService;

public class DefaultPageController {
	
	public void getDefaultPage() {
		DefaultPageService.getDefaultPage();
		System.out.print("dsddssd");
		//goto:Statement1;
	}

}
