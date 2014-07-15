package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactEdit(3);
		ContactData contact = new ContactData();
		contact.address = "new address";
		app.getContactHelper().fillContactPage(contact);
		app.getContactHelper().updateContact();
		app.getContactHelper().returnToHomePage();
	}

}
