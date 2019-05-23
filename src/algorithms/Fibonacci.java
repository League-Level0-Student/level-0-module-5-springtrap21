package algorithms;

public class Fibonacci {
public static void main(String[] args) {
	int a = 0;
	int z = 1;
	int az = a;
	for (int i = 0; i < 6; i++) {
		System.out.println(a);
		a = a + z;
		System.out.println(z);
		z = a + z;
	}
}
}
//0,1,1,2,3,5,8,13,21,34,55,89