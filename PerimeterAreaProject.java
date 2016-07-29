import java.util.Scanner;
/**
 * 
 * @author tracydunlop
 *
 */
public class PerimeterAreaProject {

	public static void main(String[] args) {
		// import scanner for user input
		{
			Scanner scan1 = new Scanner(System.in);
			
			String choice = "Y";
			//Define Variables
			float width,length,area,height,perimeter,volume;
			// create while loop for user to continue to enter data
			while (choice.equalsIgnoreCase("Y")) {

				// request input from user
				// assign variable to hold input
				System.out.println("Enter room width: ");
				 width = scan1.nextFloat();

				System.out.println("Enter room length: ");
				 length = scan1.nextFloat();

				System.out.println("Enter room height: ");
				 height = scan1.nextFloat();

				// calculate properties
				 area = width * length;
				 perimeter = 2 * (width + length);
				 volume = width + length + height;

				// display properties
				System.out.println("The area of your room is: " + area);
				System.out.println("The perimeter of your room is: " + perimeter);
				System.out.println("The volume of your room is: " + volume);

				// ask user if they want to continue entering data
				System.out.println("Would you like to continue? Enter Y or N: ");
				//add garbage dump to allow for input
				scan1.nextLine();
				choice = scan1.nextLine();
			}
			scan1.close();
			System.out.println("Goodbye!");
		}
	}
}
