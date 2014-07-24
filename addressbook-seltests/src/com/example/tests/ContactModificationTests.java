package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
	
	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();

	    //save old state
	    List<ContactData> oldList = app.getContactHelper().getContacts();
	    
	    //actions
		app.getContactHelper().initContactEdit(1);
		ContactData contact = new ContactData();
		contact.last_name = "NAme";
		app.getContactHelper().fillContactPage(contact);
		app.getContactHelper().updateContact();
		app.getContactHelper().returnToHomePage();

	    //save new state
	    List<ContactData> newList = app.getContactHelper().getContacts();
	    
	    //compare states
	    oldList.remove(1);
	    oldList.add(contact);
	    Collections.sort(oldList);
	    assertEquals(newList, oldList);
	}

}
