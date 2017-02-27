/* By: Cody-Joe Abe
 * 
 *
 * 
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String lineNumber = scanner.nextLine();
		int intLine = Integer.parseInt(lineNumber);
		for(int i = 0; i < intLine; i++){
			String line = scanner.nextLine();
			String[] numbers = line.split(" ");
			int first = Integer.parseInt(numbers[0]);
			int second = Integer.parseInt(numbers[1]);
			int add = first + second;
			int mult = first * second;
			System.out.println(add + " " + mult);
			
		}
	}
}
