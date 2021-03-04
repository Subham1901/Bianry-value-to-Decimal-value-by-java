@author Subham
import java.util.Scanner;
public class BinaryToDecimal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Value: ");
		String b=sc.nextLine();
		int d=Integer.parseInt(b,2);
		System.out.println("Decimal is: "+d);
	}
}