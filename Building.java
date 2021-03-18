/**********************************************************
 * Parent class for Business and Residential classes
 * 
 * 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********************************************************/

//Before anything, all variables are declared and what type they are.
public class Building 
{
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	///Sets all values to "" or 0 respectively.
	public Building()
	{
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subgroup="";
	}
	//The preferred constructor passes parameters through it and sets each value to itself so we know we are working with a value that is only in this class.
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
		String subgroup) 
	{
		
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
		
		
		
///Will tell us what class the data is coming from when instantiated. Uses getter to get info.
		public void draw()
		{
			System.out.println("Creating code for: "+getClass());
			
			
		}

////Displays all data seen when a building is instantiated.
public String displayData()
{
	StringBuilder b=new StringBuilder();
	b.append("Project Name: "+projectName+"\n");
	b.append("Address: "+completeAddress+"\n");
	b.append("Square Feet: "+totalSquareFeet+"\n");
	b.append("Occupancy Group: "+occupancyGroup+"\n");
	b.append("Occupancy Subgroup: "+subgroup+"\n");
	
	return b.toString();
	
	
}


//// All of the getters and setters for the Business class.
public void setProjectName(String projectName) 
{
	this.projectName = projectName;
}

public String getCompleteAddress() 
{
	return completeAddress;
}

public void setCompleteAddress(String completeAddress) 
{
	this.completeAddress = completeAddress;
}

public double getTotalSquareFeet() 
{
	return totalSquareFeet;
}

public void setTotalSquareFeet(double totalSquareFeet) 
{
	this.totalSquareFeet = totalSquareFeet;
}

public String getOccupancyGroup() 
{
	return occupancyGroup;
}

public void setOccupancyGroup(String occupancyGroup) 
{
	this.occupancyGroup = occupancyGroup;
}

public String getSubgroup() 
{
	return subgroup;
}

public void setSubgroup(String subgroup) 
{
	this.subgroup = subgroup;
}

public String getProjectName() 
{
	return projectName;
}


}