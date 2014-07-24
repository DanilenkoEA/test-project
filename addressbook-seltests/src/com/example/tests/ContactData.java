package com.example.tests;

public class ContactData implements Comparable<ContactData>{
	public String first_name;
	public String last_name;
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

	@Override
	public String toString() {
		return "ContactData [last_name=" + last_name + "]";
	}
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result
				//+ ((last_name == null) ? 0 : last_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		   int lastNameResult = this.last_name.toLowerCase().compareTo(other.last_name.toLowerCase());
		   if (lastNameResult != 0) {
		     return lastNameResult;
		   } else {
		     return this.first_name.toLowerCase().compareTo(other.first_name.toLowerCase());
		   }
		 }
	
}