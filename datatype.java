import java.util.Scanner;
public class datatype {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String s1,s2;
	System.out.print("enter S1 : ");  //getting string 1
	s1=sc.nextLine();
	System.out.print("\nenter S2 : ");  //getting string 2
	s2=sc.nextLine();
	boolean same=false;   // defaultly it set false
if (s1.equals(s2))    // if both same replace with true
	same=true;    

System.out.print(same);
}
}
