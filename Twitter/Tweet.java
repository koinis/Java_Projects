class Tweet
{
	private String handle;				//Account name of the user
	private String text = "";			//Tweet content
	private int retweets = 0;			//Keeps the number of times that a tweet has been retweeted

	
	public Tweet(String handle, String text){
		this.handle = handle;
		this.text = text;
	}
	
	public void display(){				//Prints the "toString result" and the number of retweets
		System.out.println(this);
		System.out.println(retweets + " retweets");
		
	}
	
	public String toString(){			//Returns a string with the handle and the text
		return handle + ":" + text;		
	}
	
	public void setRetweets(int retweets){
		this.retweets = retweets;
	}
	
	public int getRetweets(){
		return retweets;
	}
}