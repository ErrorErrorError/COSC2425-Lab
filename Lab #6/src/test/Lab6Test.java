package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myarrays.ArrayMethods;
import rentalcar.CarMake;
import rentalcar.RentalCar;

class Lab6Test {

	@Test
	void test() {
		String sName="";
		sName = utils.MyUtils.getNameFromStudent();
		System.out.println("Lab#6 Testing for : " + sName);
		testIntSort();
		testStringSort();
		testRentalCarMake();
		testRentalCarSort();
		System.out.println("END of Lab#6 Testing for : " + sName);
	}
	
	private void testRentalCarMake()
	{
		System.out.println("**BEGIN Testing Rental CAR MAKE");
		RentalCar car1 = new RentalCar("9922",  2017, CarMake.CHEVY);
		RentalCar car2 = new RentalCar("9032",  2018, CarMake.TOYOTA);
		RentalCar car3 = new RentalCar("4011",  2013, CarMake.FORD);
		RentalCar car4 = new RentalCar("5933",  2015, CarMake.HONDA);
		RentalCar car5 = new RentalCar("3322",  2013, CarMake.NISSAN);
		RentalCar car6 = new RentalCar("7223",  2018, CarMake.CHEVY);
		RentalCar [] list1 = {car1, car2};
		RentalCar [] list2 = {car1, car2, car3, car4, car5, car6};
		RentalCar [] list3 = {car1, car2, car3, car4, car5, car6};
		RentalCar [] list4 = {car1, car2, car3};
		
		String retString = "";
		String expString = "";
		int numLines = 0;
		int expNum = 0;
		CarMake make = CarMake.CHEVY;
		
		expNum = 1;
		retString = ArrayMethods.getRentalCarsWithMake(list1, 2, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
		
		make = CarMake.CHEVY;
		expNum = 2;
		retString = ArrayMethods.getRentalCarsWithMake(list3, list3.length, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
		
		make = CarMake.TOYOTA;
		expNum = 1;
		retString = ArrayMethods.getRentalCarsWithMake(list3, list3.length, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
		
		make = CarMake.FORD;
		expNum = 1;
		retString = ArrayMethods.getRentalCarsWithMake(list3, list3.length, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
		
		make = CarMake.NISSAN;
		expNum = 1;
		retString = ArrayMethods.getRentalCarsWithMake(list3, list3.length, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
	
		
		make = CarMake.CHRYSLER;
		expNum = 0;
		retString = ArrayMethods.getRentalCarsWithMake(list3, list3.length, make);
		numLines = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, numLines);
		System.out.println("Cars with make: " + make +  " should have " + expNum + "\n" + retString);
		
		System.out.println("**END Testing Rental CAR MAKE");
		
	}

	private void testIntSort() 
	{
		System.out.println("**BEGIN Testing int SORT");
		int [] list =  { 15, 1, 33, 14 };
		System.out.println("Before Sort:");
		utils.MyUtils.showIntArray(list, list.length);

		ArrayMethods.insertionSort(list, list.length);
		for(int i=0; i<list.length-1; i++)
		{
			assertTrue(list[i] <= list[i+1]);
		}
		utils.MyUtils.showIntArray(list, list.length);
		
		
		int [] list2 = { 10, 9, 8, 7, 6};
		System.out.println("Before Sort:");
		utils.MyUtils.showIntArray(list2, list2.length);
		ArrayMethods.insertionSort(list2, list2.length);
		for(int i=0; i<list2.length-1; i++)
		{
			assertTrue(list2[i] <= list2[i+1]);
		}
		utils.MyUtils.showIntArray(list2, list2.length);

		int [] list3 = { 8, 9, 10};
		System.out.println("Before Sort:");
		utils.MyUtils.showIntArray(list3, list3.length);
		ArrayMethods.insertionSort(list3, list3.length);
		for(int i=0; i<list3.length-1; i++)
		{
			assertTrue(list3[i] <= list3[i+1]);
		}
		utils.MyUtils.showIntArray(list3, list3.length);

		int [] list4 = { 222, 20 };
		System.out.println("Before Sort:");
		utils.MyUtils.showIntArray(list4, list4.length);
		ArrayMethods.insertionSort(list4, list4.length);
		for(int i=0; i<list4.length-1; i++)
		{
			assertTrue(list4[i] <= list4[i+1]);
		}
		utils.MyUtils.showIntArray(list4, list4.length);
		
		int [] list5 = { 333};
		System.out.println("Before Sort:");
		utils.MyUtils.showIntArray(list5, list5.length);
		ArrayMethods.insertionSort(list5, list5.length);
		utils.MyUtils.showIntArray(list5, list5.length);
		
		System.out.println("**END Testing int SORT");

	}

	private void testRentalCarSort() 
	{
		System.out.println("**BEGIN Testing RentalCar SORT");
		RentalCar car1 = new RentalCar("9922",  2017, CarMake.CHEVY);
		RentalCar car2 = new RentalCar("9032",  2018, CarMake.TOYOTA);
		RentalCar car3 = new RentalCar("4011",  2013, CarMake.FORD);
		RentalCar car4 = new RentalCar("5933",  2015, CarMake.HONDA);
		RentalCar car5 = new RentalCar("3322",  2013, CarMake.NISSAN);
		RentalCar car6 = new RentalCar("7223",  2018, CarMake.CHEVY);
		RentalCar [] list1 = {car1, car2};
		RentalCar [] list2 = {car1, car2, car3, car4, car5, car6};
		RentalCar [] list3 = {car1, car2, car3, car4, car5, car6};
		RentalCar [] list4 = {car1, car2, car3};
		
		System.out.println("Car array(2 elements only) BEFORE Sort:");
		ArrayMethods.showRentalCarArray(list1, 2);
		ArrayMethods.rentalCarVinSort(list1, 2);
		for(int i=0; i<list1.length-1; i++)
		{
			assertTrue(list1[i].getVin().compareTo(list1[i+1].getVin() )< 0); 
		}
		System.out.println("Car array AFTER Sort:");
		ArrayMethods.showRentalCarArray(list1, 2);
		
		System.out.println("Car array(6 elements only) BEFORE Sort BY VIN:");
		ArrayMethods.showRentalCarArray(list2, list2.length);
		ArrayMethods.rentalCarVinSort(list2, 6);
		for(int i=0; i<list2.length-1; i++)
		{
			assertTrue(list2[i].getVin().compareTo(list2[i+1].getVin() )< 0); 
		}
		System.out.println("Car array AFTER Sort BY VIN:");
		ArrayMethods.showRentalCarArray(list2, list2.length);
		
		System.out.println("Car array(6 elements only) BEFORE Sort BY YEAR/MAKE:");
		ArrayMethods.showRentalCarArray(list3, list3.length);
		ArrayMethods.rentalCarYearSortDescending(list3,  list3.length);
		for(int i=0; i<list3.length-1; i++)
		{
			assertTrue(list3[i].getYear()> list3[i+1].getYear() ||
					   ((list3[i].getYear() == list3[i+1].getYear()) &&
					    (list3[i].getMake().toString().compareTo(list3[i+1].getMake().toString()) < 0)));
		}
		System.out.println("Car array AFTER Sort BY YEAR/MAKE:");
		ArrayMethods.showRentalCarArray(list3, list3.length);
		
		System.out.println("Car array(3 elements only) BEFORE Sort BY YEAR/MAKE:");
		ArrayMethods.showRentalCarArray(list4, list4.length);
		ArrayMethods.rentalCarYearSortDescending(list4,  list4.length);
		for(int i=0; i<list4.length-1; i++)
		{
			assertTrue(list4[i].getYear()> list4[i+1].getYear() ||
					   ((list4[i].getYear() == list4[i+1].getYear()) &&
					    (list4[i].getMake().toString().compareTo(list4[i+1].getMake().toString()) < 0)));
		}
		System.out.println("Car array AFTER Sort BY YEAR/MAKE:");
		ArrayMethods.showRentalCarArray(list4, list4.length);
		
		System.out.println("**END Testing RentalCar SORT");
	}
	

	private void testStringSort() 
	{
		System.out.println("**BEGIN Testing String SORT");
		
		String [] list1 = {"apple", "banana", "orange"};
		String [] list2 = {"grape", "apple", "orange", "banana","kiwi"};
		String [] list3 = {"grape",  "banana"};
		
		System.out.println("Strings before Sorting:");
		utils.MyUtils.showStringArray(list1, 3);
		ArrayMethods.stringSort(list1,  3);
		for(int i=0; i<list1.length-1; i++)
		{
			assertTrue(list1[i].compareTo(list1[i+1]) < 0);
		}
		System.out.println("Strings after Sort:");
		utils.MyUtils.showStringArray(list1,  3);
		
		System.out.println("Strings before Sorting:");
		utils.MyUtils.showStringArray(list2, list2.length);
		ArrayMethods.stringSort(list2,  list2.length);
		for(int i=0; i<list2.length-1; i++)
		{
			assertTrue(list2[i].compareTo(list2[i+1]) < 0);
		}
		System.out.println("Strings after Sort:");
		utils.MyUtils.showStringArray(list2,  list2.length);
		
		System.out.println("Strings before Sorting:");
		utils.MyUtils.showStringArray(list3, list3.length);
		ArrayMethods.stringSort(list3,  list3.length);
		for(int i=0; i<list3.length-1; i++)
		{
			assertTrue(list3[i].compareTo(list3[i+1]) < 0);
		}
		System.out.println("Strings after Sort:");
		utils.MyUtils.showStringArray(list3,  list3.length);
		
		System.out.println("**END Testing String SORT");

	}


}
