import java.util.Random;

import javax.swing.JOptionPane;

public class review {
public static void main(String[] args) {
	//sayHello();
	//String num = JOptionPane.showInputDialog("Type in a number");
	//int bob = Integer.parseInt(num);
	//highLow(bob);
	//randomNumber1();
	sleep();
}
//finish the methods below




public static void sayHello(){
//Ask the user for their name
String name = JOptionPane.showInputDialog("What is your name?");
//Ask the user for something they like 
String thing = JOptionPane.showInputDialog("What is a thing that you like?");
//print out a mesasage that says "[name] loves [thing]"
JOptionPane.showMessageDialog(null, name + " loves " + thing);
}




//
public static void highLow(int number){
//if number is less than 10 . . .
if (number < 10 ) {
	System.out.println("lower");
}
else {
	System.out.println("higher");
}
    //print lower
    
//else 

    //print higher
}




public static void randomNumber1(){
//use Random to print a number between 0 and 100
	Random rnd = new Random();
	System.out.println(rnd.nextInt(100));
}




public static void randomNumber2(){
//Use Random to print a number between 55 and 105
	Random rnd2 = new Random();
	System.out.println(rnd2.nextInt(105 - 55 + 1)+ 55);
}


//complete the method below
public static void sleep(){

//ask the user for the amount of sleep they got last night
String sleep = JOptionPane.showInputDialog("How much sleep did you get last night?");
int gene = Integer.parseInt(sleep);
if (gene < 6) {
	JOptionPane.showMessageDialog(null, "That's not enough.");
}
else if (gene >= 6) {
	JOptionPane.showMessageDialog(null, "Good job");
} 
else {
	JOptionPane.showMessageDialog(null, "That's to much");
}
//if they said less than 6, tell them "that's not enough"

//else if they said between 6 and 8, tell them "good job"

//else tell them "that's too much"

}




//finish this method so that "even" is printed if the number is even, or "odd" if the number is odd
public static void evenOrOdd(int number){

}


//finish the method so that it asks the user for a number, then uses a for loop to count down to 0 from that number
}

