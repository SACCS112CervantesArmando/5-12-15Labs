
public class ThreeDice {

	private int sum, num1,num2,num3;
	
	ThreeDice D1 = new ThreeDice();
	ThreeDice D2 = new ThreeDice();
	ThreeDice D3 = new ThreeDice();
	
	public int Throw()
	{
		sum = D1.Throw() + D2.Throw() + D3.Throw();
				return (int) (sum/3);
	
			
	}
}
