/**********************************************************
 * Child class of the Residential class.
 * 
 * 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********************************************************/

//Before anything, all variables are declared and what type they are.
public class SingleFamilyHome extends Residential
{
	private boolean garage;
	

	//This empty constructor sets all values to 0 or "" respectively. Also calls the constructor from the Parent class.
	public SingleFamilyHome()
	{
		super();
		this.garage=false;
		
		
	}
	
	
	//The preferred constructor passes parameters through it and sets each value to itself so we know we are working with a value that is only in this class. Also calls the parent preferred constructor.
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		// TODO Auto-generated constructor stub
		this.garage=garage;
	}
	
	
	//Displays all information seen in the SFH class.
	public String displayData()
	{
		StringBuilder sfh= new StringBuilder();
		sfh.append("Project Name= "+projectName+"\n");
		sfh.append("Address= "+completeAddress+"\n");
		sfh.append("Square Feet= "+totalSquareFeet+"\n");
		sfh.append("Occupancy Group= "+occupancyGroup+"\n");
		sfh.append("Subgroup= "+subgroup+"\n");
		sfh.append("Garage= "+garage+"\n");
		return sfh.toString();
		
	}



	





//All the getters and setters in the SFH class.
	public boolean isGarage() {
		return garage;
	}



	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
}





