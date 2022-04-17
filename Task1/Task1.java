package Task1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Input:");
		String s = stringInput.nextLine();
		int len = s.length();
		System.out.println("The length of the string is " + len);
		int m = (int) Math.sqrt(len);
		System.out.println("The squareroot of the length is " + m);
		System.out.println();
		int count = 0;
		char[][] arr = new char[m][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(count);
				count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("output is:");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[j][i]);
			}
		}

	}

}
