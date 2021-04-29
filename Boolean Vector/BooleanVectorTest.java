class BooleanVectorTest
{

public static void main(String[] args){
		boolean[] v = {true,false,false};
		BooleanVector rb2 = new BooleanVector(v);
		BooleanVector rb1 = new BooleanVector(3);
		System.out.println(rb1);
		System.out.println(rb2);
		if (rb1.equals(rb2)){
			System.out.println("The two vectors are the same");
		}else{
			System.out.println("The two vectors are different");
		}
		rb1.and(rb2);
		System.out.println(rb1);
		System.out.println(rb2.complement());
	}
}

	