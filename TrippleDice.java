
public class TrippleDice extends Dice {

	@Override
	
	
	public int Throw()
	{
		int Total;
		int Average;
		
		Total = super.Throw() + super.Throw() + super.Throw();
		
		Average = Total/3;
		
		return Average;
		
	}
	
}
