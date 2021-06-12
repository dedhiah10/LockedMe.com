package SimpliLearn.HarshDedhia;

public class SwitchingAlgo {
	private int inputItr = 0;
	private int inputs[] = new int[3];
	
	public SwitchingAlgo() {
		this.inputs[0] = 0;
		this.inputs[1] = 0;
		this.inputs[2] = 0;
	}
	
	public int getInputItr() {
		return inputItr;
	}
	public void setInputItr(int inputItr) {
		this.inputItr = inputItr;
	}
	public void resetInputItr(int inputItr) {
		this.inputItr = 0;
	}	
	
	public int getInputMain() {
		return inputs[0];
	}
	public void setInputMain(int input) {
		this.inputs[0] = input;
	}
	
	public int getInputTwo() {
		return inputs[1];
	}
	public void setInputTwo(int input) {
		this.inputs[1] = input;
	}
	
	public int getInputThree() {
		return inputs[2];
	}
	public void setInputThree(int input) {
		this.inputs[2] = input;
	}
	
	public static void mainMenu (){
		System.out.println("\n Main Menu > Select an option:\n 1. List all files in ascending order.\n 2. add/delete/search files. \n 3. Exit the Application.");
		System.out.println("#-------------------------------------#");
		System.out.print(" Your Response: ");
	}
	public static void secondMenu() {
		System.out.println("\n Main Menu > 2. add/delete/search files. > Select an option:");
		System.out.println(" 1. Add a new File.\n 2. Delete an existing file.\n 3. Search for a file.\n 4. Go back to the Main Menu.\n 5. change filePath?");
		System.out.println("#-------------------------------------#");
		System.out.print(" Your Response: ");
	}
	public static void searchMenu() {
		System.out.println("\n Main Menu > 2. add/delete/search files. > 3. Search for a file.");
		System.out.println("#-------------------------------------#");
		System.out.print(" Enter starting to search for file: ");
	}
}
