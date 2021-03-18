/**********************************************************
 * Child class of the Building class, as well as the Parent class of the Mall class.
 * 
 * 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********************************************************/

//Before anything, all variables are declared and what type they are.
public class Business extends Building
{
	protected int numRentableUnits;
	
	//This empty constructor sets all values to 0 or "" respectively. Also calls the constructor from the Parent class.
	public Business()
	{
		super();
		this.numRentableUnits=0;
	}
	
	
	//The preferred constructor passes parameters through it and sets each value to itself so we know we are working with a value that is only in this class. Also calls the parent preferred constructor.
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
		
	}
	
	



// All the getters and setters in the Business class.
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	

}
