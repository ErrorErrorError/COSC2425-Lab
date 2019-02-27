package bigcatlist;

import java.util.ArrayList;

import bigcat.BigCat;

public class BigCatListImpl implements BigCatList {

	private ArrayList<BigCat> arrayBigClass = new ArrayList<BigCat>();

	//Returns number of BigCat items in array
	@Override
	public int getSize() {

		// TODO Auto-generated method stub
		
		if (!(arrayBigClass == null))
		{
			return 0; //Returns 0 if there is no items in array
		}
		else
		{
			return arrayBigClass.size(); //returns number of items in array

		}
	}

	//Check if array contains the big cat in the arrray
	@Override
	public boolean contains(BigCat bigcat) {
		// TODO Auto-generated method stub
		
		boolean retval = false;
		for (int i = 0; i < arrayBigClass.size(); i++)
		{
			if(arrayBigClass.get(i).equals(bigcat))
			{
				retval = true;
				break;
			}
			
			else
				
			{
				retval = false;
			}
		}	
		return retval;
	}

	
	//adds bigCat in array if not matched
	@Override
	public boolean add(BigCat bigCat) {
		// TODO Auto-generated method stub
		
		boolean existsInArray = false;
		boolean retval = false;
		
		if (arrayBigClass.size() < BigCatList.MAX_SIZE)
		{
			for (int i = 0; i < arrayBigClass.size(); i++)
			{
				if((arrayBigClass.get(i).equals(bigCat)))
				{
					existsInArray = true;
					break;
				}					
			}
			if (existsInArray = false)
			{
				arrayBigClass.add(bigCat);
			}
			
		}

		
		if (existsInArray == true)
		{
			retval = false;
		}
		
		else
		{
			retval = true;
		}
		
		return retval;
			
	}

	@Override
	public BigCat get(int position) {
		// TODO Auto-generated method stub
		
		if(arrayBigClass.get(position) != null)
		{
			return arrayBigClass.get(position);
		}
		else
		{
			return null;
		}
		
	
	}

	@Override
	public int find(BigCat bigCat) {
		// TODO Auto-generated method stub
		
		int retInt = 0;
		
		for (int i = 0; i < arrayBigClass.size(); i++)
		{
			if (!(arrayBigClass.get(i).equals(bigCat)))
			{
				retInt = -1;
			}
			
			else 
			{
				retInt = i;
				break;
			}
		}
		return retInt;
	}
	

}
