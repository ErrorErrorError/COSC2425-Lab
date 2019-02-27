package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import bigcat.BigCat;
import bigcat.BigCatType;
import bigcatlist.BigCatList;
import bigcatlist.BigCatListImpl;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bigcat.BigCat;
import bigcat.BigCatType;
import bigcatlist.BigCatList;
import bigcatlist.BigCatListImpl;

class Lab7Test {

@Test
	void test() {
	String sName = "";
	    sName = utils.MyUtils.getNameFromStudent();
	    System.out.println("Testing LAB 7 for: " + sName);
		testBigCat();
		testAddContains();
		testFindGet();
		System.out.println("COMPLETED Testing LAB 7 for: " + sName);
	}

	private void testFindGet() {
		System.out.println("Now testing methods find/get in BigCatList interface");
		BigCatList list = new BigCatListImpl();
		BigCat pet1 = new BigCat("CK39",  BigCatType.LION, 300);
		BigCat pet2 = new BigCat("44RR", BigCatType.BOBCAT, 150);
		BigCat pet3 = new BigCat("DR93",  BigCatType.CHEETAH, 180);
		int expNum = 0, retNum = 0;
		assertFalse(list.contains(pet1));
		assertFalse(list.contains(pet2));
		boolean result = list.add(pet1);
		assertTrue(result);
		assertEquals(1, list.getSize());
		assertEquals(0, list.find(pet1));
		assertEquals(pet1, list.get(0));
		String retString = list.toString();
		assertTrue(list.add(pet2));
		assertEquals(2, list.getSize());
		assertEquals(1, list.find(pet2));
		assertEquals(pet2, list.get(1));
		assertEquals(-1, list.find(pet3));
		assertEquals(null, list.get(-3));
		assertEquals(null, list.get(2));
		assertEquals(null, list.get(BigCatList.MAX_SIZE));
		retString = list.toString();
		assertEquals(2, utils.MyUtils.numberLines(retString));
		
		System.out.println("Current list of 2 cats: \n" + list);
		System.out.println("END testing methods find/get in BigCatList interface");

	}

	private void testAddContains() 
	{
		System.out.println("Now testing methods add/contains in BigCatList interface");
		BigCatList list = new BigCatListImpl();
		BigCat pet1 = new BigCat("CK39",  BigCatType.LION, 300);
		BigCat pet2 = new BigCat("44RR", BigCatType.BOBCAT, 150);
		BigCat pet3 = new BigCat("DR93",  BigCatType.CHEETAH, 180);
		int expNum = 0, retNum = 0;
		assertFalse(list.contains(pet1));
		assertFalse(list.contains(pet2));
		boolean result = list.add(pet1);
		assertTrue(result);
		assertEquals(1, list.getSize());
		assertTrue(list.contains(pet1));
		String retString = list.toString();
		assertTrue(retString.contains("LION"));
		assertTrue(retString.contains("CK39"));
		assertTrue(retString.contains("300"));

		assertFalse(list.contains(pet2));
		assertFalse(list.contains(pet3));
		assertTrue(list.add(pet2));
		assertEquals(2,  list.getSize());
		assertTrue(list.contains(pet2));
		assertFalse(list.contains(pet3));
		assertTrue(list.contains(pet1));
		assertTrue(list.add(pet3));
		assertTrue(list.getSize()==3);
		assertFalse(list.add(pet1));
		assertFalse(list.add(pet2));
		assertFalse(list.add(pet3));

		BigCat pet4 = new BigCat("CK39", BigCatType.LION, 300);
		BigCat pet5 = new BigCat("JM34", BigCatType.LEOPARD, 200);
		assertFalse(list.add(pet4));
		assertTrue(list.contains(pet4));
		expNum = 3;
		retNum = list.getSize();
		assertEquals(expNum, retNum);
		expNum = 3;
		retString = list.toString();
		retNum = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, retNum);
		System.out.println("here is the current list, should have " + expNum + " BigCats\n" + list);
		assertTrue(list.add(pet5));
		expNum = 4;
		assertEquals(expNum, list.getSize());
		retString = list.toString();
		retNum = utils.MyUtils.numberLines(retString);
		assertEquals(expNum, retNum);
		retString = list.toString();
		assertTrue(retString.contains("LION"));
		assertTrue(retString.contains("LEOPARD"));
		System.out.println("Current Big Cats in list: \n" + list);
		System.out.println("END testing methods add/contains in BigCatList interface");
	}

	private void testBigCat() 
	{
		System.out.println("Now testing methods in BigCat class");
		BigCat pet1 = new BigCat("CK39",  BigCatType.LION, 300);
		BigCat pet2 = new BigCat("%$$#", BigCatType.BOBCAT, 150);
		BigCat pet3 = new BigCat("",  BigCatType.CHEETAH, 180);
		BigCat pet4 = new BigCat("93ER", BigCatType.LION, -1);
		String expString = "CK39";
		String retString = pet1.getCatId();
		assertEquals(expString, retString);
		int expWt = 300;
		int retWt = pet1.getWeight();
		assertEquals(expWt, retWt);
		retString = pet1.toString();
		expString = "CK39";
		assertTrue(retString.contains(expString));
		expString = "LION";
		assertTrue(retString.contains(expString));
		expString = "300";
		assertTrue(retString.contains(expString));
		
		expString = BigCat.DEFAULT_ID;
		retString = pet3.getCatId();
		assertEquals(expString, retString);
		
		expString = BigCat.DEFAULT_ID;
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		pet2.setId("();(");
		expString = BigCat.DEFAULT_ID;
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		pet2.setId("2244");
		expString = "2244";
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		pet2.setId("ZZZZ");
		expString = "ZZZZ";
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		pet2.setId("224");
		expString = BigCat.DEFAULT_ID;
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		pet2.setId("K1");
		expString = BigCat.DEFAULT_ID;
		retString = pet2.getCatId();
		assertEquals(expString, retString);
		
		expWt = 0;
	    retWt = pet4.getWeight();
		assertEquals(expWt, retWt);
		pet4.setWeight(5001);
		retWt = pet4.getWeight();
		assertEquals(expWt, retWt);
		expWt = BigCat.MAX_WEIGHT;
		pet4.setWeight(expWt);
		retWt = pet4.getWeight();
		assertEquals(expWt, retWt);
		pet4.setWeight(BigCat.MAX_WEIGHT+100);
		retWt = pet4.getWeight();
		assertEquals(0, retWt);
		retString = pet1.toString();
		expString = "CK39";
		assertTrue(retString.contains(expString));
		expString = "LION";
		assertTrue(retString.contains(expString));
		expString = "300";
		assertTrue(retString.contains(expString));
		
		BigCatType expType = BigCatType.LION;
		BigCatType retType = pet4.getCatType();
		assertEquals(expType, retType);
		
		pet4.setCatType(BigCatType.CHEETAH);
		expType = BigCatType.CHEETAH;
	    retType = pet4.getCatType();
		assertEquals(expType, retType);
		
		System.out.println("Now testing equals() and hashCode() methods for BigCat");
		
		BigCat pet5 = new BigCat("CK39", BigCatType.LION, 300);
		BigCat pet6= new BigCat("CK67", BigCatType.BOBCAT, 300);
		BigCat pet7 = new BigCat("KK34", BigCatType.TIGER, 200);
		
	    pet1 = new BigCat("CK39",  BigCatType.LION, 300);
	    assertEquals(pet5, pet1);
	    assertEquals(pet1, pet5);
	    int hc1 = pet1.hashCode();
	    int hc2 = pet5.hashCode();
	    assertEquals(hc1, hc2);
	    assertFalse(pet5.equals(pet6));
	    assertEquals(pet5, pet5);
	    assertEquals(pet1, pet5);
	    pet6.setCatType(BigCatType.LION);
	    pet6.setWeight(300);
	    assertFalse(pet5.equals(pet6));
	    pet6.setId("CK39");
	    assertEquals(pet5, pet6);
	    assertEquals(pet5.hashCode(), pet6.hashCode());
	    BigCat pet8 = new BigCat();
	    BigCat pet9 = new BigCat();
	    assertEquals(pet8, pet9);
	    assertEquals(pet8.hashCode(), pet9.hashCode());
	    System.out.println("pet8's hashCode: " + pet8.hashCode() 
	                     + "\npet9's hashCode: " + pet9.hashCode());
	    assertEquals(pet8.getCatId(), BigCat.DEFAULT_ID);
	    assertEquals(pet8.getCatType(), BigCatType.TIGER);
	    System.out.println(pet5);
	    System.out.println(pet6);
	    System.out.println(pet7);
	    System.out.println(pet8);
	    System.out.println("END  testing class BigCat");

	}

}
