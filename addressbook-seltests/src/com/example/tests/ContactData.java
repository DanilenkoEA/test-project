package com.example.tests;

public class ContactData {
	public String last_name;
	public String first_name;
	public String address;
	public String tel_home;
	public String tel_mob;
	public String tel_work;
	public String email1;
	public String email2;
	public String day;
	public String month;
	public String year;
	public String group;
	public String second_address;
	public String second_tel_home;

	public ContactData(String last_name, String first_name, String address,
			String tel_home, String tel_mob, String tel_work, String email1,
			String email2, String day, String month, String year, String group,
			String second_address, String second_tel_home) {
		this.last_name = last_name;
		this.first_name = first_name;
		this.address = address;
		this.tel_home = tel_home;
		this.tel_mob = tel_mob;
		this.tel_work = tel_work;
		this.email1 = email1;
		this.email2 = email2;
		this.day = day;
		this.month = month;
		this.year = year;		
		this.group = group;
		this.second_address = second_address;
		this.second_tel_home = second_tel_home;
	}
	
	public ContactData() {		
	}
}