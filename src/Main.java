import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 1. Save the Icon.
		 * 2. read scale n.
		 * 3. for each row of the icon, do following:
		 * 	3.1 scale the row horizontally by n
		 *  3.2 print the scaled row n times.
		 * */
		
		char[][] icon = {{'*', 'x', '*'},{' ', 'x', 'x'},{'*', ' ', '*'}};  // save the icon
		
		/*char[][] icon = new char[3][3];
		icon[0][0] = '*';
		icon[0][1] = 'x';
		icon[0][2] = '*';
		
		icon[1][0] = ' ';
		icon[1][1] = 'x';
		icon[1][2] = 'x';
		
		icon[2][0] = '*';
		icon[2][1] = ' ';
		icon[2][2] = '*';*/
		
		// read scale
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0;i<3;i++) {
			// i is the row index.
			String scaledRow = scaleHorizontally(icon[i], n); // scale the row horizontally
			for (int j=0;j<n;j++)  // print the caled row n times
				System.out.println(scaledRow);
		}
		

	}

	private static String scaleHorizontally(char[] row, int n) {
		// TODO Auto-generated method stub
		/*
		 * 1. For each character in the row, do following:
		 * 	1.1 append the character to the return string n times.
		 * 2. return the string.
		 */
		
		String s = "";  // initialize the return string.
		for (int i=0;i<row.length;i++) { // for each character in the row.
			// i is the index of the character in the row.
			char c = row[i]; // c is the i-th character of the row.
			
			for (int j=0;j<n;j++) { // append c to the string n times
				s += c;
			}
		}
		return s; // return the string.
	}
}
