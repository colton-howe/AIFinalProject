package AIFinalProject.AIFinalProject;

import java.util.List;

public class User {
	
	String username;
	List<String> tweets;
	int age;
	
	public User(String username, List<String> tweets, int age){
		this.username = username;
		this.tweets = tweets;
		this.age = age;
	}
	
	public List<String> getTweets(){
		return this.tweets;
	}

	public String getUsername() {
		return this.username;
	}
	
}
