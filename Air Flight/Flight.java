import java.util.ArrayList;
class Flight
{
	private String start;
	private String destination;
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	
	public Flight(String origin, String destination){
		this.start = origin;
		this.destination = destination;
	}
	
	public void addPassenger(Passenger p){			//adds the passenger in the arraylist
		passengers.add(p);
	}
	
	public void removePassenger(Passenger p){		//removes the passenger from the arraylist
		passengers.remove(p);
	}

	public String toString(){						//returns a String with the start, the destination and the list of the passengers
		String ret = "Flight:"+start+"-"+destination+"\n";	
		for (Passenger p: passengers){
			ret += p+"\n";
		}
		return ret;
	}
}