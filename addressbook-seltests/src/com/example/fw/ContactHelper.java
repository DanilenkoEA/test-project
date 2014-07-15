package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void fillContactPage(ContactData contact) {
		type(By.name("lastname"), contact.last_name);
		type(By.name("firstname"), contact.first_name);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.tel_home);
		type(By.name("mobile"), contact.tel_mob);
		type(By.name("work"), contact.tel_work);
		type(By.name("email"), contact.email1);
		type(By.name("email2"), contact.email2);
		selectByText(By.name("bday"), contact.day);
		selectByText(By.name("bmonth"), contact.month);
	    type(By.name("byear"), contact.year);
		//selectByText(By.name("new_group"), contact.group);
	    type(By.name("address2"), contact.second_address);
	    type(By.name("phone2"), contact.second_tel_home);
	}

	public void submitContactCreation() {
	    click(By.name("submit"));
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}
	
	public void initContactEdit(int index) {
		selectContactByIndex(index);
		click(By.xpath(".//*[@id='maintable']/tbody/tr[" + (index+1) + "]/td[7]/a"));
	}
	
	private void selectContactByIndex(int index) {
		click(By.xpath("(//input[@name='selected[]'])[" + index + "]"));
	}
		
	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));	
	}
	
	public void updateContact() {
		click(By.xpath("(//input[@name='update'])[1]"));	
	}

}
