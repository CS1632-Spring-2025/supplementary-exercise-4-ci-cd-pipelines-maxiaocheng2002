package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	int initializedId = 0;
	String initializedName = null;
	boolean isRented = false;

	public CatImpl(int id, String name) {
		// TODO: Fill in
		initializedId = id;
		initializedName = name;

	}

	public void rentCat() {
		// TODO: Fill in
	
		isRented = true;


	}

	public void returnCat() {
		// TODO: Fill in

		isRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		
		initializedName = name;
	}

	public String getName() {
		// TODO: Fill in
		
		return initializedName;
	}

	public int getId() {
		// TODO: Fill in
	
		return initializedId;
	}

	public boolean getRented() {
		// TODO: Fill in
		
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		
		return "ID " + initializedId + ". " + initializedName;
	}

}