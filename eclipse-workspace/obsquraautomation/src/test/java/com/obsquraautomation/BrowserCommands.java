package com.obsquraautomation;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String title=driver.getTitle();
		
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.intialiseBrowser();
		browsercommands.browserCommands();
		browsercommands.browserCloseorQuit();
	}

}