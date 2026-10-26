//Write a Java Program for room Painting Cost where room is 10X15ft.,two windows a)5X5ft. b)4X4ft., door size is 6X4ft. Labour Cost is Rs.10, Material Cost is Rs.30 .
//Calculate the cost of Painting Room.
public class PaintingCost{
	public static void main(String[] args){
		int PaintableArea,TotalCost, AreaOfRoom, AreaOfWindows, AreaOfDoor,LenR=10, BreR=15,HeigR=10, LenD=6, BreD=4;
		AreaOfRoom=(2*(LenR+BreR)*HeigR)+(LenR*BreR);
		AreaOfWindows= (5*5)+(4*4);
		AreaOfDoor=LenD*BreD;
		PaintableArea= AreaOfRoom-AreaOfWindows-AreaOfDoor;
		TotalCost= PaintableArea*40;
		System.out.println("Area of windows:"+AreaOfWindows);
		System.out.println("Area of door:"+AreaOfDoor);
		System.out.println("Area of 4 walls and celing:"+AreaOfRoom);
		System.out.println("Paintable Area:"+PaintableArea);
		System.out.println("The Painting cost of the room is "+TotalCost);
	}
}
