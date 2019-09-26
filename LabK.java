import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LabK {
	public static char[][][] parking(){
		int x = 3;
		int y = 8;
		int z = 8;
		char[][][] ParkingLot = new char[x][y][z];
		for (int a = 0; a < x; a++){
	          for (int b = 0; b < y; b++){
	              for (int j = 0; j < z; j++) {
	            	  ParkingLot[a][b][j] = 'E';
	          }
		}
		}
            	return ParkingLot;
		}
	public static void main(String[] args){
		int x = 3;
		int y = 8;
		int z = 8;
		Scanner c = new Scanner(System.in);
		char [][][] ParkingLot = parking();
		boolean again = true;
		while (again == true){
			System.out.println("0) Print Map");
			System.out.println("1) Reserve a parking spot");
			System.out.println("2) Parking Lot Guide");
			System.out.println("Please enter a number 0-2 to choose an option");
			int status = c.nextInt();
			switch (status) {
			case 0: System.out.println("You have chosen to print the Map of the Parking Lot");
			System.out.println("0   1   2   3   4   5   6   7");
			for (int a = 0; a < x; a++){
		          for (int b = 0; b < y; b++){
		              for (int j = 0; j < z; j++) {
		            	  if (j == ParkingLot[a].length - 1) {
		            		  
		            		  System.out.println(ParkingLot[a][b][j] + " Floor " + a + " Row " + b);
		            	  }
		            	  
			                else {
			                	System.out.print( ParkingLot[a][b][j] + " | ");
			                }
			          
		              }
		              }
		          }
			break;
			case 1: System.out.println("You have chosen to reserve a parking spot.");
			System.out.println("Please enter the floor that you would like to park in");
			int Floor = c.nextInt();
			System.out.println("Please enter the row that you would like to park at on floor " + Floor);
			int Row = c.nextInt();
			System.out.println("Please enter the column that you would like to park at on floor " + Floor);
			int Column = c.nextInt();
			if(ParkingLot[Floor][Row][Column] == 'R') {
				System.out.println("We're sorry the parking spot has already been taken");
			}
			else {
			ParkingLot[Floor][Row][Column] = 'R';
			System.out.println("You have parked in Parking Spot Number " + Column + Floor + Row);
			System.out.println("0   1   2   3   4   5   6   7");
			for (int a = 0; a < x; a++){
		          for (int b = 0; b < y; b++){
		              for (int j = 0; j < z; j++) {
		            	  if (j == ParkingLot[a].length - 1) {
		            		  
		            		  System.out.println(ParkingLot[a][b][j] + " Floor " + a + " Row " + b);
		            	  }
		            	  
			                else {
			                	System.out.print( ParkingLot[a][b][j] + " | ");
			                }
			          
		              }
		              }
		          }
			}
			break;
			case 2: System.out.println("Parking Lot Guide");
			System.out.println("The parking lot map will show E for the spots that are empty and R for those that are Reserved");
			System.out.println("Parking Spots are numbered by Column number then Floor number then Row number so if a user chooses floor 0 row 0 and column 2 then the parking spot number is 200");
			break;
			}
	}
		}
}