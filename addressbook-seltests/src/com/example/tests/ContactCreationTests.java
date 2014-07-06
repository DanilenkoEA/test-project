package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{
  @Test
  public void testNonEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().initContactCreation();
	ContactData contact = new ContactData();
	contact.last_name = "Last name 1";
	contact.first_name = "First name 1";
	contact.address = "address 1";
	contact.tel_home = "home 1";
	contact.tel_mob = "mobile 1";
	contact.tel_work = "work 1";
	contact.email1 = "mail 1";
	contact.email2 = "mail 2";
	contact.day = "18";
	contact.month = "July";
	contact.year = "1999";	
	contact.group = "group 1";
	contact.second_address = "address 2";
	contact.second_tel_home = "home 2";
	app.getContactHelper().fillContactPage(contact);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
  
  @Test
  public void testEmptyContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().initContactCreation();
	app.getContactHelper().fillContactPage(new ContactData("", "", "", "", "", "", "", "", "-", "-", "-", "", "", ""));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();
  }
 
  }
