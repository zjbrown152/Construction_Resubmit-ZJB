/**************
 * This class is the child class of Building and the parent class of Apartment as well as the SingleFamilyHome class.
 * @author Zane Brown
 *
 */

//Before anything, all variables are declared and what type they are.
public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//This empty constructor sets all values to 0 or "" respectively. Also calls the constructor from the Parent class.
	public Residential() 
	{
		super();
		this.numBedrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=false;
		
	}
	//The preferred constructor passes parameters through it and sets each value to itself so we know we are working with a value that is only in this class. Also calls the parent preferred constructor.
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
	}
	
	

	
//All the getters and setters in the Residential class.
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	

	


	
	
	

}
