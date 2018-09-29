import java.util.Scanner;

public class startPrinting{
	public static void main(String args[]){
		System.out.print("Enter your input : ");
		Scanner sc = new Scanner(System.in);
		String input = new String();
		input = sc.nextLine();
		int temp = 0b1010; //BINARY
		char demo1 = '\123'; //OCTAL
		char demo2 = '\u0061'; //HEXA
		System.out.println("This was your input : "+input+" "+temp+" "+demo1+" "+demo2);
	}
}
