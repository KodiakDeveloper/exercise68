package bookExercises;

import javax.swing.JOptionPane;

public class Ex68 {

	public static void main(String[] args) {

		String userAnswer;

		int lines = 3, column = 6;

		int swap;

		int[][] inventory = new int[lines][column];

		do {

			for (int i = 0; i < lines; i++) {

				inventory[i][0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input ID Product: "));

				inventory[i][1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the product stock: "));

				inventory[i][2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minimum values: "));

				inventory[i][3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input ID Product: "));

				inventory[i][4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the product stock: "));

				inventory[i][5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the minimum values: "));
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (inventory[i][0] > inventory[j][0]) {

						swap = inventory[i][0];

						inventory[i][0] = inventory[j][0];

						inventory[j][0] = swap;

					}

				}
			}

			for (int i = 0; i < lines; i++) {

				for (int j = i + 1; j < lines; j++) {

					if (inventory[i][3] > inventory[j][3]) {

						swap = inventory[i][3];

						inventory[i][3] = inventory[j][3];

						inventory[j][3] = swap;

					}

				}
			}

			System.out.println("ID  | Stock | Min | ID  | Stock | Min");

			System.out.println("---------------------------------------");

			for (int i = 0; i < lines; i++) {
				
				
				System.out.printf("%-4d| %-6d| %-4d| %-4d| %-6d| %-4d\n", inventory[i][0], inventory[i][1],
						inventory[i][2], inventory[i][3], inventory[i][4], inventory[i][5]);
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");

	}

}
