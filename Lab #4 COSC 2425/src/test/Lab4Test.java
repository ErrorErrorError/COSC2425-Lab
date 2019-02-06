package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import rentalcar.CarMake;
import rentalcar.RentalCar;
//import rentalcar.RentalCarUtilsImpl;

public class Lab4Test {
	public static void main(String []args)
	{
		String expString="";
		String actualString="";

		int expInt = 0;
		int actualInt = 0;
		String sName = utils.MyUtils.getNameFromStudent();
		System.out.println("Testing of Lab4Test for: " + sName);
		utils.MyUtils.printTimeStamp("BEGINS");
		System.out.println("****Testing Constructors and Accessors****");
		RentalCar car1 = new RentalCar();
		System.out.println("car1: " + car1);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);

		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		CarMake expMake = CarMake.TOYOTA;
		CarMake actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);


		car1 = new RentalCar("kk;8*", 2020, CarMake.CHRYSLER);
		System.out.println("car1: " + car1);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(car1.getYear()== expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		expMake = CarMake.CHRYSLER;
		actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);
		car1 = new RentalCar("kkdd33", 2012, CarMake.HONDA);
		System.out.println("car1: " + car1);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1 = new RentalCar("kkdd33", 2013, CarMake.FORD);
		System.out.println("car1: " + car1);
		expInt = 2013;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);

		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		expMake = CarMake.FORD;
		actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);
		System.out.println("**** Testing setters ****");
		car1.setYear(2020);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
		car1.setYear(2014);
		expInt = 2014;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
		car1.setYear(RentalCar.DEFAULT_YEAR);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
		car1.setYear(20);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);
	
		car1.setYear(-1);
		expInt = RentalCar.DEFAULT_YEAR;
		actualInt = car1.getYear();
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt );
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt);

		car1.setVin("111");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("11122");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin(";dlkejeoierpoeijr");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);

		car1.setVin("");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("1#11");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("E99WWE");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("1");
		expString = RentalCar.DEFAULT_VIN;
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("cczz");
		expString = "CCZZ";
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		car1.setVin("a22b");
		expString = "A22B";
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
	
		car1.setVin("4477");
		expString = "4477";
		actualString = car1.getVin();
		if(actualString.equals(expString))
			System.out.println("SUCCESS expected " + expString );
		else
			System.out.println("FAILURE expected " + expString + " but got: " + actualString);
		CarMake aMake = CarMake.FORD;
		car1.setMake(aMake);
		expMake = CarMake.FORD;
		actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);
		aMake = CarMake.HONDA;
		car1.setMake(aMake);
		expMake = CarMake.HONDA;
		actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);
		aMake = CarMake.CHEVY;
		car1.setMake(aMake);
		expMake = CarMake.CHEVY;
		actualMake = car1.getMake();
		if(actualMake.equals(expMake))
			System.out.println("SUCCESS expected " + expMake );
		else
			System.out.println("FAILURE expected " + expMake + " but got: " + actualMake);


		System.out.println("**** Testing toString() ****");
		actualString=car1.toString();
		if(actualString.contains(expString) && actualString.contains(RentalCar.DEFAULT_YEAR+""))
			System.out.println("SUCCESS RentalCar method toString() has proper attribute values in it");
		else
			System.out.println("FAILURE RentalCar method toString() is missing one or more attribute values for RentalCar class");

		System.out.println("Should Receive string such as: " + " VIN: " + car1.getVin() +  " Year: " + car1.getYear() +  
				" Make: " + car1.getMake() +
				"\nActually Received Back string: " + actualString);
		expInt = 0;
		actualInt = utils.MyUtils.numberLines(actualString);
		if(actualInt == expInt)
			System.out.println("SUCCESS expected " + expInt +  " newlines in String returned from toString().");
		else
			System.out.println("FAILURE expected " + expInt + " but got: " + actualInt + " newlines in String returned from toString().");
		expString = "CHEVY";
		actualString = car1.toString();
		if(actualString.contains(expString) && actualString.contains("4477") && actualString.contains(RentalCar.DEFAULT_YEAR+""))
			System.out.println("SUCCESS String returned from toString() has correct attribute values.");
		else
			System.out.println("FAILURE String returned from toString() missing 1 or more attributes.");


		System.out.println("****Testing Complete****");
		utils.MyUtils.printTimeStamp("ENDS");
		System.out.println("End of Testing of Lab4Test for: " + sName);

	}

}

