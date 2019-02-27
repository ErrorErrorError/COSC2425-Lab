package bigcatlist;

import bigcat.BigCat;
import bigcat.BigCatType;

public interface BigCatList {

	public static final int MAX_SIZE = 15; // max # allowed in the list

	//receives: nothing
	// returns: number of BigCats currently in the list
	//  Example use
	//  BigCatList list = new BigCatListImpl();  // create empty list of BigCat instances
	//   assertTrue(list.getSize() == 0);   // size should be 0
	//  boolean result = list.add(new BigCat("FD39", BigCatType.BOBCAT, 104));
	//  assertTrue(list.getSize() == 1);
	public int getSize();

	// receives: a BigCat instance that is NOT null
	// returns:  true if received bigcat matches any BigCat in this list,
	//          assumes equals is overloaded in BigCat class
	//          returns false if received BigCat is not currently in this list
	public boolean contains(BigCat bigcat);

	//receives: a BigCat instance that is NOT null
	//task:   BigCat is added to this list if not already contained in this list
	//      (house pets must be unique so no two matching pets should be in the list)
	//returns:  true if BigCat was added, false if no room in the list or duplicate
	//      BigCat is found in the list
	//      a BigCat is a duplicate if it is equal to any other BigCat instance
	//      precondition: BigCat overrrides equals method
	//      Example use:
	//        BigCatList list = new BigCatListImpl();
	//        boolean result = list.add(new BigCat("ss88",BigCatType.LION,234));
	//        assertTrue(result == true);
	public boolean add(BigCat bigCat);

	// receives: a position (int) in this house pet list
	// returns: the BigCat in the list at given position.
	//       uses zero-based positions, so 0 is the position of the first house pet in the list
	//       returns null if received position is out of range (0 to less than size of list.)
	//  Example use:
	//        BigCatList list = new BigCatListImpl();
	//        BigCat pet2 = new BigCat("K29Y", BigCatType.CHEETAH, 155));
	//        boolean result = list.add(pet2);
	// 		  BigCat pet1 = list.get(0);
	//        assertTrue(pet1.equals(pet2));
	public BigCat get(int position);

	// receives: a BigCat instance (not null)
	// returns:  the position of received BigCat in the list (0 based positioning)
	//       (uses overloaded equals when matching)
	//       returns -1 if received BigCat is not found in current list at any position
	//        BigCatList list = new BigCatListImpl();
	//        BigCat pet2 = new BigCat("TR83", BigCatType.BOBCAT, 123));

	//        boolean result = list.add(pet2);
	//		  int position = list2.find(pet2);
	//	      assertTrue(position == 0);
	public int find(BigCat bigCat);


	
}



