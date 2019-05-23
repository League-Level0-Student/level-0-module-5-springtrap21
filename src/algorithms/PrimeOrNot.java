package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[]args) {
		boolean prime = true;
		String answer = "";
		
		String sushi = JOptionPane.showInputDialog("Type in a number to see if it's prime or not. . . GET OFF ME!!! YOURE ON ME, GET OFF  ME!!!");
	    int num = Integer.parseInt(sushi);
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
				answer = " not";
			}
		}
		System.out.println(num + " is" + answer + " prime!!");
		JOptionPane.showMessageDialog(null, num + " is" + answer + " prime!!");
	}
}


















