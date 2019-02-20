package rentalcar;

public class RentalCar 
{
	
	private String vin;
	private CarMake make;
	private int year;
	
	public static final String DEFAULT_VIN = "0000";
	public static final int DEFAULT_YEAR = 2019;
	
	public RentalCar()
	{
		this.vin = DEFAULT_VIN;
		this.year = DEFAULT_YEAR;
		this.make = CarMake.TOYOTA;
	}
	
	
	public RentalCar(String aVin, int aYear, CarMake aMake)
	{
		//Calls setYear to check for year and set it.
		setYear(aYear);
		
		
		//Calls setVin to check for vin and set it.
		setVin(aVin);
		
		
		//Calls setMake to set car make.
		setMake(aMake);
	}
	
	//This returns the values in one line
	public String toString()
	{
		String retVal = String.format("Vehicle Brand: " + this.make + " Year: " + this.year + " Vin: " + this.vin);
		return retVal;
	}
	
	
	//This returns the vin of this car
	public String getVin()
	{
		String retVal = String.format(this.vin);
		return retVal;
	}
	
	// returns the make of this car
	public CarMake getMake()
	{	
		return this.make;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void setVin(String aVin)
	{
		// Checks for vin//
		if (aVin.length() != 4)
		{
			this.vin = DEFAULT_VIN;
		}
		
		else 
		{
			boolean valid = true; // check whether the length has a valid characte or not
			for (int i = 0; i < aVin.length(); i++)
			{
				char ch = aVin.charAt(i);
				
				if (Character.isLetterOrDigit(ch) == false)
				{
					
					valid = false;
					
				}
				
			}
			
			if (valid != true) //if its not true, it will assing default vin
			{
				this.vin = DEFAULT_VIN;
			}
			
			else
			{
				this.vin = aVin.toUpperCase();
			}
			
		}
	}

	public void setMake(CarMake aMake)
	{
		this.make = aMake;	
	}
	
	
	public void setYear(int aYear)
	{
		//Checks for year //
		if (aYear < 2013 || aYear > 2019) //checks for year if its in valid range
		{
			this.year = DEFAULT_YEAR;
		}
				
		else
		{
			this.year = aYear;
		}
	}


	
}
