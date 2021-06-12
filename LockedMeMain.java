package SimpliLearn.HarshDedhia;

import java.io.IOException;
import java.util.Scanner;

public class LockedMeMain {
	public static void main(String[] args) {
//initializing objects
		SwitchingAlgo user = new SwitchingAlgo();
		Scanner in = new Scanner(System.in);
		String name = new String();
		String path = new String();
		int input = 0;
		int inputItr = 0;
		
//Printing name
		System.out.println("         Welcome to LockedMe!\n A SimpliLearn project by Harsh Dedhia");
		System.out.println("#-------------------------------------#");
		
		MainMenu: while (user.getInputMain() != 3) {			
//Main Menu
			firstLoop: while (!(input == 1 || input == 2 || input == 3)) {
				if ((inputItr % 2) == 0) {SwitchingAlgo.mainMenu();}
				inputItr++;
				input = in.nextInt();
				if((input == 1 || input == 2 || input == 3)) {break firstLoop;} else if(inputItr % 2 == 1) {
					System.out.print(" Your Response was invalid, try again!\n Your Response: ");
				} else {System.out.print(" Your Response was invalid, try again!\n");};
			}
			user.setInputMain(input);
			input = 0;
			inputItr = 0;
			
//Next Menu
			switch (user.getInputMain()) {
//First Menu
			case 1:
				try {
					FileHandler.sortedFileOutput();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println(" Enter some value to go to main menu");
				in.next();
				user.setInputMain(0);
				user.setInputTwo(0);
				user.setInputThree(0);
				break;
				
//Second Menu
			case 2:
				ADSLoop: while (!(input == 1 || input == 2 || input == 3 || input == 4 || input == 5)) {
//4. Go back to Main Menu i.e. Break out of switch and continue to Main Menu
					if ((inputItr % 2) == 0) {
						SwitchingAlgo.secondMenu();
					}
					inputItr++;
					input = in.nextInt();
					if(user.getInputTwo() == 4) {continue MainMenu;}
					if((input == 1 || input == 2 || input == 3 || input == 5)) {break ADSLoop;} else if(inputItr % 2 == 1) {
						System.out.print(" Your Response was invalid, try again!\n Your Response: ");
					} else {System.out.print(" Your Response was invalid, try again!\n");};
				}
				user.setInputTwo(input);
//1. add New File i.e. FileHandler operation
				if(user.getInputTwo() == 1) {
					try {
						System.out.print(" Enter a file name: ");
						name = in.next();
						FileHandler.addNewFile(name);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
//2. Delete Existing File i.e. FileHandler operation
				else if (user.getInputTwo() == 2) {
					System.out.print(" Enter file name to delete: ");
					try {
						name = in.next();
						FileHandler.deleteFile(name);
					} catch (IOException e) {
						e.printStackTrace();
					}
				} 
//3. Search a File i.e. FileHandler operation
				else if (user.getInputTwo() == 3) {
					SwitchingAlgo.searchMenu();
					name = in.next();
					try {
						FileHandler.searchFile(name);
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(" Enter some value to go to main menu");
					in.next();
				}
//5. change Path i.e. FileHandler operation
				else if (user.getInputTwo() == 5) {
					System.out.println(" Path specifies the directory in which to read/write files");
					System.out.print(" Enter a valid file path: ");
					path= in.next();
					FileHandler.changePath(path);
				}
				user.setInputMain(0);
				user.setInputTwo(0);
				user.setInputThree(0);
				input = 0;
				inputItr = 0;
				break;

			case 3:
				user.setInputTwo(0);
				user.setInputMain(3);
				FileHandler.stop();
				in.close();
				System.out.println(" Application closed");
				break MainMenu;
			}
		}		
	}
}
