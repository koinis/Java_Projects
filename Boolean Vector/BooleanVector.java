import java.util.Random;

class BooleanVector
{
	private int dimension;			//Vector dimension
	private boolean[] vector;		//Array with vector values
	
	
	public BooleanVector(boolean[] values){		//This constructor takes as an argument an Array of boolean values ​​and initializes the fields.
		this.dimension = values.length;			//The constructor copies the values ​​of the Array.
		vector = new boolean[dimension];
		
		for (int i = 0; i < dimension; i ++)
		{
			vector[i] = values[i];
		}
	}
	
	
	public BooleanVector(int dimension){		//This constructor takes as an argument the dimension of the vector and initializes the fields of the class to random values. 
		this.dimension = dimension;				//Also assigns random logical values ​​to the Array values.
		vector = new boolean[dimension];
		Random rnd = new Random();
		
		for (int i = 0; i < dimension; i ++){
			
			vector[i] = rnd.nextBoolean();
		}
	}
	
	
	public String toString()					//Returns a string with the Boolean values separated by gaps.
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < vector.length; i ++){
			sb.append(vector[i]+ " ");
		}
		return sb.toString();
	}
	
	
	public boolean equals(BooleanVector other)		//Checks if two dimensions are equal. They must have the same dimension and all their values same.
	{
		if (this.dimension != other.dimension){
			return false;
		}
		for (int i = 0; i < dimension; i ++){
			if (this.vector[i] != other.vector[i]){
				return false;
			}
		}
		return true;
	}
	
		
	public void and(BooleanVector other)			//This method takes another BooleanVector as an argument and (if it is possible) makes the logic "and" of the values ​​of the two vectors in each dimension.
	{												//The result is saved in the vector which calls the method
		if (this.dimension != other.dimension){
			return;
		}
		for (int i = 0; i < dimension; i ++){
			this.vector[i] = this.vector[i] && other.vector[i];
		}
	}

	public BooleanVector complement()				//This method creates another BooleanVector that is complementary to the present vector (i.e. has complementary values) and returns it.
	{
		boolean[] v = new boolean[this.dimension];
		for (int i = 0; i < dimension; i ++){
			v[i] = !vector[i];
		}

		return new BooleanVector(v);
	}

}