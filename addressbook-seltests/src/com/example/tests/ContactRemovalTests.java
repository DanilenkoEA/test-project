package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	
	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactEdit(3);
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToHomePage();
	}

}
