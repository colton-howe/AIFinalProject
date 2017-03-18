package AIFinalProject.AIFinalProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TwitterAgent {
	
	private HashMap<String, User> users;
	
	public TwitterAgent(){
		
		users = new HashMap<String, User>();
		
	}
	
	public boolean isCustomer(User user){
		
		if(!users.containsKey(user.getUsername())){
			return false;
		}
		
		boolean result = false;
		
		// get decision based on ifProductFrequency
		boolean criteria1 = ifProductFrequency(user);
		
		// here we can add other functions to test user for customership then we can return
		// logical "OR" of these results meaning that if they fulfill one of the functions they are a customer
		// if they fulfill none they are not a customer. We might not even need more functions...
		
		return criteria1;
		
	}
	
	// Functions that determine if someone is a customer or not
	public boolean ifProductFrequency(User user){
		double threshold = 0.2;
		boolean result = false;
		
		// Get user tweets and scan if matches threshold then return true
		for(String tweet: user.getTweets()){
			// add logic that will use TextProcessor
		}
		
		return result;
	}
	
	public void addTrainingData(HashMap<String, User> newUsersData){
		// merge data into this.users hashmap
		
	}
	
	public Set<String> getUsers(){
		return users.keySet();
	}
	
	public User getUser(String key){
		return users.get(key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterAgent ta = new TwitterAgent();
		
		HashMap<String, User> data = new HashMap<String, User>();
		
		List<String> userATweets = Arrays.asList("I love my surface pro!", "I am going on vacation", "linux is also good");
		User joe = new User("@joe", userATweets, 25);
		
		List<String> userBTweets = Arrays.asList("Testing out office", "i love my office pro", "office 360 is good for programmers");
		User kevin = new User("@kevin", userBTweets, 17);
		
		data.put(joe.getUsername(), joe);
		data.put(kevin.getUsername(), kevin);
		
		ta.addTrainingData(data);
		
		
	}

}
