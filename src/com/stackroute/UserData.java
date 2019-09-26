package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UserData {

	
	public static void main(String[] args) throws UserNotFoundException {

		
		List<User> userdt = new ArrayList<User>();
		
		User user1 = new User("Alex","Smith");
		User user2 = new User("Ian","Smith");
		userdt.add(user1);
		userdt.add(user2);
		
		while(userdt.iterator().hasNext()) {
			boolean goldusernotfound = true;
			if(userdt.iterator().next().getLastname().equalsIgnoreCase("Gold")){
				goldusernotfound = false;
			}
			
			if(goldusernotfound) {
				throw new UserNotFoundException("here is your exception: User is not found as of may 10");
			}
			
		}
		

		
		
		
	}

}

class User{
	
	private String firstname;
	private String lastname;
	
	public User(String firstname,String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}