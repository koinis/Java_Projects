class PhotoTweet extends Tweet
{
	private String photo;		//Holds the name of the file with the photo
	
	public PhotoTweet(String handle, String text, String photo){
		super(handle,text);
		this.photo = photo;
	}
	
	
	public String toString(){		//(Method overriding)
		return super.toString() + ", Photo:"+photo;		
	}
}