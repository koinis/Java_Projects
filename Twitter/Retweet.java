class Retweet extends Tweet
{
	private Tweet original;
	
	public Retweet(String handle, String text, Tweet original){
		super(handle,text);
		this.original = original;
		original.setRetweets(original.getRetweets()+1);
	}
	
	public Retweet(String handle, Tweet original){		//This constructor initializes the text in the empty String.
		this(handle,"",original);
	}
	
	public String toString(){			//(Method overriding)
		return super.toString() + " RT "+original.toString();		
	}
}