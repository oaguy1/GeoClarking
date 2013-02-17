package com.example.geoclarking;

import com.stackmob.sdk.model.StackMobUser;
import java.util.List;

public class User extends StackMobUser {

	private String email;
	private List<User> friends;
	
	public User(String username, String password, String email) {
		super(User.class, username, password);
		this.email = email;
		//incorporate friends here in a bit...
	}
	
	public String getEmail() {
		return email;
	}
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User friend) {
		friends.add(friend);
	}
	
}
