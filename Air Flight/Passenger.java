class Passenger
{
	private int passportNum;		//passport id
	private Flight flight;			//the flight
	
	public Passenger(int passport){
		passportNum = passport;
	}
	
	public void board(Flight flight){			//adds the passenger, if the passenger isn't on the flight
		if (this.flight == null){
			this.flight = flight;
			flight.addPassenger(this);
		}
	}
	
	public void disembark(){					//removes the passenger, if the passenger is already on the flight
		if (flight != null){
			flight.removePassenger(this);
			flight = null;
		}
	}
	
	public String toString(){					//returns a String with the passportNum
		return "Passenger "+passportNum;
	}
}