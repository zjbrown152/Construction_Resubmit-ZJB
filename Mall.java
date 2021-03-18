/**********************************************************
 * Child class of the Business class.
 * 
 * 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********************************************************/

//Before anything, all variables are declared and what type they are.
public class Mall extends Business
{
	private int RentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	//This empty constructor sets all values to 0 or "" respectively. Also calls the constructor from the Parent class.
	public Mall() 
	{
		super();
		this.RentedUnits=0;
		this.medianUnitSize=0.0;
		this.numParkingSpaces=0;
		
	}

	//The preferred constructor passes parameters through it and sets each value to itself so we know we are working with a value that is only in this class. Also calls the parent preferred constructor.
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.RentedUnits=RentedUnits;
		this.medianUnitSize=medianUnitSize;
		this.numParkingSpaces=numParkingSpaces;
		

	}
	
	
	///Displays all information that would be seen with the Mall class.
	public String displayData()
	{
		StringBuilder m= new StringBuilder();
		m.append("Project Name= "+projectName+"\n");
		m.append("Address= "+completeAddress+"\n");
		m.append("Square Feet= "+totalSquareFeet+"\n");
		m.append("Occupancy Group= "+occupancyGroup+"\n");
		m.append("Subgroup= "+subgroup+"\n");
		m.append("Rented Units= "+RentedUnits+"\n");
		m.append("Unit Size= "+medianUnitSize+"\n");
		m.append("Parking Spaces= "+numParkingSpaces+"\n");
		return m.toString();
	}
		
		
		

//All the getters and setters in the Mall class.
	public int getRentedUnits() {
		return RentedUnits;
	}


	public void setRentedUnits(int rentedUnits) {
		RentedUnits = rentedUnits;
	}


	public double getMedianUnitSize() {
		return medianUnitSize;
	}


	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}


	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}


	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}


	
	
	


	
	
	

}
