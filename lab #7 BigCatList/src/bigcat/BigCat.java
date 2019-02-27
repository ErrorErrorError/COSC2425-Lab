package bigcat;
// a BigCat instance has a 4 character (letters and digits only all uppercase) cat id, (String)
//   a cat type (BigCatType) and a weight (int)
//   weight must be >= 0 and <= MAX_WEIGHT
//    
import bigcat.BigCatType;
public class BigCat {
	
	public static final String DEFAULT_ID = "AA00";
	public static final int MAX_WEIGHT = 5000;
	public static final BigCatType DEFAULT_CAT_TYPE = BigCatType.TIGER;
	public static final int DEFAULT_WEIGHT = 0;
	
	private String id;
	private int weight;
	private BigCatType bigCatType;
	
	// constructs a BigCat with default values DEFAULT_ID, weight 0, and BigCatType.TIGER
	public BigCat()
	{
		this.id = DEFAULT_ID;
		this.weight = DEFAULT_WEIGHT;
		this.bigCatType = DEFAULT_CAT_TYPE;
		
	}
	// constructs a BigCat with given values, uses defaults if any received argument is out of range or 
	// incorrect - cat id must be 4 chars, digits and letters only, stored in  ALL UPPERCASE.
	public BigCat(String aId, BigCatType aType, int aWeight)
	{
		setId(aId);
		setWeight(aWeight);
		setCatType(aType);	
	}

	public BigCatType getCatType()
	{
		
		return this.bigCatType; //returns cat type
	}
	public int getWeight()
	{
		return this.weight;  //Returns weight
	} 
	public String getCatId()
	{
		return this.id; //Returns ID
	}
	//override of equals
	// tests that all attributes of a BigCat match received obj
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof BigCat))
			return false;
		BigCat cat = (BigCat) obj;
		if(!(this.getCatId().equals(cat.getCatId())))
			return false;
		if(!(this.getCatType().equals(cat.getCatType())))
			return false;
		if(!( this.getWeight() == cat.getWeight()))
			return false;
		return true;
	}
	// override of hashCode, required since equals is overridden
	// includes id, weight, cat type of this BigCat instance
	public int hashCode()
	{
		int mult = 31;
		int retValue = 19;
		retValue = mult * (retValue + this.getCatId().hashCode());
		retValue  = mult * retValue + this.getCatType().hashCode();
		retValue = mult * retValue  + this.getWeight();
		return retValue;
	}
	// sets weight to received aWeight if valid - 0 <= aWeight <= MAX_WEIGHT
	public void setWeight(int aWeight) 
	{
		
		if (aWeight >= 0 && aWeight <= MAX_WEIGHT)
		{
			this.weight = aWeight;
		}
		
		else
		{
			this.weight = DEFAULT_WEIGHT;
		}
		
	}
	// sets this instance's cat type to received aType
	public void setCatType(BigCatType aType) 
	{
		this.bigCatType = aType;
	}
	
	// tests aId, must be 4 chars all letters and digits only 
	// convert to all uppercase.
	// if invalid aId, sets to DEFAULT_IDs
	public void setId(String aId) 
	{

			if (aId.length() == 4)
			{
				for (int i = 0; i < aId.length(); i++)
				{
					char ch = aId.charAt(i);
					if (!(Character.isLetterOrDigit(ch)))
					{
						this.id = DEFAULT_ID;
						break;
					}
					
					else
					{
						this.id = aId.toUpperCase();
					}
				}
			}
			else 
			{
				this.id = DEFAULT_ID;
			}
				
		
	}
	// returns a nicely formatted spaced String of this instance on 1 line only
	public String toString()
	{
		return  "Cat ID: " + this.id + " Cat's weight: " + this.weight + " Cat Type: " + this.bigCatType;	}
	
	

}
