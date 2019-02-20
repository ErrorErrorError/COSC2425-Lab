package myarrays;

import rentalcar.CarMake;
import rentalcar.RentalCar;

public class ArrayMethods {

	public static void insertionSort(int[] list, int numElements) //This sorts the numbers in ascending order.
	{
		for (int index=1; index < numElements; index++)
		{
			int k = index;
			while (k > 0)
			{
				if (list[k] < list[k-1])
				{
					int tempLarge = list[k-1];
					int tempSmall = list[k];
					list[k] = tempLarge;
					list[k-1] = tempSmall;
					k--;
				}
				else
				{
					k = 0;
				}
			}
		}
	}
	
	public static void stringSort(String[] list, int numElements)//This sorts the strings in ascending order.
	{
		
		for (int index=1; index < numElements; index++)
		{
			int k = index;
			while (k > 0)
			{
				if (list[k].compareTo(list[k-1]) < 0)
				{
					String tempLarge = list[k-1];
					String tempSmall = list[k];
					list[k] = tempLarge;
					list[k-1] = tempSmall;
					k--;
				}
				else
				{
					k = 0;
				}
			}
		}
	}
	
	public static void rentalCarVinSort(RentalCar[] list, int numElements) // Sorts vin car ascending
	{
		for (int index=1; index < numElements; index++)
		{
			int k = index;
			while (k > 0)
			{
				if (list[k].getVin().compareTo(list[k-1].getVin()) < 0)
				{
					RentalCar tempLarge = list[k-1];
					RentalCar tempSmall = list[k];
					list[k] = tempLarge;
					list[k-1] = tempSmall;
					k--;
				}
				else
				{
					k = 0;
				}
			}
		}
	}
	
	public static void rentalCarYearSortDescending(RentalCar[] list, int numElements) //it sorts the years of car decending
	{
		for (int index=1; index < numElements; index++)
		{
			int k = index;
			while (k > 0)
			{ 
				if (list[k].getYear() > list[k-1].getYear())
				{
					RentalCar tempSmall = list[k-1];
					RentalCar tempLarge = list[k];
					list[k] = tempSmall;
					list[k-1] = tempLarge;
					k--;
				}
				else if (list[k].getYear() == list[k-1].getYear())
				{
					if (list[k].getMake().compareTo(list[k-1].getMake()) > 0)
					{
						RentalCar tempSmallMake = list[k-1];
						RentalCar tempLargeMake = list[k];
						list[k] = tempSmallMake;
						list[k-1] = tempLargeMake;
						k--;					
					}
				}
				else
				{
					k = 0;
				}
			}
		}
	}
	
	public static void showRentalCarArray(RentalCar[] list, int numElements) //RPrints out the car values
	{
		
		for (int i = 0; i < numElements; i++)
		{
			RentalCar test = list[i];
			
			System.out.println(test);
		
		}
	}
	
	public static String getRentalCarsWithMake(RentalCar[] list, int numElements, CarMake aMake)
	{
		String retVal ="";
		for (int i = 0; i < numElements; i++)
		{
			if (aMake.compareTo(list[i].getMake()) != 0 )
			{
				
			}
		}
		
		
		return retVal;
	}
}
